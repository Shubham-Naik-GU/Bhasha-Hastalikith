package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity28 extends AppCompatActivity {
    private TracingLetterView letterView26;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main28);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter28);
        this.letterView26 = tracingLetterView;
        tracingLetterView.setLetterChar(28);
        this.letterView26.setPointColor(-16776961);
        this.letterView26.setInstructMode(true);
        this.letterView26.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity28.this.startActivity(new Intent(MainActivity28.this, MainActivity29.class));
                Toast.makeText(MainActivity28.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
