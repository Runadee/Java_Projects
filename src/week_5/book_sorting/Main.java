package week_5.book_sorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Helen", "Amadeus", 300, 1988);
        Book book2 = new Book("Selen", "Goethe", 250, 1999);
        Book book3 = new Book("Dark", "Zey", 350, 1600);
        Book book4 = new Book("Yogi", "Mozart", 400, 1900);
        Book book5 = new Book("Pi", "Salzburg", 500, 1968);

        Set<Book> bookSetByTitle = new TreeSet<>();
        bookSetByTitle.add(book1);
        bookSetByTitle.add(book2);
        bookSetByTitle.add(book3);
        bookSetByTitle.add(book4);
        bookSetByTitle.add(book5);

        System.out.println("Books sorted by title:");
        for (Book book : bookSetByTitle) {
            System.out.println(book);
        }

        Comparator<Book> bookPageComparator = Comparator.comparingInt(Book::getBookPage);

        Set<Book> bookSetByPage = new TreeSet<>(bookPageComparator);
        bookSetByPage.addAll(bookSetByTitle);

        System.out.println("\nBooks sorted by page:");
        for (Book book : bookSetByPage) {
            System.out.println(book);
        }
    }
}
