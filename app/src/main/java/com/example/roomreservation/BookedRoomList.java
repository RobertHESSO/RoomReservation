package com.example.roomreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookedRoomList extends AppCompatActivity implements View.OnClickListener {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked_room_list);

        button = (Button) findViewById(R.id.buttonCHangeRoomList);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonCHangeRoomList:
                startActivity(new Intent(this, AddRoom.class));
                break;
        }
    }
}