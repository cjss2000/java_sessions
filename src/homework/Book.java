package homework;

public class Book extends Publication {

    private int pageCount;
    private String publisher;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    Book(String title, int publicationYear, Author author, int pageCount, String publisher) {
        super(title, publicationYear, author);
        this.pageCount = pageCount;
        this.publisher = publisher;
    }

    public double calculatePrice() {
        double bookPrice = 0.0;
        double shippingCost = 1.5;
        bookPrice = bookPrice + shippingCost;
        return bookPrice;
    }

    @Override
    public String toString() {
        return "Book details:  page count: " + this.getPageCount() + " publisher" + this.getPublisher();
    }
}
