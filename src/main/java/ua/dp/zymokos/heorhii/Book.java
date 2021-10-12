package ua.dp.zymokos.heorhii;

public class Book {
    private String name;
    private String author;
    private Integer year;
    private Reader orderedBy;
    private Double rating;

    public Book() {
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.orderedBy = null;
        this.rating = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Reader getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(Reader orderedBy) {
        this.orderedBy = orderedBy;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", orderedBy=" + orderedBy +
                ", rating=" + rating +
                '}';
    }

    public boolean isAvailable() {
        if (orderedBy == null) {
            return true;
        }
        return false;
    }

    public void printBook() {
        System.out.println(this);
    }
}
