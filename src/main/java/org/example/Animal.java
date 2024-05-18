package org.example;

public abstract class Animal implements Events{
    private String name;
    private int id;
    private String description;
    private String feed;

    public Animal(String name, int id, String description, String feed) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.feed = feed;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getId() {
        return id;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public abstract String getType();
}
