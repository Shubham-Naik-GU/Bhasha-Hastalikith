package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity43 extends AppCompatActivity {
    private TracingLetterView letterView43;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main43);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter43);
        this.letterView43 = tracingLetterView;
        tracingLetterView.setLetterChar(43);
        this.letterView43.setPointColor(-16776961);
        this.letterView43.setInstructMode(true);
        this.letterView43.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity43.this.startActivity(new Intent(MainActivity43.this, MainActivity44.class));
                Toast.makeText(MainActivity43.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
