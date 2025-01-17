package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity6 extends AppCompatActivity {
    private TracingLetterView letterView6;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main6);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter6);
        this.letterView6 = tracingLetterView;
        tracingLetterView.setLetterChar(6);
        this.letterView6.setPointColor(-16776961);
        this.letterView6.setInstructMode(true);
        this.letterView6.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity6.this.startActivity(new Intent(MainActivity6.this, MainActivity7.class));
                Toast.makeText(MainActivity6.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
