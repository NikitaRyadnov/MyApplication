package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{


    private List<Category> categoryList;
    IDataProvider data;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        data = new MockupDataProvider();

        categoryList = data.getCategory();
       //  получаем экземпляр элемента ListView
        listView = (ListView)findViewById(R.id.categ);
        //final String[] Names = new String[]{"f", "g"};
         //определяем массив типа String
        String[] Names = new String[categoryList.size()];
        for(int i = 0; i < categoryList.size(); i++){
            Category cat = categoryList.get(i);
            Names[i] = cat.getName();
        }

        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Names);

        listView.setAdapter(adapter);
    }

    public void onClick(View v) {}
}
