package com.mnhc.globe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Asia extends AppCompatActivity {

    TextView afg;
    TextView arm;
    TextView aze;
    TextView ban;
    TextView bah;
    TextView bhu;
    TextView bru;
    TextView chi;
    TextView cam;
    TextView cyp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_asia);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /* Afganistan */
        afg = findViewById(R.id.t1);
        afg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Afganistan.class);
                startActivity(i);
            }
        });

        /* Armenia */
        arm = findViewById(R.id.t2);
        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Armenia.class);
                startActivity(i);
            }
        });

        /* Azebaijan */
        aze = findViewById(R.id.t3);
        aze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Azebaijan.class);
                startActivity(i);
            }
        });

        /* Bangladesh */
        ban = findViewById(R.id.t4);
        ban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Bangladesh.class);
                startActivity(i);
            }
        });

        /* Bahrain */
        bah = findViewById(R.id.t5);
        bah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Bahrain.class);
                startActivity(i);
            }
        });

        /* Bhutan */
        bhu = findViewById(R.id.t6);
        bhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Bhutan.class);
                startActivity(i);
            }
        });

        /* Brunei */
        bru = findViewById(R.id.t7);
        bru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Brunei.class);
                startActivity(i);
            }
        });

        /* China */
        chi = findViewById(R.id.t8);
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, China.class);
                startActivity(i);
            }
        });

        /* Cambodia */
        cam = findViewById(R.id.t9);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Cambodia.class);
                startActivity(i);
            }
        });

        /* Cyprus */
        cyp = findViewById(R.id.t10);
        cyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Asia.this, Cyprus.class);
                startActivity(i);
            }
        });
    }
}