package com.example.searchapp;

public class itemModel {
    String id;
    String name;
    String date;

    public itemModel(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public itemModel() {
        this.getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
