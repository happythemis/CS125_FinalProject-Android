package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    Button buttonStart, buttonHelp;
//    public Button button1;
//    public void goHelp() {
//        button1 = (Button)findViewById(R.id.button4);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent playHelp = new Intent(MainActivity.this, Help.class);
//                startActivity(playHelp);
//            }
//
//        });
//
//
//
//
//    }
//    public Button button2;
//    public void goStart() {
//        button2 = findViewById(R.id.button3);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent goStart = new Intent(MainActivity.this, questionBoard.class);
//                startActivity(goStart);
//            }
//        });
//
//
//    }

    public void onClick(View v){
        if (v.getId() == R.id.button3) {
            Intent goStart = new Intent(MainActivity.this, questionBoard.class);
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
//        goHelp();
//        goStart();

        buttonStart = (Button)findViewById(R.id.button3);
        buttonHelp = (Button)findViewById(R.id.button4);

        buttonHelp.setOnClickListener(this);
        buttonStart.setOnClickListener(this);


    }


}
