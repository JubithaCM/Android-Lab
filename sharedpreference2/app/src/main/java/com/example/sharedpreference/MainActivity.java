package com.example.sharedpreference;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;


import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    String defualt_username = "jubitha";
    String defualt_password = "111";
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validateLogin(View view) {
        EditText username = (EditText) findViewById(R.id.uname);
        EditText password = (EditText) findViewById(R.id.pass);
        EditText email = (EditText) findViewById(R.id.email);
        String user_name = username.getText().toString();
        String pass = password.getText().toString();
        String emailaddress = email.getText().toString();
        String message = "invalid login credentials";
        if (user_name.equals(defualt_username) && pass.equals(defualt_password)) {
            message = "login success";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            sp = getSharedPreferences("Userinfo", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("user_name", user_name);
            editor.putString("emailaddress", emailaddress);
            editor.commit();
            Intent intent = new Intent(MainActivity.this, secondactivity.class);
            startActivity(intent);
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}