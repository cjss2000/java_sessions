package sessions.arrays_and_objects;

import java.util.Random;
import java.util.UUID;

public class Book {

    private  UUID uuid;
    private  String title;
    private Author author;
    private  int year;
    private  boolean isAvailable;


    public UUID getUUID(){
        return uuid;
    }

//    public void setUUID_id(int UUID_id) {
//        Random rnd = new Random();
//        this.UUID_id = rnd.nextInt(900000) + 100000;
//    }
//I tried to set the Random UUID inside the Setter, can you explain why this would or would not work?
//I used the constructor instead.
//public void setUUID_id(int UUID_id) {
//
//    this.UUID_id = UUID_id;
//} removed setter because you would never set your own generated UUID.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    Book(String title, Author author, int year, boolean isAvailable){
        Random random = new Random();
        this.uuid = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;

    }
    Book(int UUID_id, String title, String name, UUID uuid, String biography, int year, boolean isAvailable){
        Random random = new Random();
        this.uuid = UUID.randomUUID();
        this.title = title;
        this.author = new Author(name, biography);
        this.year = year;
        this.isAvailable = true;

    }

    @Override
    public String toString(){
        return "information: " + this.getTitle() + " by: " +  this.getAuthor() + " ID number: " + this.uuid + " published: " + this.getYear();
    }

}
