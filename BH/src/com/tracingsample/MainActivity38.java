package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity38 extends AppCompatActivity {
    private TracingLetterView letterView38;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main38);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter38);
        this.letterView38 = tracingLetterView;
        tracingLetterView.setLetterChar(38);
        this.letterView38.setPointColor(-16776961);
        this.letterView38.setInstructMode(true);
        this.letterView38.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MainActivity38.this.startActivity(new Intent(MainActivity38.this, MainActivity39.class));
                Toast.makeText(MainActivity38.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
