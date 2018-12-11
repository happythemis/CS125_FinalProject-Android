package jaeeunandmayra.cs125finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerHard extends AppCompatActivity {


    TextView viewAnswerHard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_hard);
        viewAnswerHard = findViewById(R.id.textView5);

        String answer = QuestionHard.correctAnswer;
        viewAnswerHard.setText(answer);
    }
}
