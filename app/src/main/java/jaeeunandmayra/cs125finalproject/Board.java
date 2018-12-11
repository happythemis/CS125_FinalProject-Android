package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Board extends AppCompatActivity implements View.OnClickListener {

    public static int score;

    public Button buttonGoback;
    public Button buttonGoQuestion2, buttonGoQuestion5, buttonGoQuestion6, buttonGoQuestion7, buttonGoQuestion8,
            buttonGoQuestion9, buttonGoQuestion10, buttonGoQuestion11, buttonGoQuestion12, buttonGoQuestion13, buttonGoQuestion14,
            buttonGoQuestion15, buttonGoQuestion16, buttonGoQuestion17, buttonGoQuestion18, buttonGoQuestion19;

    public void onClick(View v){
        if (v.getId() == R.id.button24) {
            Intent goBack = new Intent(Board.this, MainActivity.class);
            startActivity(goBack);
        } else if (v.getId() == R.id.button2 || v.getId() == R.id.button5 || v.getId() == R.id.button6 || v.getId() == R.id.button7) {
            Intent goQuestionHard = new Intent(Board.this, QuestionHard.class);
            startActivity(goQuestionHard);
        } else if (v.getId() == R.id.button8 || v.getId() == R.id.button9 || v.getId() == R.id.button10 || v.getId() == R.id.button11){
            Intent goQuestionMed2 = new Intent(Board.this, QuestionMedium.class);
            startActivity(goQuestionMed2);
        } else if (v.getId() == R.id.button12 || v.getId() == R.id.button13 || v.getId() == R.id.button14 || v.getId() == R.id.button15) {
            Intent goQuestionMed = new Intent(Board.this, QuestionMedium.class);
            startActivity(goQuestionMed);
        } else if (v.getId() == R.id.button16 || v.getId() == R.id.button17 || v.getId() == R.id.button18 || v.getId() == R.id.button19) {
            Intent goQuestion = new Intent(Board.this, Question.class);
            startActivity(goQuestion);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        buttonGoback = (Button)findViewById(R.id.button24);
        buttonGoQuestion2 = (Button)findViewById(R.id.button2);
        buttonGoQuestion5 = (Button)findViewById(R.id.button5);
        buttonGoQuestion6 = (Button)findViewById(R.id.button6);
        buttonGoQuestion7 = (Button)findViewById(R.id.button7);
        buttonGoQuestion8 = (Button)findViewById(R.id.button8);
        buttonGoQuestion9 = (Button)findViewById(R.id.button9);
        buttonGoQuestion10 = (Button)findViewById(R.id.button10);
        buttonGoQuestion11 = (Button)findViewById(R.id.button11);
        buttonGoQuestion12 = (Button)findViewById(R.id.button12);
        buttonGoQuestion13 = (Button)findViewById(R.id.button13);
        buttonGoQuestion14 = (Button)findViewById(R.id.button14);
        buttonGoQuestion15 = (Button)findViewById(R.id.button15);
        buttonGoQuestion16 = (Button)findViewById(R.id.button16);
        buttonGoQuestion17 = (Button)findViewById(R.id.button17);
        buttonGoQuestion18 = (Button)findViewById(R.id.button18);
        buttonGoQuestion19 = (Button)findViewById(R.id.button19);




        buttonGoback.setOnClickListener(this);
        buttonGoQuestion2.setOnClickListener(this);
        buttonGoQuestion5.setOnClickListener(this);
        buttonGoQuestion6.setOnClickListener(this);
        buttonGoQuestion7.setOnClickListener(this);
        buttonGoQuestion8.setOnClickListener(this);
        buttonGoQuestion9.setOnClickListener(this);
        buttonGoQuestion10.setOnClickListener(this);
        buttonGoQuestion11.setOnClickListener(this);
        buttonGoQuestion12.setOnClickListener(this);
        buttonGoQuestion13.setOnClickListener(this);
        buttonGoQuestion14.setOnClickListener(this);
        buttonGoQuestion15.setOnClickListener(this);
        buttonGoQuestion16.setOnClickListener(this);
        buttonGoQuestion17.setOnClickListener(this);
        buttonGoQuestion18.setOnClickListener(this);
        buttonGoQuestion19.setOnClickListener(this);




    }


}
