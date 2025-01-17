package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity30 extends AppCompatActivity {
    private TracingLetterView letterView30;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main30);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter30);
        this.letterView30 = tracingLetterView;
        tracingLetterView.setLetterChar(30);
        this.letterView30.setPointColor(-16776961);
        this.letterView30.setInstructMode(true);
        this.letterView30.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity30.this.startActivity(new Intent(MainActivity30.this, MainActivity31.class));
                Toast.makeText(MainActivity30.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
