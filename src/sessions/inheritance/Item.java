package sessions.inheritance;

// Superclass
// Baseclass
public class Item {

    private String title;
    private double price;

    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Price: " + price;
    }
}
