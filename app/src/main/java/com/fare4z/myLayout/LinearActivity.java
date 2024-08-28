package com.fare4z.myLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LinearActivity extends AppCompatActivity {
ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        actionBar = getSupportActionBar();
        actionBar.setTitle("MAD - DFP50293");
        actionBar.setSubtitle("Linear Layout");
        actionBar.setIcon(R.drawable.logologin);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);


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