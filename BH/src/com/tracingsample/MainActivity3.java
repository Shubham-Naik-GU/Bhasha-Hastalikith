package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity3 extends AppCompatActivity {
    private TracingLetterView letterView3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main3);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter3);
        this.letterView3 = tracingLetterView;
        tracingLetterView.setLetterChar(3);
        this.letterView3.setPointColor(-16776961);
        this.letterView3.setInstructMode(true);
        this.letterView3.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity3.this.startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                Toast.makeText(MainActivity3.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
