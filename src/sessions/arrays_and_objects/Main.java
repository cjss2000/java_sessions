package sessions.arrays_and_objects;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        //Use case: Open system and provide list of books avaiable. You can add library via book/author
        //you can also read list of books via author
        // print list of all books
        //Book class to include variables on speicfic books
        //array list to view/add/remove books
        //method to read book content, or view authors of book
        OnlineLibrary bookLibrary = new OnlineLibrary(3);

        Author DrSuess = new Author("Dr. Suess", "He wrote books for children");
        Book greenEggsandHam = new Book("Green Eggs and Ham", DrSuess, 1960, true);
        Author Hemingway = new Author("Ernest Hemingway", "Classic writer, sad guy.");
        Book aFarewellToArms = new Book("A Farewell to Arms", Hemingway, 1956, true);
        Book forWhomtheBellTolls = new Book("For whom the bell tolls", Hemingway, 1952, true);
        Book CatinTheHat = new Book("The Cat in the Hat", DrSuess, 1947, true);

        try {
            bookLibrary.addBooks(greenEggsandHam, 0);
            bookLibrary.addBooks(aFarewellToArms, 1);
            bookLibrary.addBooks(CatinTheHat, 2);
            bookLibrary.printBookList();
            bookLibrary.updateBook(forWhomtheBellTolls, 1);
            bookLibrary.printBookList();
            UUID CATUUID = bookLibrary.getCurrentUUID("The Cat in the Hat");
            System.out.println(CATUUID);
            bookLibrary.removeBookByID(CATUUID);
            bookLibrary.printBookList();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
