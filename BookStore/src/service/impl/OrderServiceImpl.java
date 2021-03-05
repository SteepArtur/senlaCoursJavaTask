package service.impl;

import dao.OrderDao;
import dao.impl.OrderDaoImpl;
import model.Book;
import model.Order;
import model.OrderStatus;
import service.BookService;
import service.OrderService;
import service.RequestService;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao = new OrderDaoImpl();
    private final BookService bookService = new BookServiceImpl();
    private final RequestService requestService = new RequestServiceImpl();

    @Override
    public Order saveOrderAndCreateRequest(Order order) {
        Boolean canCreateOrder = checkOrderBooks(order.getBooks());
        if (!canCreateOrder){
            System.out.println("Can not create order");
            System.out.println("Created request for new Books");
            return null;
        }

        System.out.println("Save order: " + order);
        order.setOrderStatus(OrderStatus.NEW);
        return orderDao.save(order);
    }

    private Boolean checkOrderBooks(List<Book> orderBooks) {
        boolean canCreateOrder = true;

        List<Book> savedBooks = bookService.findAll();

        List<String> savedBooksNames = new ArrayList<>();
        List<String> orderBooksNames = new ArrayList<>();

        savedBooks.forEach(book -> savedBooksNames.add(book.getName()));
        orderBooks.forEach(book -> orderBooksNames.add(book.getName()));

        for (String name : orderBooksNames) {
            if (!savedBooksNames.contains(name)) {
                requestService.create(name);
                canCreateOrder = false;
            }
        }

        return canCreateOrder;
    }

    @Override
    public List<Order> findAll() {
        return orderDao.getAll();
    }

    @Override
    public boolean delete(int id) {
        return orderDao.delete(id);
    }

    @Override
    public Order findById(int id) {
        System.out.println("Find order by Id: " + id);
        return orderDao.findById(id);
    }

    @Override
    public void changeStatusOrder(Order order, OrderStatus orderStatus) {
        order.setOrderStatus(orderStatus);
    }

    @Override
    public void changeStatusOrderById(Integer id, OrderStatus orderStatus) {
        Order order = findById(id);
        order.setOrderStatus(orderStatus);
        saveOrderAndCreateRequest(order);
    }
}
