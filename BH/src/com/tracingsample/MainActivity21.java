package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity21 extends AppCompatActivity {
    private TracingLetterView letterView21;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main21);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter21);
        this.letterView21 = tracingLetterView;
        tracingLetterView.setLetterChar(21);
        this.letterView21.setPointColor(-16776961);
        this.letterView21.setInstructMode(true);
        this.letterView21.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity21.this.startActivity(new Intent(MainActivity21.this, MainActivity22.class));
                Toast.makeText(MainActivity21.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
