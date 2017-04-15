package com.example.rishucuber.fragmentapplications.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.R;


public class LoginActivity extends AppCompatActivity {
    private TextView mForgotpass, mDonthaveaccount;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        mForgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgot = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(forgot);


            }
        });
        mDonthaveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createaccount = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(createaccount);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userlogin = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(userlogin);
            }
        });

    }

    private void init() {
        mForgotpass = (TextView) findViewById(R.id.forgotpassword);
        mDonthaveaccount = (TextView) findViewById(R.id.donthaveaccount);
        login = (Button) findViewById(R.id.login);

    }


}
