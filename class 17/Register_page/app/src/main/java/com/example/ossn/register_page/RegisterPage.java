package com.example.ossn.register_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {
    Button b;
    EditText et,et1;
    String p,u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        et =findViewById(R.id.editText);
        et1=findViewById(R.id.editText2);

        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=et.getText().toString();
                String p=et1.getText().toString();
                Toast t = Toast.makeText(RegisterPage.this,u+" / "+p, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP,0,0);
                t.show();
                Intent i = new Intent(getApplicationContext(),LogInPage.class);
                i.putExtra("name",u);
                i.putExtra("password",p);
                startActivity(i);


            }
        });
    }
}
