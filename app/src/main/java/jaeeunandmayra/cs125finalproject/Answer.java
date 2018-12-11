package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Answer extends AppCompatActivity {

    TextView viewAnswer, viewScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        viewAnswer = findViewById(R.id.textView5);
        viewScore = findViewById(R.id.textView8);


        String answer = Question.correctAnswer;
        viewAnswer.setText(answer);

        String currScore = Integer.toString(Board.score);
        viewScore.setText(currScore);

        goBackBoard();


    }

    public Button button1;
    public void goBackBoard() {
        button1 = findViewById(R.id.button25);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(Answer.this, Board.class);
                startActivity(goBack);
            }
        });


    }
}
