package model;

public class Book {
    private int id;
    private String name;
    private double price;
    private int dateNew;
    private BookStatus bookStatus;


    public Book(int id, String name, double price, int dateOfIssue, BookStatus bookStatus) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateNew = dateOfIssue;
        this.bookStatus = bookStatus;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateNew(int dateNew) {this.dateNew = dateNew;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public int getDateNew() {return dateNew;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateOfIssue=" + dateNew +
                ", bookStatus=" + bookStatus +
                '}';
    }
}