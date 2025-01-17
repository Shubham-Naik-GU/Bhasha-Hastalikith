package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity2 extends AppCompatActivity {
    private TracingLetterView letterView2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main2);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter2);
        this.letterView2 = tracingLetterView;
        tracingLetterView.setLetterChar(2);
        this.letterView2.setPointColor(-16776961);
        this.letterView2.setInstructMode(true);
        this.letterView2.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity2.this.startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                Toast.makeText(MainActivity2.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
