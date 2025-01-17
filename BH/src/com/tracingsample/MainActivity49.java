package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity49 extends AppCompatActivity {
    private TracingLetterView letterView49;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main49);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter49);
        this.letterView49 = tracingLetterView;
        tracingLetterView.setLetterChar(49);
        this.letterView49.setPointColor(-16776961);
        this.letterView49.setInstructMode(true);
        this.letterView49.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity49.this.startActivity(new Intent(MainActivity49.this, MainActivity50.class));
                Toast.makeText(MainActivity49.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
