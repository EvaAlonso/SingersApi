package com.example.singers.models;

public class Singer {

    private String name;
    private String surname;
    private String genre;

    public Singer() {
    }

    public Singer(String name, String surname, String genre) {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
    }

    public String getName() {
        return name;
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
