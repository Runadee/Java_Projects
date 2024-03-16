package week_5.book_sorting;

public class Book implements Comparable<Book> {

    String title;
    String writer;
    int bookPage;
    int publishYear;

    public Book(String title, String writer, int bookPage, int publishYear) {
        this.title = title;
        this.writer = writer;
        this.bookPage = bookPage;
        this.publishYear = publishYear;
    }

    public int getBookPage() {
        return bookPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + bookPage +
                ", author='" + writer + '\'' +
                ", publicationYear=" + publishYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
