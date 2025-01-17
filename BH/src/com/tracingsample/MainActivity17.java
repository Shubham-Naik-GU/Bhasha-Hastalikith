package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity17 extends AppCompatActivity {
    private TracingLetterView letterView17;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main17);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter17);
        this.letterView17 = tracingLetterView;
        tracingLetterView.setLetterChar(17);
        this.letterView17.setPointColor(-16776961);
        this.letterView17.setInstructMode(true);
        this.letterView17.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity17.this.startActivity(new Intent(MainActivity17.this, MainActivity18.class));
                Toast.makeText(MainActivity17.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
