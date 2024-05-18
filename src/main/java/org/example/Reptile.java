package org.example;

public class Reptile extends Animal{
    private String type;

    public Reptile(String name, int id, String description, String feed) {
        super(name, id, description, feed);
        this.type = "Reptile";
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "ID: " + super.getId() + " ; Name: " + super.getName() + " ; Type: " + this.type;
    }

    @Override
    public String getFeed() {
        return "Sound of this " + this.getType() + " named " + super.getName() + " is " + super.getFeed();
    }

    @Override
    public void description() {
        System.out.println("Description of this " + this.getType() + " named " + super.getName() + " is " + super.getDescription());
    }
}
