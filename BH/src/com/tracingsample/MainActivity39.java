package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity39 extends AppCompatActivity {
    private TracingLetterView letterView39;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main39);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter39);
        this.letterView39 = tracingLetterView;
        tracingLetterView.setLetterChar(39);
        this.letterView39.setPointColor(-16776961);
        this.letterView39.setInstructMode(true);
        this.letterView39.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity39.this.startActivity(new Intent(MainActivity39.this, MainActivity40.class));
                Toast.makeText(MainActivity39.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
