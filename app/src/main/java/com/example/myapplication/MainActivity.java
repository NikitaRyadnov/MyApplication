package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;

import android.widget.EditText;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button, button1;
    private EditText login;
    private EditText pass;
    private TextView label;
    IDataProvider data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.sign_in);
        button1 = (Button) findViewById(R.id.reg);
        login = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.password);
        label = (TextView) findViewById(R.id.label);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);


        data = new DemoDataProvider();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_in:
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
                label.setText("Ошибка входа!");
                break;
            case R.id.reg:
                //label.setText("Вход выполнен!");
                Intent intent = new Intent(this, Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.category1:
                Intent intent1 = new Intent(this, Main2Activity.class);
                startActivity(intent1);
                break;
        }
    }
}
