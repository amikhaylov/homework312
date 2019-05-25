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
    }
}
