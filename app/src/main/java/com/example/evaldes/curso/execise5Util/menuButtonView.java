package com.example.evaldes.curso.execise5Util;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.evaldes.curso.Execise5;
import com.example.evaldes.curso.R;

public class MenuButtonView extends AppCompatActivity {

    RelativeLayout firstOption;
    RelativeLayout secondOption;
    RelativeLayout thirdOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_button_view);

        firstOption = (RelativeLayout) findViewById(R.id.firstOption);
        secondOption = (RelativeLayout) findViewById(R.id.secondOption);
        thirdOption = (RelativeLayout) findViewById(R.id.thirdOption);
        setUpOptionText();

    }

    private void setUpOptionText() {
        ((TextView) firstOption.findViewById(R.id.buttonDescription)).setText(R.string.firstButtonDescription);
        Button firstButton = ((Button) firstOption.findViewById(R.id.buttonOption));
        firstButton.setText(R.string.firstButtonOption);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MenuButtonView.this, FirstDummyActivity.class);;
                startActivity(navigate);
            }
        });


        ((TextView) secondOption.findViewById(R.id.buttonDescription)).setText(R.string.secondButtonDescription);
        Button secondButton =  ((Button) secondOption.findViewById(R.id.buttonOption));
        secondButton.setText(R.string.secondButtonOption);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MenuButtonView.this, SecondDummyActivity.class);;
                startActivity(navigate);
            }
        });


        ((TextView) thirdOption.findViewById(R.id.buttonDescription)).setText(R.string.thirdButtonDescription);
        Button thirdButton =  ((Button) thirdOption.findViewById(R.id.buttonOption));
        thirdButton.setText(R.string.thirdButtonOption);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate = new Intent(MenuButtonView.this, ThirdDummyActivity.class);;
                startActivity(navigate);
            }
        });
    }
}
