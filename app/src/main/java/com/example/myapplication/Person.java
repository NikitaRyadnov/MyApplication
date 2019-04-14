package com.example.myapplication;

public class Person {
    private String Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Login;
    private String Password;

    Person(String Id, String FName, String LName, String Email, String Login, String Pass){
        this.Id = Id;
        this.FirstName = FName;
        this.LastName = LName;
        this.Email = Email;
        this.Login = Login;
        this.Password = Pass;
    }

    public String getId(){
        return Id;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getEmail(){
        return Email;
    }
    public String getLogin(){
        return Login;
    }
    public String getPassword(){
        return Password;
    }


}