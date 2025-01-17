package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity46 extends AppCompatActivity {
    private TracingLetterView letterView46;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main46);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter46);
        this.letterView46 = tracingLetterView;
        tracingLetterView.setLetterChar(46);
        this.letterView46.setPointColor(-16776961);
        this.letterView46.setInstructMode(true);
        this.letterView46.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity46.this.startActivity(new Intent(MainActivity46.this, MainActivity47.class));
                Toast.makeText(MainActivity46.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
