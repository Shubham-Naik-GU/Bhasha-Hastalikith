package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity37 extends AppCompatActivity {
    private TracingLetterView letterView37;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main37);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter37);
        this.letterView37 = tracingLetterView;
        tracingLetterView.setLetterChar(37);
        this.letterView37.setPointColor(-16776961);
        this.letterView37.setInstructMode(true);
        this.letterView37.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity37.this.startActivity(new Intent(MainActivity37.this, MainActivity38.class));
                Toast.makeText(MainActivity37.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
