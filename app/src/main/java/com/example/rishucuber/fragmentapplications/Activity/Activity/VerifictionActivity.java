package com.example.rishucuber.fragmentapplications.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.R;


public class VerifictionActivity extends AppCompatActivity {
    private TextView mChangeNumber;
    private Button mBconfirm;
    private ImageView mBack;
    private TextView mToolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifiction);
        init();
        mToolbarText.setText("Verification");
        mChangeNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changenumber = new Intent(VerifictionActivity.this, ForgotPasswordActivity.class);
                startActivity(changenumber);
            }
        });
        mBconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirm = new Intent(VerifictionActivity.this, ResetPasswordActivity.class);
                startActivity(confirm);


            }
        });

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(VerifictionActivity.this, ForgotPasswordActivity.class);
                startActivity(back);
            }
        });


    }

    private void init() {
        mChangeNumber = (TextView) findViewById(R.id.changenumber);
        mBconfirm = (Button) findViewById(R.id.confirm);
        mBack = (ImageView) findViewById(R.id.iv_button);
        mToolbarText = (TextView) findViewById(R.id.tv_toolbar);
    }

}
