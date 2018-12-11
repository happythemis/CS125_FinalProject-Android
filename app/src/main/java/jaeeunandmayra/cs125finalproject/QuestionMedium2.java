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

public class QuestionMedium2 extends AppCompatActivity {


    Button buttonGoMain;
    TextView viewQuestion;
    public void goBackBoard() {
        buttonGoMain = findViewById(R.id.button23med);
        buttonGoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(QuestionMedium2.this, Board.class);
                startActivity(goBack);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_medium2);

        viewQuestion = findViewById(R.id.textView6med);





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
                    String question = obj.getString("question");

                    viewQuestion.setText(question);






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
    }

}
