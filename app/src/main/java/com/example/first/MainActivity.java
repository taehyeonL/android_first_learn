package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et_id=findViewById(R.id.et_id);
        btn_test=findViewById(R.id.btn_text);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_id.setText("이태현");
            } // 버튼을 누르면 이태현이 입력됩니다.
        });

    }
}