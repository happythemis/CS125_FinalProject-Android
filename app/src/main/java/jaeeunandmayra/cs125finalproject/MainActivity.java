package jaeeunandmayra.cs125finalproject;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.net.URL;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    Button buttonStart, buttonHelp;
    public void onClick(View v){
        if (v.getId() == R.id.button3) {
            Intent goStart = new Intent(MainActivity.this, Board.class);
            startActivity(goStart);
        } else if (v.getId() == R.id.button4) {
            Intent goHelp = new Intent(MainActivity.this, Help.class);
            startActivity(goHelp);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = (Button)findViewById(R.id.button3);
        buttonHelp = (Button)findViewById(R.id.button4);

        buttonHelp.setOnClickListener(this);
        buttonStart.setOnClickListener(this);


        String URL = "https://opentdb.com/api.php?amount=16&difficulty=easy&type=multiple";

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.e("Rest Response", response.toString());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Rest Response", error.toString());
            }
        }
        );

        requestQueue.add(objectRequest);


    }


}
