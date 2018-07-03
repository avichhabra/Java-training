package com.example.ossn.life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Method created",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Method started",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Method resumed",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Method destroyed",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Method stopped",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    protected void onPause(Bundle savedInstanceState) {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(),"Method paused",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
    }

