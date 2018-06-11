package com.example.moonlight.companyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText email,pass,cpass;
    String emailS,passS,cpassS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email = (EditText) findViewById(R.id.email1);
        pass = (EditText) findViewById(R.id.pass1);
        cpass=(EditText)findViewById(R.id.name1);

    }
    public void register(View view)
    {
        emailS=email.getText().toString();
        passS=pass.getText().toString();
        cpassS=pass.getText().toString();
        RegisterationAndLogin cc = new RegisterationAndLogin(this);
        cc.execute("register",emailS,passS,cpassS);


    }

}
