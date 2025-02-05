package homework.abstraction.abstraction_and_hashmaps.ECommerce;

public class Main {
    public static void main(String[] args) {
        ExpressOrder book = new ExpressOrder("E045", "Mike Stevens", 120.00, 5.00);
        book.applyDiscount();
        book.getFinalTotal();
    }
}
