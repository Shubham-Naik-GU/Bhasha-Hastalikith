package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity32 extends AppCompatActivity {
    private TracingLetterView letterView32;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main32);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter32);
        this.letterView32 = tracingLetterView;
        tracingLetterView.setLetterChar(32);
        this.letterView32.setPointColor(-16776961);
        this.letterView32.setInstructMode(true);
        this.letterView32.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity32.this.startActivity(new Intent(MainActivity32.this, MainActivity33.class));
                Toast.makeText(MainActivity32.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
