package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity26 extends AppCompatActivity {
    private TracingLetterView letterView26;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main26);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter26);
        this.letterView26 = tracingLetterView;
        tracingLetterView.setLetterChar(26);
        this.letterView26.setPointColor(-16776961);
        this.letterView26.setInstructMode(true);
        this.letterView26.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity26.this.startActivity(new Intent(MainActivity26.this, MainActivity.class));
                Toast.makeText(MainActivity26.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
