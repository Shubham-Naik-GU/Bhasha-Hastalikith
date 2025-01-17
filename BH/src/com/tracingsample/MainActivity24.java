package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity24 extends AppCompatActivity {
    private TracingLetterView letterView24;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main24);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter24);
        this.letterView24 = tracingLetterView;
        tracingLetterView.setLetterChar(24);
        this.letterView24.setPointColor(-16776961);
        this.letterView24.setInstructMode(true);
        this.letterView24.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity24.this.startActivity(new Intent(MainActivity24.this, MainActivity25.class));
                Toast.makeText(MainActivity24.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
