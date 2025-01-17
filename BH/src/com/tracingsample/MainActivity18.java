package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity18 extends AppCompatActivity {
    private TracingLetterView letterView18;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main18);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter18);
        this.letterView18 = tracingLetterView;
        tracingLetterView.setLetterChar(18);
        this.letterView18.setPointColor(-16776961);
        this.letterView18.setInstructMode(true);
        this.letterView18.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity18.this.startActivity(new Intent(MainActivity18.this, MainActivity19.class));
                Toast.makeText(MainActivity18.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
