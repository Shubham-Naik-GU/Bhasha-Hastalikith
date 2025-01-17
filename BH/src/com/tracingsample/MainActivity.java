package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.tracingsample.R;

public class MainActivity extends AppCompatActivity {
    Button button1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        this.button1 = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, MainActivityA.class));
            }
        });
    }
}
