package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity36 extends AppCompatActivity {
    private TracingLetterView letterView36;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main36);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter36);
        this.letterView36 = tracingLetterView;
        tracingLetterView.setLetterChar(36);
        this.letterView36.setPointColor(-16776961);
        this.letterView36.setInstructMode(true);
        this.letterView36.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity36.this.startActivity(new Intent(MainActivity36.this, MainActivity37.class));
                Toast.makeText(MainActivity36.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
