package com.game.shaik.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button plus_cap,minus_cap;
    Button total;
    TextView texttotal;
    EditText edit_cap;

    int no_cap;

    int total_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no_cap=0;

        total_sum=0;

        plus_cap=findViewById(R.id.plus_cap);

        minus_cap=findViewById(R.id.minus_cap);


        total=findViewById(R.id.submit);

        texttotal=findViewById(R.id.total);

        edit_cap=findViewById(R.id.number_cap);

        edit_cap.setText(no_cap+"");



        plus_cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ++no_cap;

                edit_cap.setText(no_cap+"");


            }
        });


        minus_cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(no_cap==0)
                {}
                else{
                --no_cap;}



               // edit_cap.setText(no_cap+"");

asdfsdf
            }
        });


        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttotal.setText(no_cap*10+"");
            }
        });


    }
}
