package com.example.log_act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        String email_value = email.getText().toString();
        String password_value = password.getText().toString();


        Button button = findViewById(R.id.confirm_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Data.class);
                intent.putExtra("email", email_value);
                intent.putExtra("password", password_value);
                startActivity(intent);
            }
        });



    }



}