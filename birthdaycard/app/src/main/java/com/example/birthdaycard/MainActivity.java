package com.example.birthdaycard;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.birthdaycard.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView l1, l2, l3, l4, img_cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void swapimage(View view) {
        l1 = (ImageView) findViewById(R.id.im1);
        l2 = (ImageView) findViewById(R.id.im2);
        l3 = (ImageView) findViewById(R.id.im3);
        l4 = (ImageView) findViewById(R.id.im4);
        if (view.getId() == R.id.im1) {
            l1.setVisibility(view.GONE);
            l2.setVisibility(view.VISIBLE);
            l3.setVisibility(view.VISIBLE);
            l4.setVisibility(view.VISIBLE);

        } else {
            l1.setVisibility(view.VISIBLE);
            l2.setVisibility(view.GONE);
            l3.setVisibility(view.GONE);
            l4.setVisibility(view.GONE);
        }

    }
}


