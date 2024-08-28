package com.fare4z.myLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {

    CardView cvMalaysia, cvPenang, cvKedah, cvKelantan;
    TextView tvOutputMalaysia, tvOutputPenang, tvOutputKedah, tvOutputKelantan;
    Integer c1,c2,c3,c4;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        actionBar = getSupportActionBar();
        actionBar.setTitle("MAD - DFP50293");
        actionBar.setSubtitle("Grid Layout");
        actionBar.setIcon(R.drawable.logologin);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);


        cvMalaysia = findViewById(R.id.cvMalaysia);
        cvPenang = findViewById(R.id.cvPenang);
        cvKedah = findViewById(R.id.cvKedah);
        cvKelantan = findViewById(R.id.cvKelantan);

        tvOutputMalaysia = findViewById(R.id.tvOutputMalaysia);
        tvOutputPenang = findViewById(R.id.tvOutputPenang);
        tvOutputKedah = findViewById(R.id.tvOutputKedah);
        tvOutputKelantan = findViewById(R.id.tvOutputKelantan);

        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;

        cvMalaysia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1++;
                tvOutputMalaysia.setText(c1.toString());
            }
        });

        cvPenang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2++;
                tvOutputPenang.setText(c2.toString());
            }
        });

        cvKedah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3++;
                tvOutputKedah.setText(c3.toString());
            }
        });

        cvKelantan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4++;
                tvOutputKelantan.setText(c4.toString());
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