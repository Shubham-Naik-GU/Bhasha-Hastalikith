package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity40 extends AppCompatActivity {
    private TracingLetterView letterView40;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main40);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter40);
        this.letterView40 = tracingLetterView;
        tracingLetterView.setLetterChar(40);
        this.letterView40.setPointColor(-16776961);
        this.letterView40.setInstructMode(true);
        this.letterView40.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity40.this.startActivity(new Intent(MainActivity40.this, MainActivity41.class));
                Toast.makeText(MainActivity40.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
