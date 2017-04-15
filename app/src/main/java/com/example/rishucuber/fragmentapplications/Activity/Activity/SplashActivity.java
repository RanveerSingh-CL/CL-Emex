package com.example.rishucuber.fragmentapplications.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.rishucuber.fragmentapplications.R;

public class SplashActivity extends AppCompatActivity {


    private Button mlogin, mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(login);

            }
        });
        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(SplashActivity.this, SignupActivity.class);
                startActivity(signup);

            }
        });


    }

    private void init() {
        mlogin = (Button) findViewById(R.id.login);
        mSignup = (Button) findViewById(R.id.signup);
    }
}
