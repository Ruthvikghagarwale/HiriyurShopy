package com.example.hiriyurshopy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        //To set the timer for logo
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent i = new Intent(getApplicationContext(), Groceries.class);
                    startActivity(i);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}