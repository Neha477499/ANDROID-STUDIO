package com.example.additionsubmultidivision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtLogin1;
    EditText editUserName1;
    TextView txtLogin2;
    EditText editUserName2;
    TextView txtLogin3;
    TextView txtLogin4;
    Button btnLogin;
    Button btnLogin1;
    Button btnLogin2;
    Button btnLogin3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin1 = (TextView) findViewById(R.id.text1);
        editUserName1 =(EditText) findViewById(R.id.edit1);
        txtLogin2 = (TextView) findViewById(R.id.text2);
        editUserName2 =(EditText) findViewById(R.id.edit2);
        txtLogin3 = (TextView) findViewById(R.id.text3);
        txtLogin4 = (TextView) findViewById(R.id.text4);
        btnLogin = (Button) findViewById(R.id.button1);
        btnLogin1 = (Button) findViewById(R.id.button2);
        btnLogin2 = (Button) findViewById(R.id.button3);
        btnLogin3 = (Button) findViewById(R.id.button4);
        btnLogin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble((editUserName1.getText().toString()));
                double num2 = Double.parseDouble((editUserName2.getText().toString()));
                double num3 = num1 / num2;
                txtLogin4.setText(Double.toString(num3));
            }
        });
        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble((editUserName1.getText().toString()));
                double num2 = Double.parseDouble((editUserName2.getText().toString()));
                double num3 = num1 * num2;
                txtLogin4.setText(Double.toString(num3));
            }
        });
        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble((editUserName1.getText().toString()));
                double num2 = Double.parseDouble((editUserName2.getText().toString()));
                double num3 = num1 - num2;
                txtLogin4.setText(Double.toString(num3));
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(View view) {
                                            double num1 = Double.parseDouble((editUserName1.getText().toString()));
                                            double num2 = Double.parseDouble((editUserName2.getText().toString()));
                                            double num3 = num1 + num2;
                                            txtLogin4.setText(Double.toString(num3));
                                        }
                                    }
        );
    }
}