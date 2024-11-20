package Prototype;

public class Book implements Prototype {

    public String author;
    public String title;
    public String genre;
    public int publicationYear;
    public Book(String author, String title, String genre, int publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public Book(Book book) {
        if (book != null) {
            this.author = book.author;
            this.title = book.title;
            this.genre = book.genre;
            this.publicationYear = book.publicationYear;
        }
    }


    @Override
    public Book clone() {
        return new Book(this);
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ", " + publicationYear + ")";
    }
}
