package util.comparators;

import model.Book;

import java.util.Comparator;

public class BookComparatorPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        double o1Price = o1.getPrice();
        double o2Price = o2.getPrice();
        if (o1Price > o2Price) {
            return 1;
        } else if (o1Price < o2Price) {
            return -1;
        } else {
            return 0;
        }
    }
}
