package sessions.arrays_and_objects;

public class ExceptionHandling {

public void verifyIndex(Book[] books) throws InvalidBookIndexException{
    if (books.equals(null)) {

       throw new InvalidBookIndexException("Array is null");

    }
    }

    public void indexBounds(Book[] books, int index) throws InvalidBookIndexException{
    if (index < 0 || index > books.length){
        throw new InvalidBookIndexException("Error: Array is not within bounds");
    }
    }

}
