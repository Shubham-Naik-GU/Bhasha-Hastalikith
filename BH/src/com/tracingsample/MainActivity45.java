package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity45 extends AppCompatActivity {
    private TracingLetterView letterView45;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main45);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter45);
        this.letterView45 = tracingLetterView;
        tracingLetterView.setLetterChar(45);
        this.letterView45.setPointColor(-16776961);
        this.letterView45.setInstructMode(true);
        this.letterView45.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity45.this.startActivity(new Intent(MainActivity45.this, MainActivity46.class));
                Toast.makeText(MainActivity45.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
