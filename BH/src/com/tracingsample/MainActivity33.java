package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity33 extends AppCompatActivity {
    private TracingLetterView letterView33;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main33);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter33);
        this.letterView33 = tracingLetterView;
        tracingLetterView.setLetterChar(33);
        this.letterView33.setPointColor(-16776961);
        this.letterView33.setInstructMode(true);
        this.letterView33.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity33.this.startActivity(new Intent(MainActivity33.this, MainActivity34.class));
                Toast.makeText(MainActivity33.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
