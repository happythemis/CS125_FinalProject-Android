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

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Question extends AppCompatActivity implements View.OnClickListener {
    public boolean right = false;

    Button buttonGoBoard;
    Button option1, option2, option3, option4;
    TextView viewQuestion;
    static String correctAnswer;
    String[] answerArray = new String[4];
//    public void goBackBoard() {
//        buttonGoBoard = findViewById(R.id.button23);
//        buttonGoBoard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent goBack = new Intent(Question.this, Board.class);
//                startActivity(goBack);
//            }
//        });
//
//
//    }

    public void onClick(View v){
        if (v.getId() == R.id.button23) {
            Intent goBackBoard = new Intent(Question.this, Board.class);
            startActivity(goBackBoard);
        } else if (v.getId() == R.id.button20) {
            if (option1.getText().equals(correctAnswer)) {
                Board.score += 100;
            }
            Intent goQuestion = new Intent(Question.this, Answer.class);
            if (option1.getText().equals(answerArray[0])) {
                right = true;
            }
            startActivity(goQuestion);
        } else if (v.getId() == R.id.button21) {
            if (option2.getText().equals(correctAnswer)) {
                Board.score += 100;
            }
            Intent goQuestion = new Intent(Question.this, Answer.class);
            if (option1.getText().equals(answerArray[0])) {
                right = true;
            }
            startActivity(goQuestion);
        } else if (v.getId() == R.id.button22) {
            if (option3.getText().equals(correctAnswer)) {
                Board.score += 100;
            }
            Intent goQuestion = new Intent(Question.this, Answer.class);
            if (option1.getText().equals(answerArray[0])) {
                right = true;
            }
            startActivity(goQuestion);
        } else if (v.getId() == R.id.button25) {
            if (option4.getText().equals(correctAnswer)) {
                Board.score += 100;
            }
            Intent goQuestion = new Intent(Question.this, Answer.class);
            if (option1.getText().equals(answerArray[0])) {
                right = true;
            }
            startActivity(goQuestion);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
       // goBackBoard();

        viewQuestion = findViewById(R.id.textView6);
        buttonGoBoard = (Button)findViewById(R.id.button23);
        option1 = (Button)findViewById(R.id.button20);
        option2 = (Button)findViewById(R.id.button21);
        option3 = (Button)findViewById(R.id.button22);
        option4 = (Button)findViewById(R.id.button25);

        if (right) {
            MainActivity.scoring += 100;
        }



        String URL = "https://opentdb.com/api.php?amount=1&difficulty=easy&type=multiple";

        // RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    //JSONObject main = response.getJSONObject("question");
                    JSONArray arr = response.getJSONArray("results");
                    JSONObject obj = arr.getJSONObject(0);
                    String questionWOEdit = obj.getString("question");
                    String questionApt1 = questionWOEdit.replaceAll("&rsquo;", "'");
                    String questionApt2 = questionApt1.replaceAll("&#039;", "'");
                    String questionQuote = questionApt2.replaceAll("&quot;", "'");
                    String questionAnd = questionQuote.replaceAll("&amp", "&");
                    String questionE= questionAnd.replaceAll("&eacute;", "é");
                    viewQuestion.setText(questionE);

                    String answerWOEdit = obj.getString("correct_answer");
                    String answerApt1 = answerWOEdit.replaceAll("&rsquo;", "'");
                    String answerApt2 = answerApt1.replaceAll("&#039;", "'");
                    String answerQuote = answerApt2.replaceAll("&quot;", "'");
                    String answerE= answerQuote.replaceAll("&eacute;", "é");
                    correctAnswer = answerE.replaceAll("&amp", "&");
                    answerArray[0] = correctAnswer;

                    JSONArray incorrectAnswers = obj.getJSONArray("incorrect_answers");
                    for (int i = 0; i < incorrectAnswers.length(); i++) {
                        answerArray[i + 1] = incorrectAnswers.getString(i);
                    }
                    List<String> listOfAnswer = new LinkedList<>();
                    for (int i = 0; i < answerArray.length; i++) {
                        listOfAnswer.add(answerArray[i]);
                    }
                    List<Integer> listofNum = new LinkedList<>();
                    int cnt = 0;

                    int randomize = (int) (Math.random() * listOfAnswer.size());
                    listofNum.add(randomize);
                    cnt++;

                    while (cnt < 4) {
                        randomize = (int) (Math.random() * listOfAnswer.size());
                        if (!listofNum.contains(randomize)) {
                            listofNum.add(randomize);
                            cnt++;
                        }
                    }

                    option1.setText(answerArray[listofNum.get(0)]);
                    option2.setText(answerArray[listofNum.get(1)]);
                    option3.setText(answerArray[listofNum.get(2)]);
                    option4.setText(answerArray[listofNum.get(3)]);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Log.e("Rest Response", response.toString());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Rest Response", error.toString());
            }
        }
        );

        //requestQueue.add(objectRequest);
        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(objectRequest);

        buttonGoBoard.setOnClickListener(this);
        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
    }
}
