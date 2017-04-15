package com.example.rishucuber.fragmentapplications.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.R;

public class SignupActivity extends AppCompatActivity {
    private Button mBsignup;
    private ImageView mBack;
    private TextView mToolbatText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
        mToolbatText.setText("Signup");
        mBsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(signup);
            }
        });

        mBack.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(back);
            }
        });


    }

    private void init() {
        mBsignup = (Button) findViewById(R.id.bt_signup);
        mBack = (ImageView) findViewById(R.id.iv_button);
        mToolbatText = (TextView) findViewById(R.id.tv_toolbar);
    }

}
