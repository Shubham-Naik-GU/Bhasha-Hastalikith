package com.danny_jiang.tracingsample;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;
import com.example.tracingsample.R;

public class MainActivity4 extends AppCompatActivity {
    private TracingLetterView letterView4;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main4);
        TracingLetterView tracingLetterView = (TracingLetterView) findViewById(R.id.letter4);
        this.letterView4 = tracingLetterView;
        tracingLetterView.setLetterChar(4);
        this.letterView4.setPointColor(-16776961);
        this.letterView4.setInstructMode(true);
        this.letterView4.setTracingListener(new TracingLetterView.TracingListener() {
            public void onFinish() {
                MediaPlayer.create(MainActivity4.this, R.raw.d).start();
                MainActivity4.this.startActivity(new Intent(MainActivity4.this, MainActivity5.class));
                Toast.makeText(MainActivity4.this, "tracing finished", 0).show();
            }

            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}
