package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity51 extends AppCompatActivity {
    private TracingLetterView letterView51;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main51);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter51);
        this.letterView51 = tracingLetterView;
        tracingLetterView.setLetterChar(51);
        this.letterView51.setPointColor(-16776961);
        this.letterView51.setInstructMode(true);
        this.letterView51.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity51.this.startActivity(new Intent(MainActivity51.this, MainActivity52.class));
                Toast.makeText(MainActivity51.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
