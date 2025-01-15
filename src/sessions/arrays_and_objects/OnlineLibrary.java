package sessions.arrays_and_objects;

import java.util.UUID;

public class OnlineLibrary {

    private Book[] books;
    int initialCapacity;

    public OnlineLibrary(int initialCapacity) {
        this.books = new Book[initialCapacity];
    }

//    public void addBooks(Book book, int index){
//        try{
//            books[index] = book;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index is out of bounds: " + e.getMessage());
//        }
//
//
//    }
    //comnmented out working code, made try/catch with basic Array Index exceptoin

    public void addBooks(Book book, int index) throws InvalidBookIndexException {
        try {
            books[index] = book;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }

    }

    public void addBooks(String title, Author author, int year, int index) throws InvalidBookIndexException {
        Book book = new Book(title, author, year, true);
        addBooks(book, index);
    }

    public void growCapacity() {
        int newSize = books.length + 1;
        Book[] copyBooks = new Book[newSize];
        //    this.books = new Book[newSize];
        this.books = copyBooks;
//created new copy book array, now need to build for loop and copy everything over form original array to new array
        for (int i = 0; i < newSize; i++) {
            copyBooks[i] = books[i];
        }
    }

    public void doubleCapacity() {
        int newSize = books.length * 2;
        this.books = new Book[newSize];
    }

    public void updateBook(Book newbook, int index) throws InvalidBookIndexException {
        //   if (index != 0 || index <= books.length){
        if (books[index] != null) {
            books[index] = newbook;
        } else {
            throw new InvalidBookIndexException("Error: Array is not within bounds");
        }
    }

    public UUID getCurrentUUID(String name) {
        UUID uuid = null;
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getTitle())) {
                uuid = books[i].getUUID();
            }
        }
        return uuid;
    }

    public void removeBookByID(UUID uuid) {
        for (int i = 0; i < books.length; i++) {
            if (uuid.equals(books[i].getUUID())) {
                books[i] = null;
            }
        }
    }

    public void printBookList() {
        System.out.println("Your Current Book list: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Here is your book: " + books[i]);
        }
    }

    public void getBooksByAuthor(String name) {
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getAuthor().getName())) {
                System.out.println("Here are your books by mentioned Author: " + books[i].getTitle());
            }

        }
    }

}
