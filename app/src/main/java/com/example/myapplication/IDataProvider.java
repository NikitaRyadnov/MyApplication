package com.example.myapplication;
import java.util.List;
public interface IDataProvider {
    public List<Person> getPerson();
    public void addPerson(Person person);
}
