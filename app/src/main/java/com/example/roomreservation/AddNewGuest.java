package com.example.roomreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class AddNewGuest extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener  {

    private DatePickerDialog datePickerDialog;
    private TextView checkIn;
    private TextView checkOut;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_guest);
        checkIn = findViewById(R.id.CheckIn);

        button = (Button) findViewById(R.id.SubmitButton);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.SubmitButton:
                startActivity(new Intent(this, MainMenu.class));
                break;
            case R.id.CheckIn:
                showDatePickerDialog();
                break;
            case R.id.CheckOut:
                showDatePickerDialog();
                break;
        }
    }

    public void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = "month/day/year: " + month + "/" + dayOfMonth + "/" + year;
        checkIn.setText(date);
    }
}