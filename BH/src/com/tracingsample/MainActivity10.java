package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity10 extends AppCompatActivity {
    private TracingLetterView letterView10;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main10);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter10);
        this.letterView10 = tracingLetterView;
        tracingLetterView.setLetterChar(10);
        this.letterView10.setPointColor(-16776961);
        this.letterView10.setInstructMode(true);
        this.letterView10.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity10.this.startActivity(new Intent(MainActivity10.this, MainActivity11.class));
                Toast.makeText(MainActivity10.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
