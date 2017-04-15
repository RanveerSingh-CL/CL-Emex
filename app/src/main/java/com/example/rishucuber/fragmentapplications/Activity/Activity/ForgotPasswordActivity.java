package com.example.rishucuber.fragmentapplications.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    private Button mContinue;
    private ImageView mBack;
    private TextView mToolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        mContinue = (Button) findViewById(R.id.bt_continue);
        init();
        mToolbarText.setText("Reset Password");
        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icontinue = new Intent(ForgotPasswordActivity.this, VerifictionActivity.class);
                startActivity(icontinue);
            }
        });
        mBack = (ImageView) findViewById(R.id.iv_button);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                startActivity(back);
            }
        });


    }

    private void init() {
        mContinue = (Button) findViewById(R.id.bt_continue);
        mToolbarText = (TextView) findViewById(R.id.tv_toolbar);
    }


}
