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

public class MainActivity2 extends AppCompatActivity {

    TextView a2;  /*asia*/
    TextView a3;  /*africa*/
    TextView a4;  /*europe*/
    TextView a5;  /*north america*/
    TextView a6;  /*south america*/
    TextView a7;  /*oceania*/
    TextView a8;  /*antertica*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /* Asia */
        a2 = findViewById(R.id.asia2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Asia.class);
                startActivity(i);
            }
        });

        /* Africa */
        a3 = findViewById(R.id.africa2);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Africa.class);
                startActivity(i);
            }
        });

        /* Europe */
        a4 = findViewById(R.id.europe2);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Europe.class);
                startActivity(i);
            }
        });

        /* North America */
        a5 = findViewById(R.id.north_america2);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, NorthAmerica.class);
                startActivity(i);
            }
        });

        /* South America */
        a6 = findViewById(R.id.south_america2);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, SouthAmerica.class);
                startActivity(i);
            }
        });

        /* Oceania */
        a7 = findViewById(R.id.oceania2);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Ocaenia.class);
                startActivity(i);
            }
        });

        /* Oceania */
        a8 = findViewById(R.id.antartica2);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Antertica.class);
                startActivity(i);
            }
        });

    }
}