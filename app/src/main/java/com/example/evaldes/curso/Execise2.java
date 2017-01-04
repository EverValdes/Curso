package com.example.evaldes.curso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Execise2 extends AppCompatActivity {
    private EditText firstOperating;
    private String[] operation;
    private Spinner operationSpinner;
    private EditText secondOperating;
    private TextView display;
    private Button processOperation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execise2);

        firstOperating = (EditText) findViewById(R.id.firstOperating);

        operationSpinner = (Spinner) findViewById(R.id.operation);
        setOperationComboBox();
        configureComboBox();

        secondOperating = (EditText) findViewById(R.id.secondOperating);
        display = (TextView) findViewById(R.id.display);

        processOperation = (Button) findViewById(R.id.processOperation);
        processOperation.setText(R.string.enterButton);

        processOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstNumber = Double.parseDouble(firstOperating.getText().toString());

                //String withOperation = operationSpinner.getText().toString();
                String withOperation = String.valueOf(operationSpinner.getSelectedItem());


                Double secondNumber = Double.parseDouble(secondOperating.getText().toString());
                if (firstNumber != null && withOperation != null && secondNumber != null) {
                    Double result;
                    String process;
                    switch (withOperation){
                        case "+":
                            result = firstNumber + secondNumber;
                            break;
                        case "-":
                            result = firstNumber - secondNumber;
                            break;
                        case "*":
                            result = firstNumber * secondNumber;
                            break;
                        case "/":
                            result = firstNumber / secondNumber;
                            break;
                        default:
                            result = null;
                            break;
                    }

                    if (result != null) {
                        process = result.toString();
                        display.setText(process);
                    } else {
                        display.setText(R.string.operatingProcessError);
                    }
                }
            }

        });
    }

    private void setOperationComboBox(){
        operation= getResources().getStringArray(R.array.operationArray);
    }

    private void configureComboBox(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.operationArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operationSpinner.setAdapter(adapter);
        operationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Operation selected : " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void retrieveOperationSelected() {
        Toast.makeText(Execise2.this, "OnClickListener : "+ String.valueOf(operationSpinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
    }
}
