package bookSorter;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSetByTitle = new HashSet<>();
        bookSetByTitle.add(new Book("Java Programming", 310, "Muhammed Aydın", "2023-05-07"));
        bookSetByTitle.add(new Book("Data Structures", 620, "Berk Akgül", "2020-01-22"));
        bookSetByTitle.add(new Book("Algorithms Made Easy", 150, "İsmail Pantaş", "2022-04-11"));
        bookSetByTitle.add(new Book("Introduction to AI", 520, "Rıdvan Tabakçı", "2020-12-16"));
        bookSetByTitle.add(new Book("Web Development Basics", 380, "Yavuz Ali Çarpar", "2021-01-10"));

        System.out.println("Books sorted by title:");
        for (Book book : bookSetByTitle) {
            System.out.println(book);
        }

        // Use TreeSet to sort books by page count
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByTitle);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
