package com.thanh.claimmanager.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.thanh.claimmanager.R;

public class LoginController extends AppCompatActivity implements View.OnClickListener {
    private Context context;
    private CardView btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_controller);
        context = LoginController.this;
        btnSignIn = (CardView) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSignIn:
                startActivity(new Intent(context, HomeController.class));
                finish();
        }
    }
}
