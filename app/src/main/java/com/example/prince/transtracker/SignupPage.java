package com.example.prince.transtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class SignupPage extends AppCompatActivity {
    AppCompatButton singuptohome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        singuptohome = (AppCompatButton)findViewById(R.id.singuptohome);

        singuptohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(SignupPage.this,HomePage.class);
                startActivity(i);
            }
        });
    }
}
