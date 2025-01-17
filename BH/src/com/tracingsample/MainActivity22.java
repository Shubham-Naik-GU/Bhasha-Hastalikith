package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity22 extends AppCompatActivity {
    private TracingLetterView letterView22;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main22);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter22);
        this.letterView22 = tracingLetterView;
        tracingLetterView.setLetterChar(22);
        this.letterView22.setPointColor(-16776961);
        this.letterView22.setInstructMode(true);
        this.letterView22.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity22.this.startActivity(new Intent(MainActivity22.this, MainActivity23.class));
                Toast.makeText(MainActivity22.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
