package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MockupDataProvider implements IDataProvider {
    private static List<Person> person = new ArrayList<>();
    private static List<Category> category = new ArrayList<>();

    public MockupDataProvider() {
        person.add(new Person(1, "Nikita", "Ryadnov", "nik@mail.com", "xax", "12345"));
        category.add(new Category(1, "Лексус"));
        category.add(new Category(2, "Фольксваген"));
    }

    public List<Person> getPerson() {
        return person;
    }

    public void addPerson(Person person){
        this.person.add(person);
    }

    public List<Category> getCategory() {
        return category;
    }
    public void addCategory(Category category){
        this.category.add(category);
    }
}
