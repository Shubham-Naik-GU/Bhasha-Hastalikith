package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity42 extends AppCompatActivity {
    private TracingLetterView letterView42;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main42);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter42);
        this.letterView42 = tracingLetterView;
        tracingLetterView.setLetterChar(42);
        this.letterView42.setPointColor(-16776961);
        this.letterView42.setInstructMode(true);
        this.letterView42.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity42.this.startActivity(new Intent(MainActivity42.this, MainActivity43.class));
                Toast.makeText(MainActivity42.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
