package com.example.loginnavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private TextView txt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String email= getIntent().getStringExtra("i_email");
        txt_email = findViewById(R.id.txt_email);
        txt_email.setText(email);
        Toast.makeText(this, "Welcome "+email, Toast.LENGTH_SHORT).show();
    }

    public void navigate(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}