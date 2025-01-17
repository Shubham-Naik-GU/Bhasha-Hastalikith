package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity20 extends AppCompatActivity {
    private TracingLetterView letterView20;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main20);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter20);
        this.letterView20 = tracingLetterView;
        tracingLetterView.setLetterChar(20);
        this.letterView20.setPointColor(-16776961);
        this.letterView20.setInstructMode(true);
        this.letterView20.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity20.this.startActivity(new Intent(MainActivity20.this, MainActivity21.class));
                Toast.makeText(MainActivity20.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
