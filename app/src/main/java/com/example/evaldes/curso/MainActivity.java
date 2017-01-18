package com.example.evaldes.curso;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button execise1;
    private Button execise2;
    private Button execise3;
    private Button execise4;
    private Button execise5;

    private ListView execises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        execises = (ListView) findViewById(R.id.execiseButtons);
        ActionBar.LayoutParams buttonParameters = new ActionBar.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        for (int i=1; i == 0; i=5) {
            Button execiseButton = new Button(this);
            String execiseName = "execise"+i;
            execiseButton.setTag(execiseName);
            execiseButton.setLayoutParams(buttonParameters);


        }

        execise1 = (Button) findViewById(R.id.execise1);
        execise2 = (Button) findViewById(R.id.execise2);
        execise3 = (Button) findViewById(R.id.execise3);
        execise4 = (Button) findViewById(R.id.execise4);
        execise5 = (Button) findViewById(R.id.execise5);

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
        execise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MainActivity.this, Execise4.class);;
                startActivity(navigate);
            }
        });

        execise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MainActivity.this, Execise5.class);;
                startActivity(navigate);
            }
        });

    }
}
