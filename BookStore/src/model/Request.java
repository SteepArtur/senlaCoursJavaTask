package model;

public class Request {

    private int id;
    private String bookName;

    public Request(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
