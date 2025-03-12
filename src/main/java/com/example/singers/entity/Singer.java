package com.example.singers.entity;

public class Singer {

    private int id;
    private String name;
    private String surname;
    private String genre;

    public Singer() {
    }

    public Singer(int id, String name, String surname, String genre) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
    public String makeConcert() {

        return name + "Va dar un concierto";
    }
    public String sing() {

        return name + "Toca musica de tipo " + genre;
    }
}
