package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set name to welcome
        String nameTextField = getIntent().getStringExtra("NAME");
        TextView name = (TextView) findViewById(R.id.nameWelcome);
        name.setText(nameTextField);

        // Redirect to Splash Screen
        Button buttonSplashScreen = (Button) findViewById(R.id.splashScreenButton);
        buttonSplashScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // Redirect to Login
        Button buttonLogin = (Button) findViewById(R.id.loginRedirect);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}