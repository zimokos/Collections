package ua.dp.zymokos.heorhii;

import java.util.ArrayList;

public class Library {
    public static final int MAX_NUMBER_OF_BOOKS_TO_ORDER = 3;
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private ArrayList<Employee> employees;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public Library(ArrayList<Book> books, ArrayList<Reader> readers, ArrayList<Employee> employees) {
        this.books = books;
        this.readers = readers;
        this.employees = employees;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void setReaders(ArrayList<Reader> readers) {
        this.readers = readers;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void orderBook(Book book, Reader reader) {
        if (book.isAvailable() && reader.numberOfOrderedBooks() < MAX_NUMBER_OF_BOOKS_TO_ORDER) {
            reader.addBook(book);
            book.setOrderedBy(reader);
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printAverageAge() {
        int sum = 0;
        for (Reader reader : readers) {
            sum = sum + reader.getYear();
        }
        System.out.println(sum / readers.size());
    }
}
