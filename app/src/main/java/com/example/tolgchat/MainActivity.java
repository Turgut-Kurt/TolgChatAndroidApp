package com.example.tolgchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin,btnSignup;
    public void init(){
        btnLogin = (Button)findViewById(R.id.BtnLogin);
        btnSignup = (Button)findViewById(R.id.BtnSignUp);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intentLogin);
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignup = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intentSignup);
            }
        });
    }
}
