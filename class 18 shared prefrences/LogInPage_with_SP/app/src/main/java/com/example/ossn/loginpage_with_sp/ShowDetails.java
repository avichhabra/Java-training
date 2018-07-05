package com.example.ossn.loginpage_with_sp;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Map;
import java.util.Set;

public class ShowDetails extends AppCompatActivity {

    TextView e1,e2,e3;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        e1=(TextView)findViewById(R.id.textView5);
        e2=(TextView)findViewById(R.id.textView6);
        e3=(TextView)findViewById(R.id.textView7);

        sp=getSharedPreferences("prefer",MODE_PRIVATE);
        final String finalName = sp.getString("regName","");
        final String finalEmail = sp.getString("regEmail","");
        final String finalPassword = sp.getString("regPassword","");

        e1.setText(finalName);
        e2.setText(finalEmail);
        e3.setText(finalPassword);
        }

    }

