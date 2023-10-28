package com.example.log_act;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);
        TextView email = findViewById(R.id.email_val);
        TextView password = findViewById(R.id.password_val);
        Intent intent = getIntent();
        String email_val = intent.getStringExtra("email");
        String password_val = intent.getStringExtra("password");
        email.setText(email_val);
        password.setText(password_val);
    }
}