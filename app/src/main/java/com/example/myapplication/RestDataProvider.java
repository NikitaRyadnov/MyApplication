package com.example.myapplication;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;
import java.util.ArrayList;
import java.util.List;

public class RestDataProvider {
    private static List<Person> person = new ArrayList<>();
    private static List<Category> category = new ArrayList<>();

    public RestDataProvider() {
        person.add(new Person(1, "Nikita", "Ryadnov", "nik@mail.com", "xax", "12345"));
        fetchCategory();
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

    private void fetchCategory() {
        try {
            category = new CategoryListTask().execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        category.add(new Category(1, "Лексус"));
        category.add(new Category(2, "Фольксваген"));
    }
}
