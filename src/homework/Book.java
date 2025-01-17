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



    Book(int pageCount, String publisher){
        this.pageCount = pageCount;
        this.publisher = publisher;
    }

    public double calculatePrice(){
        double bookPrice = 0.0;
        return bookPrice;
    }

}
