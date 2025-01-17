package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity12 extends AppCompatActivity {
    private TracingLetterView letterView12;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main12);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter12);
        this.letterView12 = tracingLetterView;
        tracingLetterView.setLetterChar(12);
        this.letterView12.setPointColor(-16776961);
        this.letterView12.setInstructMode(true);
        this.letterView12.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity12.this.startActivity(new Intent(MainActivity12.this, MainActivity13.class));
                Toast.makeText(MainActivity12.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
