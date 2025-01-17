package com.danny_jiang.tracingsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity52 extends AppCompatActivity {
    private TracingLetterView letterView52;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main52);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter52);
        this.letterView52 = tracingLetterView;
        tracingLetterView.setLetterChar(52);
        this.letterView52.setPointColor(-16776961);
        this.letterView52.setInstructMode(true);
        this.letterView52.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                Toast.makeText(MainActivity52.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
