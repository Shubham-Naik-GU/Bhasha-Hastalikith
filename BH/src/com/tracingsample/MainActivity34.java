package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity34 extends AppCompatActivity {
    private TracingLetterView letterView34;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main34);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter34);
        this.letterView34 = tracingLetterView;
        tracingLetterView.setLetterChar(34);
        this.letterView34.setPointColor(-16776961);
        this.letterView34.setInstructMode(true);
        this.letterView34.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity34.this.startActivity(new Intent(MainActivity34.this, MainActivity35.class));
                Toast.makeText(MainActivity34.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
