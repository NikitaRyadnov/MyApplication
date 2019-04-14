package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button = (Button) findViewById(R.id.sign_in);
    private EditText login = (EditText) findViewById(R.id.login);
    private EditText pass = (EditText) findViewById(R.id.password);
    private TextView label = (TextView) findViewById(R.id.label);
    DemoDataProvider data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(this);

        data = new DemoDataProvider();
    }

    @Override
    public void onClick(View v) {
        if (data != null && data.getPerson() != null) {
            String userLogin = login.getText().toString();
            String userPassword = pass.getText().toString();
            for (Person person : data.getPerson()) {
                if (person != null) {
                    if ((userLogin.equals(person.getLogin()) || userLogin.equals(person.getEmail())) && userPassword.equals(person.getPassword())) {
                        label.setText("Вход выполнен!");
                        return;
                    }
                }
            }
        }
        else{
            label.setText("Ошибка входа");
        }
    }
}
