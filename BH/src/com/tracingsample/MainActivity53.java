package com.danny_jiang.tracingsample;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tracingsample.R;

public class MainActivity53 extends AppCompatActivity implements View.OnClickListener {
    private static ImageView imageView;
    Button ansA;
    Button ansB;
    Button ansC;
    Button ansD;
    int currentQuestionIndex = 0;
    private int current_image;
    int[] images = {R.drawable.af, R.drawable.bf, R.drawable.mf, R.drawable.of, R.drawable.gf, R.drawable.wf, R.drawable.sf, R.drawable.pof, R.drawable.pif, R.drawable.ccf, R.drawable.grf, R.drawable.jkf, R.drawable.lf, R.drawable.pf, R.drawable.tof, R.drawable.cef};
    TextView questionTextView;
    int score = 0;
    String selectedAnswer = "";
    Button submitBtn;
    int totalQuestion = QuestionAnswer.question.length;
    TextView totalQuestionsTextView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main53);
        this.totalQuestionsTextView = (TextView) findViewById(R.id.total_question);
        this.questionTextView = (TextView) findViewById(R.id.question);
        imageView = (ImageView) findViewById(R.id.imageView);
        this.ansA = (Button) findViewById(R.id.ans_A);
        this.ansB = (Button) findViewById(R.id.ans_B);
        this.ansC = (Button) findViewById(R.id.ans_C);
        this.ansD = (Button) findViewById(R.id.ans_D);
        this.submitBtn = (Button) findViewById(R.id.submit_btn);
        this.ansA.setOnClickListener(this);
        this.ansB.setOnClickListener(this);
        this.ansC.setOnClickListener(this);
        this.ansD.setOnClickListener(this);
        this.submitBtn.setOnClickListener(this);
        TextView textView = this.totalQuestionsTextView;
        textView.setText("Total questions : " + this.totalQuestion);
        loadNewQuestion();
    }

    public void onClick(View view) {
        this.ansA.setBackgroundColor(-1);
        this.ansB.setBackgroundColor(-1);
        this.ansC.setBackgroundColor(-1);
        this.ansD.setBackgroundColor(-1);
        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.submit_btn) {
            int i = this.current_image + 1;
            this.current_image = i;
            int[] iArr = this.images;
            int length = i % iArr.length;
            this.current_image = length;
            imageView.setImageResource(iArr[length]);
            if (this.selectedAnswer.equals(QuestionAnswer.correctAnswers[this.currentQuestionIndex])) {
                this.score++;
            }
            this.currentQuestionIndex++;
            loadNewQuestion();
            return;
        }
        this.selectedAnswer = clickedButton.getText().toString();
        clickedButton.setBackgroundColor(-16711936);
    }

    /* access modifiers changed from: package-private */
    public void loadNewQuestion() {
        if (this.currentQuestionIndex == this.totalQuestion) {
            finishQuiz();
            return;
        }
        this.questionTextView.setText(QuestionAnswer.question[this.currentQuestionIndex]);
        this.ansA.setText(QuestionAnswer.choices[this.currentQuestionIndex][0]);
        this.ansB.setText(QuestionAnswer.choices[this.currentQuestionIndex][1]);
        this.ansC.setText(QuestionAnswer.choices[this.currentQuestionIndex][2]);
        this.ansD.setText(QuestionAnswer.choices[this.currentQuestionIndex][3]);
    }

    /* access modifiers changed from: package-private */
    public void finishQuiz() {
        String passStatus;
        if (((double) this.score) > ((double) this.totalQuestion) * 0.6d) {
            passStatus = "Passed";
        } else {
            passStatus = "Failed";
        }
        AlertDialog.Builder title = new AlertDialog.Builder(this).setTitle(passStatus);
        title.setMessage("Score is " + this.score + " out of " + this.totalQuestion).setPositiveButton("Restart", new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity53.this.lambda$finishQuiz$0$MainActivity53(dialogInterface, i);
            }
        }).setCancelable(false).show();
    }

    public /* synthetic */ void lambda$finishQuiz$0$MainActivity53(DialogInterface dialogInterface, int i) {
        restartQuiz();
    }

    /* access modifiers changed from: package-private */
    public void restartQuiz() {
        this.score = 0;
        this.currentQuestionIndex = 0;
        loadNewQuestion();
    }
}
