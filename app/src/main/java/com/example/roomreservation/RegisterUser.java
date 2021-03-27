package com.example.roomreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterUser extends AppCompatActivity implements View.OnClickListener{


    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);


        button = (Button) findViewById(R.id.buttonR);
        button.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonR:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}