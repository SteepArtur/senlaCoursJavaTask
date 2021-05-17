package util.comparators;

import model.Order;
import model.OrderStatus;

import java.util.Comparator;

public class OrderComparatorByStatus implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
       return o1.getOrderStatus(OrderStatus.NEW).compareTo(o2.getOrderStatus(OrderStatus.COMPLETE));
    }
}
