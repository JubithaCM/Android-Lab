package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        TextView username=(TextView)  findViewById(R.id.username);
        TextView email=(TextView) findViewById(R.id.email);
        sp=getSharedPreferences("Userinfo",MODE_PRIVATE);
        String uname=sp.getString("user_name","");
        String emailaddress=sp.getString("emailaddress","");
        username.setText(uname);
        email.setText(emailaddress);
        Button backbtn=(Button) findViewById(R.id.back);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(secondactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}