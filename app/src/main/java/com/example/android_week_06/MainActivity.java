package com.example.android_week_06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

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


        Fragment Fragment_01 = new Fragment_01();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.flfragment,Fragment_01);
        transaction.addToBackStack(null);
        transaction.commit();

        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment Fragment_01 = new Fragment_01();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.flfragment,Fragment_01);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment Fragment_02 = new Fragment_02();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.flfragment,Fragment_02);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}