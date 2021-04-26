package util.comparators;

import model.Order;
import java.util.Comparator;

public class OrderComparatorDateComplete implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getStartTime().compareTo(o2.getStartTime());
    }
}

