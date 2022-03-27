package com.example.android_week_06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


private Button btn_01, btn_02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_01=findViewById(R.id.btn_Frag_01);
        btn_02=findViewById(R.id.btn_Frag_02);



    }
}