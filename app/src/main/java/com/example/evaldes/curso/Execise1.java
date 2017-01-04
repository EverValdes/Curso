package com.example.evaldes.curso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Execise1 extends AppCompatActivity {

    //private String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] monthArray = null;
    private EditText monthSelector = null;
    private TextView monthSelected = null;
    private Button searchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execise1);
        createCalentarGuide();
        monthSelector = (EditText) findViewById(R.id.monthSelector);
        monthSelected = (TextView) findViewById(R.id.monthSelected);
        monthSelected.setText(R.string.monthSelected);
        searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setText(R.string.enterButton);
        setMonthSelectorListeners();
        setSearchButtonListeners();
    }

    private void createCalentarGuide(){
        monthArray= getResources().getStringArray(R.array.monthCalendarArray);
    }

    private void setMonthSelectorListeners(){
        monthSelector.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                monthSelector.setHint(R.string.monthSelector);
            }
        });
    }

    private void setSearchButtonListeners(){
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int chosenMonth = Integer.parseInt(monthSelector.getText().toString()) - 1;
                if (chosenMonth >= 0 && chosenMonth <= 11){
                    monthSelected.setText(monthArray[chosenMonth]);
                } else {
                    monthSelected.setText(R.string.monthSelectorError);
                }
            }
        });
        /*searchButton.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    searchButton.callOnClick();
                    return true;
                }
                return false;
            };
        });*/
    }
}
