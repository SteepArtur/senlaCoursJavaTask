package util.comparators;

import model.Order;
import java.util.Comparator;

public class OrderComparatorByPrice implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        double o1TotalCost = o1.getTotalCost();
        double o2TotalCost = o2.getTotalCost();

        if (o1TotalCost > o2TotalCost) {
            return 1;
        } else if (o1TotalCost < o2TotalCost) {
            return -1;
        } else {
            return 0;
        }
    }
}