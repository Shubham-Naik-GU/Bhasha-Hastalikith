package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity29 extends AppCompatActivity {
    private TracingLetterView letterView29;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main29);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter29);
        this.letterView29 = tracingLetterView;
        tracingLetterView.setLetterChar(29);
        this.letterView29.setPointColor(-16776961);
        this.letterView29.setInstructMode(true);
        this.letterView29.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity29.this.startActivity(new Intent(MainActivity29.this, MainActivity30.class));
                Toast.makeText(MainActivity29.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
