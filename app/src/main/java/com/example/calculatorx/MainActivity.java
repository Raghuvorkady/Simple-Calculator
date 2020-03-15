package com.example.calculatorx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8,b9, b10, b11, b12, b13, b14, b15, b16;
    TextView textQ, textA, AnswerBox;
    Double value1, value2, value3;
    boolean division,subtraction,addition,multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b0=(Button) findViewById(R.id.button0);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b10=(Button) findViewById(R.id.button10);//'/'
        b11=(Button) findViewById(R.id.button11);//'*'
        b12=(Button) findViewById(R.id.button12);//'-'
        b13=(Button) findViewById(R.id.button13);//'+'
        b14=(Button) findViewById(R.id.button14);//'='
        b15=(Button) findViewById(R.id.button15);//'AC'
        b16=(Button) findViewById(R.id.button16);//'.'
        textQ = (TextView) findViewById(R.id.textEqn);
        textA = (TextView) findViewById(R.id.textAns);
        AnswerBox = (TextView) findViewById(R.id.Ans);

       textA.setMovementMethod(new ScrollingMovementMethod());
       textQ.setMovementMethod(new ScrollingMovementMethod());
       AnswerBox.setMovementMethod(new ScrollingMovementMethod());

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"0");
                //textA.setText("=");
                //textA.setText(textA.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"1");
                //textA.setText("=");
                //textA.setText(textA.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"2");
                //textA.setText("=");
                //textA.setText(textA.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"3");
                //textA.setText("=");
                //textA.setText(textA.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"4");
                //textA.setText("=");
                //textA.setText(textA.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"5");
                //textA.setText("=");
                //textA.setText(textA.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"6");
                //textA.setText(textA.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"7");
                //textA.setText("=");
                //textA.setText(textA.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"8");
                //textA.setText("=");
                //textA.setText(textA.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+"9");
                //textA.setText("=");
                //textA.setText(textA.getText()+"9");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textQ.getText().toString().isEmpty())
                    return;
                if (!(textA.getText().toString().isEmpty()))
                    textQ.setText(value3 + "");
                value1 = Double.parseDouble(textQ.getText() + "");
                //textQ.setText(textQ.getText() + "÷");
                division = true;
                AnswerBox.setText(textQ.getText()+ "÷");
                textQ.setText(null);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textQ.getText().toString().isEmpty())
                    return;
                if (!(textA.getText().toString().isEmpty()))
                    textQ.setText(value3 + "");
                /*if(division == true || subtraction == true || addition == true) {
                    textQ.setText(value1 + "×");
                    division =false;
                    subtraction = false;
                    addition = false;
                }
                 */
                value1 = Double.parseDouble(textQ.getText() + "");
                //textQ.setText(textQ.getText() + "×");
                multiplication = true;
                AnswerBox.setText(textQ.getText() + "×");
                textQ.setText(null);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(textA.getText().toString().isEmpty()))
                    textQ.setText(value3 + "");
                if(!(textQ.getText().toString().isEmpty())) {
                    value1 = Double.parseDouble(textQ.getText() + "");
                    //textQ.setText(textQ.getText() + "−");
                    subtraction = true;
                    AnswerBox.setText(textQ.getText()+"-");
                    textQ.setText(null);
                }
                else {
                    textQ.setText("-");
                    //textA.setText("-");
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textQ.getText().toString().isEmpty())
                    return;
                if (!(textA.getText().toString().isEmpty()))
                    textQ.setText(value3 + "");
                //textQ.setText(textA.getText().toString());
                value1 = Double.parseDouble(textQ.getText() + "");
                //textQ.setText(textQ.getText() + "+");
                addition = true;
                AnswerBox.setText(textQ.getText() + "+");
                textQ.setText(null);
            }
        });

        /*b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textA.setText("=ANSWER");
            }
        });*/

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textQ.setText(textQ.getText()+".");
                //textA.setText(textA.getText()+".");
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textQ.getText().toString().isEmpty())
                    return;
                Toast.makeText(MainActivity.this, "successful", Toast.LENGTH_SHORT).show();
                value2 = Double.parseDouble(textQ.getText() + "");
                if (addition == true)
                {
                    value3 = value1 + value2;
                    textA.setText(value3 + "");
                    //textA.setText("");
                    addition = false;
                }
                if (subtraction == true)
                {
                    value3 = value1 - value2;
                    textA.setText(value3 + "");
                    //textA.setText("");
                    subtraction = false;
                }
                if (multiplication == true)
                {
                    value3 = value1 * value2;
                    textA.setText(value3 + "");
                    //textA.setText("");
                    multiplication = false;
                }
                if (division == true)
                {
                    value3 = value1 / value2;
                    textA.setText(value3 + "");
                    //textA.setText("");
                    division = false;
                }
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textQ.setText("");
                textA.setText("");
                AnswerBox.setText("");
            }
        });

    }
}