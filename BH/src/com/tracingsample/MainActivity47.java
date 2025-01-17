package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity47 extends AppCompatActivity {
    private TracingLetterView letterView47;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main47);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter47);
        this.letterView47 = tracingLetterView;
        tracingLetterView.setLetterChar(47);
        this.letterView47.setPointColor(-16776961);
        this.letterView47.setInstructMode(true);
        this.letterView47.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity47.this.startActivity(new Intent(MainActivity47.this, MainActivity48.class));
                Toast.makeText(MainActivity47.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
