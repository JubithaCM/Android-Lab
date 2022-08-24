package com.example.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.implicitintent.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    Intent intent, chooser = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openImplicitIntent(View view) {
        if (view.getId()==R.id.mapbtn)
        {
            intent= new Intent(intent.ACTION_VIEW);
            intent.setData(Uri.parse("ge:10,067,76,869"));
            chooser=intent.createChooser(intent,"Luanch Map");
            startActivity(chooser);
        }
        if (view.getId()==R.id.playstorebtn) {
            intent =new Intent(intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?=id=com.king.candycrushaga"));
            startActivity(intent);
        }
        if (view.getId()==R.id.mailbtn) {
            intent = new  Intent(intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto"));
            String to[] = {"jubi@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "from Emulator");
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_TEXT, "I have an attachement");
            chooser = intent.createChooser(intent, "messenger");
            startActivity(chooser);
        }
    }
}

