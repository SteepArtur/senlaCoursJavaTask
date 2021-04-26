package util.comparators;

import model.Book;

import java.util.Comparator;

public class BookComparatorIn implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
      return o1.getBookStatus().compareTo(o2.getBookStatus());
  }
}
