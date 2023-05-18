package BooksSortHW;

public class Book {
    private String title;
    private String author;

    public Book(String name, String author) {
        this.title = name;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
