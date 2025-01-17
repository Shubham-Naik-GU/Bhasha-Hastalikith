package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity1 extends AppCompatActivity {
    private TracingLetterView letterView1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main1);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter1);
        this.letterView1 = tracingLetterView;
        tracingLetterView.setLetterChar(1);
        this.letterView1.setPointColor(-16776961);
        this.letterView1.setInstructMode(true);
        this.letterView1.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity1.this.startActivity(new Intent(MainActivity1.this, MainActivity2.class));
                Toast.makeText(MainActivity1.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
