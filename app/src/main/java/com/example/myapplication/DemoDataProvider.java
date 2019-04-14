package com.example.myapplication;


import java.util.List;
import java.util.ArrayList;

public class DemoDataProvider implements IDataProvider {
private List<Person> person = new ArrayList<>();

public DemoDataProvider(){
person.add(new Person ("1", "Nikita", "Ryadnov", "nik@mail.com", "xax", "12345"));
}

    public List<Person> getPerson(){
        return person;
    }
}
