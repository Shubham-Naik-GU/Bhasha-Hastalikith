package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity23 extends AppCompatActivity {
    private TracingLetterView letterView23;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main23);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter23);
        this.letterView23 = tracingLetterView;
        tracingLetterView.setLetterChar(23);
        this.letterView23.setPointColor(-16776961);
        this.letterView23.setInstructMode(true);
        this.letterView23.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity23.this.startActivity(new Intent(MainActivity23.this, MainActivity24.class));
                Toast.makeText(MainActivity23.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
