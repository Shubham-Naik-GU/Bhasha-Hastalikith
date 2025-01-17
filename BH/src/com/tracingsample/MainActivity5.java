package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity5 extends AppCompatActivity {
    private TracingLetterView letterView5;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main5);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter5);
        this.letterView5 = tracingLetterView;
        tracingLetterView.setLetterChar(5);
        this.letterView5.setPointColor(-16776961);
        this.letterView5.setInstructMode(true);
        this.letterView5.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity5.this.startActivity(new Intent(MainActivity5.this, MainActivity6.class));
                Toast.makeText(MainActivity5.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
