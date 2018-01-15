package com.example.pooja.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class travelling extends AppCompatActivity {

    private Button BUS_button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelling);
        BUS_button=(Button)findViewById(R.id.BUS_button);
        BUS_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                BUS();
            }
        });

        TRAIN_button = (Button) findViewById(R.id.TRAIN_button);
        TRAIN_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TRAIN();
            }
        });
        FLIGHT_button = (Button) findViewById(R.id.FLIGHT_button);
        FLIGHT_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLIGHT();
            }
        });
    }
    public void BUS(){
        Intent intent=new Intent(this,list_bus.class);
        startActivity(intent);
    }
    private Button TRAIN_button;
    public void TRAIN(){
        Intent intent=new Intent(this,list_train.class);
        startActivity(intent);
    }
    private Button FLIGHT_button;
    public void FLIGHT(){
        Intent intent=new Intent(this,list_flight.class);
        startActivity(intent);
    }
}
