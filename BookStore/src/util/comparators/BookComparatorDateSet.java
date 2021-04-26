package util.comparators;

import model.Book;

import java.util.Comparator;

public class BookComparatorDateSet implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int date1 = o1.getDateNew();
        int date2 = o2.getDateNew();

        if (date1 > date2) {
            return 1;
        } else if (date1 < date2) {
            return -1;
        } else {
            return 0;
        }
    }
}
