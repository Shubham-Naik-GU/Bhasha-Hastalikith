package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity31 extends AppCompatActivity {
    private TracingLetterView letterView31;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main31);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter31);
        this.letterView31 = tracingLetterView;
        tracingLetterView.setLetterChar(31);
        this.letterView31.setPointColor(-16776961);
        this.letterView31.setInstructMode(true);
        this.letterView31.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity31.this.startActivity(new Intent(MainActivity31.this, MainActivity32.class));
                Toast.makeText(MainActivity31.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
