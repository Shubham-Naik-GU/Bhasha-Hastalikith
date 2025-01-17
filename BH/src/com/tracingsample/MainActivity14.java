package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity14 extends AppCompatActivity {
    private TracingLetterView letterView14;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main14);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter14);
        this.letterView14 = tracingLetterView;
        tracingLetterView.setLetterChar(14);
        this.letterView14.setPointColor(-16776961);
        this.letterView14.setInstructMode(true);
        this.letterView14.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity14.this.startActivity(new Intent(MainActivity14.this, MainActivity15.class));
                Toast.makeText(MainActivity14.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
