package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Board extends AppCompatActivity implements View.OnClickListener {

    public Button buttonGoback, buttonGoQueation;
//    public void goBackMain() {
//        buttonGoback = findViewById(R.id.button24);
//        buttonGoback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent goBack = new Intent(Board.this, MainActivity.class);
//                startActivity(goBack);
//            }
//        });
//
//
//    }
    public void onClick(View v){
        if (v.getId() == R.id.button24) {
            Intent goBack = new Intent(Board.this, MainActivity.class);
            startActivity(goBack);
        } else if (v.getId() == R.id.button2) {
            Intent goQuestion = new Intent(Board.this, Question.class);
            startActivity(goQuestion);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
       // goBackMain();
        buttonGoback = (Button)findViewById(R.id.button24);
        buttonGoQueation = (Button)findViewById(R.id.button2);

        buttonGoback.setOnClickListener(this);
        buttonGoQueation.setOnClickListener(this);
    }


}
