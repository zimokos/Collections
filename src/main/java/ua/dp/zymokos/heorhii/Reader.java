package ua.dp.zymokos.heorhii;

import java.util.ArrayList;

public class Reader extends Person {
    private ArrayList<Book> orderedBooks;

    public Reader() {
    }

    public Reader(String name, int year, int phoneNumber) {
        super(name, year, phoneNumber);
        this.orderedBooks = new ArrayList<>(3);
    }

    public ArrayList<Book> getOrderedBooks() {
        return orderedBooks;
    }

    public void setOrderedBooks(ArrayList<Book> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Integer numberOfOrderedBooks() {
        return this.orderedBooks.size();
    }

    public void addBook(Book book) {
        this.orderedBooks.add(book);
    }

    public void printOrderedBooks() {
        for (Book book : orderedBooks) {
            System.out.println(book);
        }
    }
}
