package com.example.myfirstproj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    double num1=0.0, num2=0.0;
    String mathOperation = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
    }


    public void buttonFunctionNumber(View view) {
        if (view instanceof Button){
            Button button = (Button) view;
            String str = button.getText().toString();

                result.append(str);
        }
    }

    public void buttonEqualFunction(View view) {
        if (view instanceof Button) {
            String temp2 = result.getText().toString();
            num2 = Double.parseDouble(temp2);
            double total = 0.0;

            switch (mathOperation) {
                case "+":
                    total = num1 + num2;
                    break;
                case "-":
                    total = num1 - num2;
                    break;
                case "*":
                    total = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0)
                        total = num1 / num2;
                    else
                        Toast.makeText(this, "Error Cant divide by 0", Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;

            }
            num1 = total;
            result.setText(total + "");
        }
    }

    public void buttonAddFunction(View view) {
        if (view instanceof Button){
            String temp1 = result.getText().toString();
            num1 = Double.parseDouble(temp1);
            mathOperation = "+";
            result.setText(" ");
        }
    }

    public void buttonSubtractFunction(View view) {
        if (view instanceof Button) {
            String temp1 = result.getText().toString();
            num1 = Double.parseDouble(temp1);
            mathOperation = "-";
            result.setText(" ");
        }
    }

    public void buttonMultiplyFunction(View view) {
        if (view instanceof Button) {
            String temp1 = result.getText().toString();
            num1 = Double.parseDouble(temp1);
            mathOperation = "*";
            result.setText(" ");
        }
    }

    public void buttonDivideFunction(View view) {
        if (view instanceof Button) {
            String temp1 = result.getText().toString();
            num1 = Double.parseDouble(temp1);
            mathOperation = "/";
            result.setText(" ");
        }

    }

    public void buttonClearFunction(View view) {result.setText("");}
}


