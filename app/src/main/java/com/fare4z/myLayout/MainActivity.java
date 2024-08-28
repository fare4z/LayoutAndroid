package com.fare4z.myLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnFrameLayout , btnLinearLayout ,btnGridLayout, btnWebView;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrameLayout = findViewById(R.id.btnFrameLayout);
        btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnGridLayout = findViewById(R.id.btnGridLayout);
        btnWebView = findViewById(R.id.btnWebView);

        actionBar = getSupportActionBar();
        actionBar.setTitle("MAD - DFP50293");
        actionBar.setSubtitle("Layout Tutorial");
        actionBar.setIcon(R.drawable.logologin);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);



        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FrameActivity.class);
                startActivity(i);
            }
        });

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LinearActivity.class);
                startActivity(i);
            }
        });

        btnGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GridActivity.class);
                startActivity(i);
            }
        });

        btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WebviewActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.actionFrame) {
            Intent i = new Intent(getApplicationContext(), FrameActivity.class);
        startActivity(i);
        } else if (id==R.id.actionGrid) {
            Intent i = new Intent(getApplicationContext(), GridActivity.class);
            startActivity(i);
        } else if (id==R.id.actionHome) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }


        return super.onOptionsItemSelected(item);
    }
}