package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Board extends AppCompatActivity implements View.OnClickListener {
    public static int counter = 0;
    public static int counter2 = 0;
    public static int counter3 = 0;
    public static int counter4 = 0;
    public static int counter5 = 0;
    public static int counter6 = 0;
    public static int counter7 = 0;
    public static int counter8 = 0;
    public static int counter12 = 0;
    public static int counter13 = 0;
    public static int counter14 = 0;
    public static int counter15 = 0;
    public static int counter16 = 0;
    public static int counter17 = 0;
    public static int counter18 = 0;
    public static int counter19 = 0;

    public static int score;

    public Button buttonGoback;
    public Button buttonGoQuestion2, buttonGoQuestion5, buttonGoQuestion6, buttonGoQuestion7, buttonGoQuestion8,
            buttonGoQuestion9, buttonGoQuestion10, buttonGoQuestion11, buttonGoQuestion12, buttonGoQuestion13, buttonGoQuestion14,
            buttonGoQuestion15, buttonGoQuestion16, buttonGoQuestion17, buttonGoQuestion18, buttonGoQuestion19;

    public void onClick(View v) {
        if (v.getId() == R.id.button24) {
            Intent goBack = new Intent(Board.this, MainActivity.class);
            startActivity(goBack);
        } else if (v.getId() == R.id.button2 || v.getId() == R.id.button5 || v.getId() == R.id.button6 || v.getId() == R.id.button7) {
            Intent goQuestionHard = new Intent(Board.this, QuestionHard.class);
            if (v.getId() == R.id.button2) {
                if (counter == 0) {
                    startActivity(goQuestionHard);
                }
                buttonGoQuestion2.setEnabled(false);
                counter++;
            }
            if (v.getId() == R.id.button5) {
                if (counter2 == 0) {
                    startActivity(goQuestionHard);
                }
                buttonGoQuestion5.setEnabled(false);
                counter2++;
            }
            if (v.getId() == R.id.button6) {
                if (counter3 == 0) {
                    startActivity(goQuestionHard);
                }
                buttonGoQuestion6.setEnabled(false);
                counter3++;
            }
            if (v.getId() == R.id.button7) {
                if (counter4 == 0) {
                    startActivity(goQuestionHard);
                }
                buttonGoQuestion7.setEnabled(false);
                counter4++;
            }
        } else if (v.getId() == R.id.button8 || v.getId() == R.id.button9 || v.getId() == R.id.button10 || v.getId() == R.id.button11){
            Intent goQuestionMed2 = new Intent(Board.this, QuestionInterm.class);
            if (v.getId() == R.id.button8) {
                if (counter5 == 0) {
                    startActivity(goQuestionMed2);
                }
                buttonGoQuestion8.setEnabled(false);
                counter5++;
            }
            if (v.getId() == R.id.button9) {
                if (counter6 == 0) {
                    startActivity(goQuestionMed2);
                }
                buttonGoQuestion9.setEnabled(false);
                counter6++;
            }
            if (v.getId() == R.id.button10) {
                if (counter7 == 0) {
                    startActivity(goQuestionMed2);
                }
                buttonGoQuestion10.setEnabled(false);
                counter7++;
            }
            if (v.getId() == R.id.button11) {
                if (counter8 == 0) {
                    startActivity(goQuestionMed2);
                }
                buttonGoQuestion11.setEnabled(false);
                counter8++;
            }
        } else if (v.getId() == R.id.button12 || v.getId() == R.id.button13 || v.getId() == R.id.button14 || v.getId() == R.id.button15) {
            Intent goQuestionMed = new Intent(Board.this, QuestionMedium.class);
            if (v.getId() == R.id.button12) {
                if (counter12 == 0) {
                    startActivity(goQuestionMed);
                }
                buttonGoQuestion12.setEnabled(false);
                counter12++;
            }
            if (v.getId() == R.id.button13) {
                if (counter13 == 0) {
                    startActivity(goQuestionMed);
                }
                buttonGoQuestion13.setEnabled(false);
                counter13++;
            }
            if (v.getId() == R.id.button14) {
                if (counter14 == 0) {
                    startActivity(goQuestionMed);
                }
                buttonGoQuestion14.setEnabled(false);
                counter14++;
            }
            if (v.getId() == R.id.button15) {
                if (counter15 == 0) {
                    startActivity(goQuestionMed);
                }
                buttonGoQuestion15.setEnabled(false);
                counter15++;
            }
        } else if (v.getId() == R.id.button16 || v.getId() == R.id.button17 || v.getId() == R.id.button18 || v.getId() == R.id.button19) {
            Intent goQuestion = new Intent(Board.this, Question.class);
            if (v.getId() == R.id.button16) {
                if (counter16 == 0) {
                    startActivity(goQuestion);
                }
                buttonGoQuestion16.setEnabled(false);
                counter16++;
            }
            if (v.getId() == R.id.button17) {
                if (counter17 == 0) {
                    startActivity(goQuestion);
                }
                buttonGoQuestion17.setEnabled(false);
                counter17++;
            }
            if (v.getId() == R.id.button18) {
                if (counter18 == 0) {
                    startActivity(goQuestion);
                }
                buttonGoQuestion18.setEnabled(false);
                counter18++;
            }
            if (v.getId() == R.id.button19) {
                if (counter19 == 0) {
                    startActivity(goQuestion);
                }
                buttonGoQuestion19.setEnabled(false);
                counter19++;
            }
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
