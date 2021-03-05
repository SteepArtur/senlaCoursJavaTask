package dao;

import model.Order;
import java.util.List;

public interface OrderDao {

    Order save(Order order);

    List<Order> getAll();

    boolean delete(int id);

    Order update(Order order);

    Order findById(int id);

    void changeStatusOrder(int id);
}
