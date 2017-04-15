package com.example.rishucuber.fragmentapplications.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.R;


public class ResetPasswordActivity extends AppCompatActivity {
    private ImageView mBack;
    private TextView mToolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        init();
        mToolbarText.setText("Reset Password");
        mBack.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ResetPasswordActivity.this, VerifictionActivity.class);
                startActivity(back);
            }
        });

    }

    private void init() {
        mBack = (ImageView) findViewById(R.id.iv_button);
        mToolbarText = (TextView) findViewById(R.id.tv_toolbar);
    }

}
