package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity25 extends AppCompatActivity {
    private TracingLetterView letterView25;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main25);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter25);
        this.letterView25 = tracingLetterView;
        tracingLetterView.setLetterChar(25);
        this.letterView25.setPointColor(-16776961);
        this.letterView25.setInstructMode(true);
        this.letterView25.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity25.this.startActivity(new Intent(MainActivity25.this, MainActivity26.class));
                Toast.makeText(MainActivity25.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
