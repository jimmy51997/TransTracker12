package com.example.prince.transtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class LoginPage extends AppCompatActivity {
    AppCompatButton toSingup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        toSingup = (AppCompatButton)findViewById(R.id.logintosignup);

        toSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginPage.this,SignupPage.class);
                startActivity(i);
            }
        });
    }
}
