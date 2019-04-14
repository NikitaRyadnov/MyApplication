package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private EditText name;
    private EditText lname;
    private EditText mail;
    private EditText login;
    private EditText pass;
    private EditText rpass;
    private TextView label;
    DemoDataProvider data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.reg1);
        name = (EditText) findViewById(R.id.FName1);
        lname = (EditText) findViewById(R.id.LName1);
        mail = (EditText) findViewById(R.id.Mail1);
        login = (EditText) findViewById(R.id.Login1);
        pass = (EditText) findViewById(R.id.Pass1);
        rpass = (EditText) findViewById(R.id.RPass1);
        label = (TextView) findViewById(R.id.label1);
        button.setOnClickListener(this);


        data = new DemoDataProvider();
    }

    @Override
    public void onClick(View v) {
        String Sname = name.getText().toString();
        String Slname = lname.getText().toString();
        String Smail = mail.getText().toString();
        String Slogin = login.getText().toString();
        String Spass = pass.getText().toString();
        String Srpass = rpass.getText().toString();
        if(!Sname.isEmpty() && !Slname.isEmpty() && !Smail.isEmpty() && !Slogin.isEmpty() && !Spass.isEmpty() && Spass.equals(Srpass)) {
            boolean boolId = true;
            for (int i = 1; ; i++) {
                boolId = true;
                for (Person person : data.getPerson()) {
                    if (person.getId() == i)
                        boolId = false;
                }
                if (boolId) {
                    data.addPerson(new Person(i, Sname, Slname, Smail, Slogin, Spass));
                    break;
                }
            }
        }
        else{
            label.setText("Вы ввели неверные данные!");
        }
    }
}
