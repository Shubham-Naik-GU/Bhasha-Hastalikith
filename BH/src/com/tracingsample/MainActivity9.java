package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity9 extends AppCompatActivity {
    private TracingLetterView letterView9;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main9);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter9);
        this.letterView9 = tracingLetterView;
        tracingLetterView.setLetterChar(9);
        this.letterView9.setPointColor(-16776961);
        this.letterView9.setInstructMode(true);
        this.letterView9.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity9.this.startActivity(new Intent(MainActivity9.this, MainActivity10.class));
                Toast.makeText(MainActivity9.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
