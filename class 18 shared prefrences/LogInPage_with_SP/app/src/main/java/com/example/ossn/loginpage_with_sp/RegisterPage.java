package com.example.ossn.loginpage_with_sp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterPage extends AppCompatActivity {
    EditText et1,et2,et3;
    Button b1,b2;
    String Name,Email,Pass;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sp = getSharedPreferences("prefer", MODE_PRIVATE);
                SharedPreferences.Editor edit = sp.edit();


                Name = et1.getText().toString();
                Email = et2.getText().toString();
                Pass = et3.getText().toString();

                edit.putString("regName",Name);
                edit.putString("regEmail",Email);
                edit.putString("regPassword",Pass);
                edit.commit();

                Intent i = new Intent(getApplicationContext(),LogInPage.class);
                startActivity(i);




            }
        });


    }
}
