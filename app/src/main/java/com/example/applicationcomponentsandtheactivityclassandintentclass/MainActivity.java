package com.example.applicationcomponentsandtheactivityclassandintentclass;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private static final int REQUEST_CODE_STATUS = 0;
 private int i =0;
 private EditText editText;
 private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editTextTextPersonName);
        String name = getIntent().getStringExtra("name");
        editText.setText(name);


       textView= findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TestActivity.class);
                startActivityForResult(intent,REQUEST_CODE_STATUS);


            }
        });

//        if (savedInstanceState != null){
//        بديل عن الأون ريستور هاد
//            i = savedInstanceState.getInt("counter");
//        }
        Object object =getLastNonConfigurationInstance();
        if (object != null){
            i = (int) object;
        }
        textView.setText(String.valueOf(i));

    }
    // الاون ريتين هاد بستعملها بدل الاون سيف لمن بدي أحتفظ باشي كبير زي البيت ماب
    @Nullable
    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return i;
    }

    public void Save(View view) {
        textView.setText(String.valueOf(++i));
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("counter", i);
//    }

//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        i =savedInstanceState.getInt("counter");
//        textView.setText(String.valueOf(i));
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CODE_STATUS){
            if (resultCode==RESULT_OK){
                Toast.makeText(this, data.getStringExtra("status"), Toast.LENGTH_SHORT).show();
            }
        }
    }


}