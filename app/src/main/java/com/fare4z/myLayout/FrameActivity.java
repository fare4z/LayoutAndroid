package com.fare4z.myLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FrameActivity extends AppCompatActivity {

    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
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
}