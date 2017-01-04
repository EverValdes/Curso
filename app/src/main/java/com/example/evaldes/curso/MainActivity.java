package com.example.evaldes.curso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button execise1;
    private Button execise2;
    private Button execise3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        execise1 = (Button) findViewById(R.id.execise1);
        execise2 = (Button) findViewById(R.id.execise2);
        execise3 = (Button) findViewById(R.id.execise3);
        execise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MainActivity.this, Execise1.class);;
                startActivity(navigate);
            }
        });

        execise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MainActivity.this, Execise2.class);;
                startActivity(navigate);
            }
        });

        execise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MainActivity.this, Execise3.class);;
                startActivity(navigate);
            }
        });

    }
}
