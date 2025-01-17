package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity35 extends AppCompatActivity {
    private TracingLetterView letterView35;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main35);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter35);
        this.letterView35 = tracingLetterView;
        tracingLetterView.setLetterChar(35);
        this.letterView35.setPointColor(-16776961);
        this.letterView35.setInstructMode(true);
        this.letterView35.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity35.this.startActivity(new Intent(MainActivity35.this, MainActivity36.class));
                Toast.makeText(MainActivity35.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
