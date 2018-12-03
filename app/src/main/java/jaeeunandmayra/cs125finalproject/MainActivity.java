package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button button1;
    public void goHelp() {
        button1 = (Button)findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playHelp = new Intent(MainActivity.this, Help.class);
                startActivity(playHelp);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goHelp();
    }

//    public void goGame(View view) {
////        Log.d(LOG_TAG,  )
//
//    }
//    public void goHelp(View v) {
//        Button button = (Button) v;
//        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
//    }
}
