package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity11 extends AppCompatActivity {
    private TracingLetterView letterView11;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main11);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter11);
        this.letterView11 = tracingLetterView;
        tracingLetterView.setLetterChar(11);
        this.letterView11.setPointColor(-16776961);
        this.letterView11.setInstructMode(true);
        this.letterView11.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity11.this.startActivity(new Intent(MainActivity11.this, MainActivity12.class));
                Toast.makeText(MainActivity11.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
