package com.fare4z.myLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {

    CardView cvMalaysia, cvPenang, cvKedah, cvKelantan;
    TextView tvOutputMalaysia, tvOutputPenang, tvOutputKedah, tvOutputKelantan;
    Integer c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

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
}