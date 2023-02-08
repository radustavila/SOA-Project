package com.radustavila.jokes.model;

public class Joke {

    private int id;
    private String punchline;
    private String setup;
    private String type;

    public Joke() {
    }

    public Joke(int id, String punchline, String setup, String type) {
        this.id = id;
        this.punchline = punchline;
        this.setup = setup;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
