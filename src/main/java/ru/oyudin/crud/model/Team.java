package ru.oyudin.crud.model;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Developer> developers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getPosts() {
        return developers;
    }

    public void setPosts(List<Developer> developers) {
        this.developers = developers;
    }

}
