package com.example.micke.contactlist;

/**
 * Created by Micke on 2015-04-14.
 */
public class Contact {
    private String name, number, email;

    public Contact(String name, String number, String email){
        this.name=name;
        this. number=number;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public String getEmail(){
        return email;
    }


}
