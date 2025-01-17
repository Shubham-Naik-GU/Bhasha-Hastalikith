package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity27 extends AppCompatActivity {
    private TracingLetterView letterView27;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main27);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter27);
        this.letterView27 = tracingLetterView;
        tracingLetterView.setLetterChar(27);
        this.letterView27.setPointColor(-16776961);
        this.letterView27.setInstructMode(true);
        this.letterView27.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity27.this.startActivity(new Intent(MainActivity27.this, MainActivity28.class));
                Toast.makeText(MainActivity27.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
