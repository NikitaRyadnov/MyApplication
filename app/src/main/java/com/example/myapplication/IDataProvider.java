package com.example.myapplication;
import java.util.List;
public interface IDataProvider {
    public List<Person> getPerson();
    public List<Category> getCategory();
    public void addPerson(Person person);
}
