package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity19 extends AppCompatActivity {
    private TracingLetterView letterView19;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main19);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter19);
        this.letterView19 = tracingLetterView;
        tracingLetterView.setLetterChar(19);
        this.letterView19.setPointColor(-16776961);
        this.letterView19.setInstructMode(true);
        this.letterView19.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity19.this.startActivity(new Intent(MainActivity19.this, MainActivity20.class));
                Toast.makeText(MainActivity19.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
