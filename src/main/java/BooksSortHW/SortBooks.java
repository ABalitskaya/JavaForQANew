package BooksSortHW;

import May17.PersonForTask;

import java.util.*;

public class SortBooks {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Strange Case of Dr Jekyll and Mr Hyde", "Robert Stevenson"));
        books.add(new Book("Wuthering Heights", "Emily Bronte"));
        books.add(new Book("Jane Eyre", "Charlotte Bronte"));
        books.add(new Book("Dreamcatcher", "Stephen King"));
        books.add(new Book("The Dead Zone", "Stephen King"));

        // Сортировка списка объектов класса Book по алфавиту их названий.

        Collections.sort(books, (book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));
        for (Book b : books) {
            System.out.println(b.getTitle() + ", " + b.getAuthor());
        }

        //Сортировка списка объектов класса Book по автору и затем по их названий в алфавитном порядке.
        System.out.println("--------------------");
        Collections.sort(books, (book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));
        Collections.sort(books, Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle));
        for (Book b : books) {
            System.out.println(b.getTitle() + ", " + b.getAuthor());
        }
    }
}
