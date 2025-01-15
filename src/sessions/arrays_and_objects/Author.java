package sessions.arrays_and_objects;

import java.util.Random;

public class Author {

    private String name;

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    private int UUID;
    String biography;


    //private String lastName;

//    Author(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
    Author(String name, String biography){
        this.name = name;
        Random random = new Random();
        this.UUID = random.nextInt(900000) + 100000;
        this.biography = biography;
    }


    @Override
    public String toString(){
        return "Author " + this.getName();
    }


}
