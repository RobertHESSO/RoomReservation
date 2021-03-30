package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.roomreservation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView passwordforgott;
    private TextView register;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordforgott = (TextView) findViewById(R.id.textView4);
        passwordforgott.setOnClickListener(this);

        register = (TextView) findViewById(R.id.textView3);
        register.setOnClickListener(this);

        login = (Button) findViewById(R.id.button4);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView3:
                startActivity(new Intent(this, RegisterUser.class));
                break;
            case R.id.textView4:
                startActivity(new Intent(this, ForgotPassword.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, MainMenu.class));
        }
    }
}