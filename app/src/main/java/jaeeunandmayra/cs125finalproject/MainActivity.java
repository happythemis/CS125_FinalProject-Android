package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


    }


}
