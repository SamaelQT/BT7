package com.example.a7;

public class ToDo {

    private int id;
    private String title;
    private String date;
    private String content;
    private String type;
    private int priority;


    public ToDo() {}


    public ToDo(int id, String title, String date, String content,
                String type, int priority) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
        this.type = type;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}