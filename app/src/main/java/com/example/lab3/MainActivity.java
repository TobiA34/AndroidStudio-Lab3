package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button one, two,three,four,five,six,seven,eight,nine,add,minus,multiply,divide,equal,clear;
    EditText result;
     Double num1,num2;
    boolean addition,subtract,times,division;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();
        setButtonText();

    }


    private void setupUIViews(){
        one = findViewById(R.id.Btn1);
        two = findViewById(R.id.Btn2);
        three = findViewById(R.id.Btn3);
        four = findViewById(R.id.Btn4);
        five = findViewById(R.id.Btn5);
        six = findViewById(R.id.Btn6);
        seven = findViewById(R.id.Btn7);
        eight = findViewById(R.id.Btn8);
        nine = findViewById(R.id.Btn9);
        add = findViewById(R.id.addBtn);
        minus = findViewById(R.id.minusBtn);
        multiply = findViewById(R.id.multiplyBtn);
        divide = findViewById(R.id.divideBtn);
        clear = findViewById(R.id.clearBtn);
        result = findViewById(R.id.input);
        equal = findViewById(R.id.equal);

    }


    private void setButtonText(){
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result == null){
                    result.setText("");
                }else {
                    num1 = Double.parseDouble(result.getText()+"");
                    addition = true;
                    result.setText(null);
                }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result == null){
                    result.setText("");
                }else {
                    num1 = Double.parseDouble(result.getText()+"");
                    subtract = true;
                    result.setText(null);
                }

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null){
                    result.setText("");
                }else {
                    num1 = Double.parseDouble(result.getText()+"");
                    times = true;
                    result.setText(null);
                }
             }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null){
                    result.setText("");
                }else {
                    num1 = Double.parseDouble(result.getText()+"");
                    division = true;
                    result.setText(null);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               result.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Double.parseDouble(result.getText() + "");
                if (addition == true){
                    result.setText(num1+num2+"");
                }  if(subtract == true){
                    result.setText(num1-num2+"");
                }  if(division == true){
                    result.setText(num1/num2+"");
                }  if(times == true){
                    result.setText(num1*num2+"");
                }
             }
        });
    }

    }



