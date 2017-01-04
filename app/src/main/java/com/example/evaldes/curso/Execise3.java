package com.example.evaldes.curso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Execise3 extends AppCompatActivity {
    private EditText numberOfLines;
    private Button enterButton;
    private TextView linesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execise3);

        numberOfLines = (EditText) findViewById(R.id.numberOfLines);
        enterButton = (Button) findViewById(R.id.enterButton);
        enterButton.setText(R.string.enterButton);
        linesView = (TextView) findViewById(R.id.linesView);
        setSelectorListeners();
        setEnterButtonListener();
    }

    private void setSelectorListeners(){
        numberOfLines.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                numberOfLines.setHint(R.string.linesToDisplay);
            }
        });

    }
    private void setEnterButtonListener(){
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int enteredLines = Integer.parseInt(numberOfLines.getText().toString());
                String textToDisplay = "";
                int i = 1;
                while (i != enteredLines + 1){
                    textToDisplay = textToDisplay + "Line " + i + "\n";
                    i++;
                }
                linesView.setText(textToDisplay);
            }
        });
    }
}
