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

import java.util.LinkedList;
import java.util.List;

public class QuestionHard extends AppCompatActivity implements View.OnClickListener {

    Button buttonGoBoard;
    Button option1, option2, option3, option4;
    TextView viewQuestionHard;
    static String correctAnswer;
    String[] answerArray = new String[4];
//    public void goBackBoard() {
//        buttonGoMain = findViewById(R.id.buttonhard23);
//        buttonGoMain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent goBack = new Intent(QuestionHard.this, Board.class);
//                startActivity(goBack);
//            }
//        });
//    }

    public void onClick(View v){
        if (v.getId() == R.id.buttonhard23) {
            Intent goBackBoard = new Intent(QuestionHard.this, Board.class);
            startActivity(goBackBoard);
        } else if (v.getId() == R.id.buttonhard20) {
            Intent goQuestion = new Intent(QuestionHard.this, AnswerHard.class);
            startActivity(goQuestion);
        } else if (v.getId() == R.id.buttonhard21) {
            Intent goQuestion = new Intent(QuestionHard.this, AnswerHard.class);
            startActivity(goQuestion);
        } else if (v.getId() == R.id.buttonhard22) {
            Intent goQuestion = new Intent(QuestionHard.this, AnswerHard.class);
            startActivity(goQuestion);
        } else if (v.getId() == R.id.buttonhard25) {
            Intent goQuestion = new Intent(QuestionHard.this, AnswerHard.class);
            startActivity(goQuestion);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_hard);
        //goBackBoard();

        viewQuestionHard = findViewById(R.id.textViewhard6);
        buttonGoBoard = (Button)findViewById(R.id.buttonhard23);
        option1 = (Button)findViewById(R.id.buttonhard20);
        option2 = (Button)findViewById(R.id.buttonhard21);
        option3 = (Button)findViewById(R.id.buttonhard22);
        option4 = (Button)findViewById(R.id.buttonhard25);





        String URL = "https://opentdb.com/api.php?amount=1&difficulty=hard&type=multiple";

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



                    viewQuestionHard.setText(questionAnd);

                    correctAnswer = obj.getString("correct_answer");
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
