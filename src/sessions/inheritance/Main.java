package sessions.inheritance;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("Book", 10.0);
        System.out.println(item);

        Electronics electronics = new Electronics("Laptop", 1000.0, true);
        System.out.println(electronics);
    }

}
