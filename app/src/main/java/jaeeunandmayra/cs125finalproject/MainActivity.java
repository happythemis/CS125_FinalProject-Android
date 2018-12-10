package jaeeunandmayra.cs125finalproject;

import android.app.VoiceInteractor;
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
import org.w3c.dom.Text;

import java.net.URL;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    Button buttonStart, buttonHelp;
    //TextView viewQ;

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





    }


}
