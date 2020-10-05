package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtmsg;
    TextView txtmsg2;
    Button btnbgn;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmsg = (TextView) findViewById(R.id.txtmsg);
        btnbgn = (Button) findViewById(R.id.btnbgn);
        txtmsg2 = (TextView) findViewById(R.id.txtmsg2);
        exit = (Button) findViewById(R.id.exit);
        btnbgn.setOnClickListener(this);
        exit.setOnClickListener(this);
    }
    public void onClick(View V){
        if (V.getId() == btnbgn.getId()){
            txtmsg.setText("1-click on 'Begin' button");
        }
        if (V.getId() == exit.getId()){
            txtmsg2.setText("2-click on 'Exit' button");
        }
    }
}
