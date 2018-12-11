package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerMedium extends AppCompatActivity {

    TextView viewAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_medium);
        viewAnswer = findViewById(R.id.textView5);

        String answer = QuestionHard.correctAnswer;
        viewAnswer.setText(answer);
        goBackBoard();


    }

    public Button button1;
    public void goBackBoard() {
        button1 = findViewById(R.id.button25);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(AnswerMedium.this, Board.class);
                startActivity(goBack);
            }
        });


    }
}
