

package homework;

import java.util.Random;


public class Publication {

    private int id;
    private String title;
    private int publicationYear;
    private Author author;

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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    Publication(int id, String title, int publicationYear, Author author){
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    Publication(){}
//    Publication(int randId, String title, int publicationYear, Author author){
//        Random random = new Random();
//        this.randId = random.nextInt(1000);
//        this.title = title;
//        this.publicationYear = publicationYear;
//        this.author = author;
//    }
    public double calculatePrice(){

        double unitPrice = 0.0;

        return unitPrice;
    }
}
