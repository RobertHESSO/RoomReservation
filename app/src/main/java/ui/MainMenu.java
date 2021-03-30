package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.roomreservation.R;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        button1 = (Button) findViewById(R.id.AddRoomButton);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.AddNewGuestButton);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.AllRoomListButton);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.GuestBockingListButton);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.AddRoomButton:
                startActivity(new Intent(this, AddRoom.class));
                break;
            case R.id.AddNewGuestButton:
                startActivity(new Intent(this, AddNewGuest.class));
                break;
            case R.id.AllRoomListButton:
                startActivity(new Intent(this, BookedRoomList.class));
                break;

        }
    }
}