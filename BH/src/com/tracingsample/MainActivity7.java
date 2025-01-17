package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity7 extends AppCompatActivity {
    private TracingLetterView letterView7;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main7);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter7);
        this.letterView7 = tracingLetterView;
        tracingLetterView.setLetterChar(7);
        this.letterView7.setPointColor(-16776961);
        this.letterView7.setInstructMode(true);
        this.letterView7.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity7.this.startActivity(new Intent(MainActivity7.this, MainActivity8.class));
                Toast.makeText(MainActivity7.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
