package com.xguevarax.clase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.contraseña);
    }

    public void login(View view)
    {
        String us = user.getText().toString();
        if (user.getText().toString().equals("David")
                && password.getText().toString().equals("123456")
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Datos invalidos",Toast.LENGTH_LONG).show();
        }
    }
}
