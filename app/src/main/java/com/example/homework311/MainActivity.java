package com.example.homework311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView entryField = findViewById(R.id.entryField);
        final Button numberZero = findViewById(R.id.numberZero);
        final Button numberOne = findViewById(R.id.numberOne);
        final Button numberTwo = findViewById(R.id.numberTwo);
        final Button numberThree = findViewById(R.id.numberThree);
        final Button numberFour = findViewById(R.id.numberFour);
        final Button numberFive = findViewById(R.id.numberFive);
        final Button numberSix = findViewById(R.id.numberSix);
        final Button numberSeven = findViewById(R.id.numberSeven);
        final Button numberEight = findViewById(R.id.numberEight);
        final Button numberNine = findViewById(R.id.numberNine);
        final Button signPoint = findViewById(R.id.signPoint);
        final Button actionClear = findViewById(R.id.actionClear);
        final Button actionNegate = findViewById(R.id.actionNegate);
        final Button actionPercent = findViewById(R.id.actionPercent);
        final Button actionDivide = findViewById(R.id.actionDivide);
        final Button actionMultiply = findViewById(R.id.actionMultiply);
        final Button actionSubtract = findViewById(R.id.actionSubtract);
        final Button actionAdd = findViewById(R.id.actionAdd);
        final Button actionCalculate = findViewById(R.id.actionCalculate);

        numberZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberZero.getText());
            }
        });

        numberOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberOne.getText());
            }
        });

        numberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberTwo.getText());
            }
        });

        numberThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberThree.getText());
            }
        });

        numberFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberFour.getText());
            }
        });

        numberFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberFive.getText());
            }
        });

        numberSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberSix.getText());
            }
        });

        numberSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberSeven.getText());
            }
        });

        numberEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberEight.getText());
            }
        });

        numberNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(numberNine.getText());
            }
        });

        signPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(signPoint.getText());
            }
        });

        actionClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entryField.length() > 0) {
                    entryField.setText(entryField.getText().toString().substring(0, entryField.length() - 1));
                }
            }
        });

        actionClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                entryField.setText("");
                return false;
            }
        });

        actionNegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(entryField.getText().toString());
                entryField.setText(String.valueOf(-a));
            }
        });

        actionPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(actionPercent.getText());
            }
        });

        actionDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(actionDivide.getText());
            }
        });

        actionMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(actionMultiply.getText());
            }
        });

        actionSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(actionSubtract.getText());
            }
        });

        actionAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entryField.append(actionAdd.getText());
            }
        });

        actionCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = entryField.getText().toString();
                String s2 = s1.substring(1);
                if (s2.indexOf('+') != -1) {
                    double a = Double.parseDouble(s1.substring(0, s1.indexOf('+')));
                    double b = Double.parseDouble(s1.substring(s1.indexOf('+') + 1));
                    entryField.append("=" + (a + b));
                } else if (s2.indexOf('×') != -1) {
                    double a = Double.parseDouble(s1.substring(0, s1.indexOf('×')));
                    double b = Double.parseDouble(s1.substring(s1.indexOf('×') + 1));
                    entryField.append("=" + (a * b));
                } else if (s2.indexOf('÷') != -1) {
                    double a = Double.parseDouble(s1.substring(0, s1.indexOf('÷')));
                    double b = Double.parseDouble(s1.substring(s1.indexOf('÷') + 1));
                    entryField.append("=" + (a / b));
                } else if (s2.indexOf('%') != -1) {
                    double a = Double.parseDouble(s1.substring(0, s1.indexOf('%')));
                    double b = Double.parseDouble(s1.substring(s1.indexOf('%') + 1));
                    entryField.append("=" + (a * b / 100));
                } else if (s2.indexOf('-') != -1 && s1.charAt(0) != '-') {
                    double a = Double.parseDouble(s1.substring(0, s1.indexOf('-')));
                    double b = Double.parseDouble(s1.substring(s1.indexOf('-') + 1));
                    entryField.append("=" + (a - b));
                } else if (s2.indexOf('-') != -1 && s1.charAt(0) == '-') {
                    double a = Double.parseDouble(s1.substring(0, s1.indexOf('-', s1.indexOf('-') + 1)));
                    double b = Double.parseDouble(s1.substring(s1.indexOf('-', s1.indexOf('-') + 1) + 1));
                    entryField.append("=" + (a - b));
                }
            }
        });
    }
}
