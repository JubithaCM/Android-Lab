package com.example.login;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;


import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

  String defualt_username="jubitha";
  String defualt_password="111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "strat fn", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop function", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restarting ", Toast.LENGTH_SHORT).show();
    }


    public void validateLogin(View view) {
        EditText username=(EditText) findViewById(R.id.uname);
        EditText password=(EditText)  findViewById(R.id.pass);
        String user_name = username.getText().toString();
        String pass=password.getText().toString();
        String message="invalid login credentials";
        if (user_name.equals(defualt_username)&& pass.equals(defualt_password))
            message="login success";
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
    }
