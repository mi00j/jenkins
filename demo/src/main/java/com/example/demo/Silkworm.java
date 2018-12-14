package com.example.demo;

public class Silkworm {
    private int id;
    private String name;
    private String caretaker;

    public Silkworm(int id, String name, String caretaker) {
        this.id = id;
        this.name = name;
        this.caretaker = caretaker;
    }

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

    public String getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(String caretaker) {
        this.caretaker = caretaker;
    }
}
