package ch.ethz.inf.vs.a2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ch.ethz.inf.vs.a2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTask1(View v){
        Intent i = new Intent(this, RestClientActivity.class);
        startActivity(i);
    }

    public void startTask2(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void startTask3(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}