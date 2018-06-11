package com.example.moonlight.companyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    String emailS,passS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.email_login);
        pass=(EditText)findViewById(R.id.password_login);

    }
    public void login(View view)
    {
        emailS=email.getText().toString();
        passS=pass.getText().toString();


    }
    public void sign(View view)
    {
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);

    }
}
