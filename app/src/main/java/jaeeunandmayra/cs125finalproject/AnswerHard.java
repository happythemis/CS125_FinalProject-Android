package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        goBackBoard();


    }

    public Button button1;
    public void goBackBoard() {
        button1 = findViewById(R.id.button25);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(AnswerHard.this, Board.class);
                startActivity(goBack);
            }
        });


    }
}
