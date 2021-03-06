package com.epicodus.eredivisie.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.epicodus.eredivisie.R;

public class ConfirmAccountActivity extends AppCompatActivity {
    public static final String TAG = ConfirmAccountActivity.class.getSimpleName();
    private TextView mTextViewConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_account);

        mTextViewConfirm = (TextView) findViewById(R.id.textViewConfirm);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        mTextViewConfirm.setText("Thanks for setting up your account, " + username + "! Cheers to (team name will go here when I figure it out)!");
    }
}
