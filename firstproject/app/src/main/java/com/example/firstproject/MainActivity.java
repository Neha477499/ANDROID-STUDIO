package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtMsg;
   Button  buttonbeign;
   Button buttonexit;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = (TextView) findViewById(R.id.txtMsg);
        buttonbeign = (Button) findViewById(R.id.buttonbeign);
        buttonexit = (Button) findViewById(R.id.buttonexit);
        buttonbeign.setOnClickListener(this);
        buttonexit.setOnClickListener(this);
    }
    public void onClick(View V){
        if (V.getId() == buttonbeign.getId()){
            txtMsg.setText("1-You clicked the 'Begin' button");
        }
        if (V.getId() == buttonexit.getId()){
            txtMsg.setText("1-You clicked the 'Exit' button");
        }
    }
}