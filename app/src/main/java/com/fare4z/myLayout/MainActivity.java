package com.fare4z.myLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFrameLayout , btnLinearLayout ,btnGridLayout, btnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrameLayout = findViewById(R.id.btnFrameLayout);
        btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnGridLayout = findViewById(R.id.btnGridLayout);
        btnWebView = findViewById(R.id.btnWebView);

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
}