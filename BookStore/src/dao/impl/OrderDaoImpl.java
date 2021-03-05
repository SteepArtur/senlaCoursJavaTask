package dao.impl;

import dao.OrderDao;
import model.Book;
import model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {
    private List<Book> books = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private Integer id = 0;
    private Object Book;

    public OrderDaoImpl() {
        init();
    }

    private void init(){
        }

    private int idGenerator() {
        id = id + 1;
        return id;
    }

    @Override
    public Order save(Order entity) {
        entity.setId(idGenerator());
        orders.add(entity);
        return entity;
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public boolean delete(int id) {
        for (Order order: orders) {
            if(order.getId() == id){
                orders.remove(order);
                return true;
            }
        }
        return false;
    }

    @Override
    public Order update(Order entiity) {
//        Order order = orders.get(idGenerator());
//       // orders.setPriceBooks(entiity.getPriceBooks());
//        return order;
        return null;
    }

    @Override
    public Order findById(int id) {
        for (Order order: orders) {
            if(order.getId() == id){
                int index = orders.lastIndexOf(order);
                return orders.get(index);
            }
        }
        return null;
    }

    @Override
    public void changeStatusOrder(int id) {
    }
}
