package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity41 extends AppCompatActivity {
    private TracingLetterView letterView41;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main36);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter36);
        this.letterView41 = tracingLetterView;
        tracingLetterView.setLetterChar(41);
        this.letterView41.setPointColor(-16776961);
        this.letterView41.setInstructMode(true);
        this.letterView41.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity41.this.startActivity(new Intent(MainActivity41.this, MainActivity42.class));
                Toast.makeText(MainActivity41.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
