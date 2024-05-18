package org.example;

public class Attraction implements Events{

    private String name;
    private String description;
    private int id;
    private int price;
    private int availability;
    private int ticketedVisitors;
    private int totalVisitors;

    public Attraction(String name, String description, int id, int price, int availability, int numberOfVisitors, int totalVisitors) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
        this.availability = availability;
        this.ticketedVisitors = numberOfVisitors;
        this.totalVisitors = totalVisitors;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void name() {
        System.out.println(this.name);
    }

    @Override
    public void id() {
        System.out.println(this.id);
    }

    @Override
    public void description() {
        System.out.println(this.description);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int isOpen() {
        return availability;
    }

    public void setAvailability(int open) {
        availability = open;
    }

    public int getNumberOfVisitors() {
        return ticketedVisitors;
    }

    public void setNumberOfVisitors(int numberOfVisitors) {
        this.ticketedVisitors = numberOfVisitors;
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }

    public void setTotalVisitors(int totalVisitors) {
        this.totalVisitors = totalVisitors;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " ; Name: " + getName();
    }
}
