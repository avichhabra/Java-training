package com.example.ossn.loginpage_with_sp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInPage extends AppCompatActivity {
   EditText e1,e2;
   String logName,logPass,regName,regPass,regEmail;
    SharedPreferences sp;
    Button login,Register;
    //SharedPreferences sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
        e1=(EditText)findViewById(R.id.editText6);
        e2=(EditText)findViewById(R.id.editText7);




        login=(Button)findViewById(R.id.button6);

        //sp1 = getSharedPreferences("log_pref", MODE_PRIVATE);
        //SharedPreferences.Editor edit = sp1.edit();

        //edit.putString("final_name",regName);
        //edit.putString("final_email",regEmail);

        sp=getSharedPreferences("prefer", MODE_PRIVATE);
        regName=sp.getString("regName","");
        regPass=sp.getString("regPassword","");
        regEmail=sp.getString("regEmail","");

        logName = e1.getText().toString();
        logPass = e2.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(logName.equals(regName) && logPass.equals(regPass)) {

                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(),ShowDetails.class);
                    startActivity(i);


                }

                else {
                    Toast.makeText(getApplicationContext(), "kindly Login", Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(getApplicationContext(),RegisterPage.class);
                    startActivity(i1);
                }

            }
        });
    }
}
