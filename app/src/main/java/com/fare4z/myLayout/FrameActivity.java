package com.fare4z.myLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FrameActivity extends AppCompatActivity {

    TextView tvHello;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        actionBar = getSupportActionBar();
        actionBar.setTitle("MAD - DFP50293");
        actionBar.setSubtitle("Frame Layout");
        actionBar.setIcon(R.drawable.logologin);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);


        tvHello = findViewById(R.id.tvHello);
  tvHello.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Toast.makeText(FrameActivity.this, "My name is Fareez",
                   Toast.LENGTH_SHORT).show();

           Toast.makeText(FrameActivity.this, "Hi",
                   Toast.LENGTH_SHORT).show();
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