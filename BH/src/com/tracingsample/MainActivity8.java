package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity8 extends AppCompatActivity {
    private TracingLetterView letterView8;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main8);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter8);
        this.letterView8 = tracingLetterView;
        tracingLetterView.setLetterChar(8);
        this.letterView8.setPointColor(-16776961);
        this.letterView8.setInstructMode(true);
        this.letterView8.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity8.this.startActivity(new Intent(MainActivity8.this, MainActivity9.class));
                Toast.makeText(MainActivity8.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
