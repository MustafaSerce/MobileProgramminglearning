package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloworldtext;
    Button modifybutton;
    Button changecolorbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloworldtext = findViewById(R.id.textView);
        modifybutton = findViewById(R.id.btn_modfy);
        changecolorbtn = findViewById(R.id.changecolor);

        modifybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloworldtext.setText("My First Code ! ");
                helloworldtext.setText("My 1.1 code");
            }

        });

    }
}