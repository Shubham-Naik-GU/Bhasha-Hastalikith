package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity13 extends AppCompatActivity {
    private TracingLetterView letterView13;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main13);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter13);
        this.letterView13 = tracingLetterView;
        tracingLetterView.setLetterChar(13);
        this.letterView13.setPointColor(-16776961);
        this.letterView13.setInstructMode(true);
        this.letterView13.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity13.this.startActivity(new Intent(MainActivity13.this, MainActivity14.class));
                Toast.makeText(MainActivity13.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
