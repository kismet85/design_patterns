package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype{

    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public Recommendation clone() {
        Recommendation bookClones = new Recommendation(targetAudience);
        for (Book book : this.books) {
            bookClones.addBook(book.clone());
        }
        return bookClones;
    }

    @Override
    public String toString() {
        return "Recommendation for " + targetAudience + ":\n" + books;
    }
}
