package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity15 extends AppCompatActivity {
    private TracingLetterView letterView15;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main15);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter15);
        this.letterView15 = tracingLetterView;
        tracingLetterView.setLetterChar(15);
        this.letterView15.setPointColor(-16776961);
        this.letterView15.setInstructMode(true);
        this.letterView15.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity15.this.startActivity(new Intent(MainActivity15.this, MainActivity16.class));
                Toast.makeText(MainActivity15.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
