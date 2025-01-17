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

public class MainActivity54 extends AppCompatActivity implements View.OnClickListener {
    private static ImageView imageView1;
    Button ansA;
    Button ansB;
    Button ansC;
    Button ansD;
    int currentQuestionIndex = 0;
    private int current_image;
    int[] images1 = {R.drawable.cf, R.drawable.df, R.drawable.ff, R.drawable.hf, R.drawable.lif, R.drawable.kf, R.drawable.rf, R.drawable.tf, R.drawable.zf, R.drawable.deef, R.drawable.cof, R.drawable.crf, R.drawable.bef, R.drawable.wwf, R.drawable.mof, R.drawable.ef};
    TextView questionTextView;
    int score = 0;
    String selectedAnswer = "";
    Button submitBtn;
    int totalQuestion = QuestionAnswer1.question.length;
    TextView totalQuestionsTextView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main54);
        this.totalQuestionsTextView = (TextView) findViewById(R.id.total_question);
        this.questionTextView = (TextView) findViewById(R.id.question);
        imageView1 = (ImageView) findViewById(R.id.imageviewA);
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
            int[] iArr = this.images1;
            int length = i % iArr.length;
            this.current_image = length;
            imageView1.setImageResource(iArr[length]);
            if (this.selectedAnswer.equals(QuestionAnswer1.correctAnswers[this.currentQuestionIndex])) {
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
        this.questionTextView.setText(QuestionAnswer1.question[this.currentQuestionIndex]);
        this.ansA.setText(QuestionAnswer1.choices[this.currentQuestionIndex][0]);
        this.ansB.setText(QuestionAnswer1.choices[this.currentQuestionIndex][1]);
        this.ansC.setText(QuestionAnswer1.choices[this.currentQuestionIndex][2]);
        this.ansD.setText(QuestionAnswer1.choices[this.currentQuestionIndex][3]);
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
                MainActivity54.this.lambda$finishQuiz$0$MainActivity54(dialogInterface, i);
            }
        }).setCancelable(false).show();
    }

    public /* synthetic */ void lambda$finishQuiz$0$MainActivity54(DialogInterface dialogInterface, int i) {
        restartQuiz();
    }

    /* access modifiers changed from: package-private */
    public void restartQuiz() {
        this.score = 0;
        this.currentQuestionIndex = 0;
        loadNewQuestion();
    }
}
