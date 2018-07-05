package com.example.ossn.register_page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInPage extends AppCompatActivity {
    Bundle d;
    EditText loginName, loginPass;
    String regName, regPass, logName, logPass;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
        loginName = (EditText) findViewById(R.id.editText3);
        loginPass = (EditText) findViewById(R.id.editText4);



        //Toast.makeText(LogInPage.this, regName + " " + regPass, Toast.LENGTH_SHORT).show();

        logName = loginName.getText().toString();
        logPass = loginPass.getText().toString();
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle d = getIntent().getExtras();
                regName = d.getString("name");
                regPass = d.getString("password");

                logName = loginName.getText().toString();
                logPass = loginPass.getText().toString();

                if (logName.equals(regName) && logPass.equals(regPass)) {
                    Toast.makeText(getApplicationContext(), " login success", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "username or password mismatch", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}