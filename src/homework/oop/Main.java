package homework.oop;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("John", "Doe", "john@email.com", "Famous Writer and stuff...");
        Book book = new Book("Java Programming", 2024, author, 300, "TechPres");
        System.out.println(author.getFullName());
        System.out.println(book.getAuthor().getBiography());
    }
}
