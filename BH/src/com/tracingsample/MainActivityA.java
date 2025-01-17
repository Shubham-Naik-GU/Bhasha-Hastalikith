package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.tracingsample.R;

public class MainActivityA extends AppCompatActivity {
    Button button;
    Button button1;
    Button button2;
    Button button3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main_activity);
        this.button = (Button) findViewById(R.id.button3);
        this.button1 = (Button) findViewById(R.id.button4);
        this.button2 = (Button) findViewById(R.id.button8);
        this.button3 = (Button) findViewById(R.id.button9);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivityA.this.startActivity(new Intent(MainActivityA.this, MainActivity1.class));
            }
        });
        this.button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivityA.this.startActivity(new Intent(MainActivityA.this, MainActivity27.class));
            }
        });
        this.button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivityA.this.startActivity(new Intent(MainActivityA.this, MainActivity53.class));
            }
        });
        this.button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivityA.this.startActivity(new Intent(MainActivityA.this, MainActivity54.class));
            }
        });
    }
}
