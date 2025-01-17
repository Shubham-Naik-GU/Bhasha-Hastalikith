package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity50 extends AppCompatActivity {
    private TracingLetterView letterView50;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main50);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter50);
        this.letterView50 = tracingLetterView;
        tracingLetterView.setLetterChar(50);
        this.letterView50.setPointColor(-16776961);
        this.letterView50.setInstructMode(true);
        this.letterView50.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity50.this.startActivity(new Intent(MainActivity50.this, MainActivity51.class));
                Toast.makeText(MainActivity50.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
