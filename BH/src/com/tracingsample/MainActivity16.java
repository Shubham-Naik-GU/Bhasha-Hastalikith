package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity16 extends AppCompatActivity {
    private TracingLetterView letterView16;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main16);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter16);
        this.letterView16 = tracingLetterView;
        tracingLetterView.setLetterChar(16);
        this.letterView16.setPointColor(-16776961);
        this.letterView16.setInstructMode(true);
        this.letterView16.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity16.this.startActivity(new Intent(MainActivity16.this, MainActivity17.class));
                Toast.makeText(MainActivity16.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
