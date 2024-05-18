package org.example;

import java.util.ArrayList;

public class Visitor extends Admin{
    private String name;
    private int age;
    private String phoneNumber;
    private float balance;
    private String email;
//    private String password;
    private int id;
    private int membership; // 0 for no membership
    // 1 for basic membership
    // 2 for premium membership
    private ArrayList<Attraction> attractionsPurchased;


    public Visitor(String name, int age, String phoneNumber, float balance, String email, String password, int id) {
        super(email, password);
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.email = email;
        this.id = id;
        this.membership = 0;
        this.attractionsPurchased = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    public ArrayList<Attraction> getAttractionsPurchased() {
        return attractionsPurchased;
    }

    public void setAttractionsPurchased(ArrayList<Attraction> attractionsPurchased) {
        this.attractionsPurchased = attractionsPurchased;
    }
    public void addAttractionsPurchased(Attraction attraction){

        attractionsPurchased.add(attraction);

    };
}