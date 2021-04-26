package dao;

import model.Order;
import model.OrderStatus;

import java.util.List;

public interface OrderDao {

    Order save(Order order);

    List<Order> getAll();

    boolean delete(int id);

    Order update(Order order);

    Order findById(int id);

    void changeOrderStatus(int id);

    void changeStatusOrder(Order order, OrderStatus orderStatus);
}
