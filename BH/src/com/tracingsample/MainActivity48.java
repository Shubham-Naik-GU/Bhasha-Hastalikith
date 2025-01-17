package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity48 extends AppCompatActivity {
    private TracingLetterView letterView48;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main48);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter48);
        this.letterView48 = tracingLetterView;
        tracingLetterView.setLetterChar(48);
        this.letterView48.setPointColor(-16776961);
        this.letterView48.setInstructMode(true);
        this.letterView48.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity48.this.startActivity(new Intent(MainActivity48.this, MainActivity49.class));
                Toast.makeText(MainActivity48.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
