import model.Book;
import model.Order;
import model.OrderStatus;
import service.BookService;
import service.OrderService;
import service.RequestService;
import service.impl.BookServiceImpl;
import service.impl.OrderServiceImpl;
import service.impl.RequestServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationBookStore {

    public static void main(String[] args) {

        BookService bookService = new BookServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        RequestService requestService = new RequestServiceImpl();

        createOrders(bookService, orderService);
        deleteOrder(orderService);
        orderSum(orderService);
        changeOrderStatus(orderService);
        createOrderWithRequest(orderService);
        createRequestForBook(requestService);
    }

    private static void createRequestForBook(RequestService requestService) {
        System.out.println("Создаём книгу");
        Book book = new Book("NEW BOOK");
        System.out.println("Книга создана: " + book);
        System.out.println("Создаём запрос на книгу");
        requestService.create(book.getName());
    }

    private static void createOrderWithRequest(OrderService orderService) {
        Book book = new Book("Go");
        Book book2 = new Book("Python");
        Order order = new Order();
        order.setBooks(new ArrayList<>(Arrays.asList(book, book2)));
        orderService.saveOrderAndCreateRequest(order);
    }

    private static void orderSum(OrderService orderService) {
        Order order = orderService.findById(1);
        List<Book> books = order.getBooks();
        books.add(1, books.get(1));

        double sum = 0;
        for (Book book : books) {
            sum += sum + book.getPrice();
        }
        System.out.println(order + " \n Сумма заказа "+ sum);
    }

    private static void createOrders(BookService bookService, OrderService orderService) {
        List<Book> booksForOrder = new ArrayList<>();
        List<Book> books = bookService.findAll();
        booksForOrder.add(books.get(1));
        booksForOrder.add(books.get(3));

        Order order1 = new Order();
        order1.setBooks(booksForOrder);
        orderService.saveOrderAndCreateRequest(order1);

        Order order2 = new Order();
        order2.setBooks(booksForOrder);
        orderService.saveOrderAndCreateRequest(order2);
    }

    private static void deleteOrder(OrderService orderService) {
        System.out.println("Все ордера");
        List<Order> allOrders = orderService.findAll();
        allOrders.forEach(System.out::println);

        System.out.println();
        int idForDelete = 1;
        boolean result = orderService.delete(idForDelete);
        if(result){
            System.out.println("Книга удалена с ID " + idForDelete);
        } else {
            System.out.println("Книга не найдена с ID " + idForDelete);
        }

        System.out.println("Все ордера после удаления");
        allOrders.forEach(System.out::println);
    }

    private static void changeOrderStatus(OrderService orderService){
        System.out.println("Изменить статус ордера");
        System.out.println("Получить все ордера");
        List<Order> allOrders = orderService.findAll();

        System.out.println("Вывести на печать все ордера");
        allOrders.forEach(System.out::println);

        Order order = allOrders.get(0);
        orderService.changeStatusOrder(order, OrderStatus.NEW);
        orderService.changeStatusOrderById(1, OrderStatus.NEW);

        Order order1 = allOrders.get(1);
        orderService.changeStatusOrder(order1,OrderStatus.COMPLETE);
        orderService.changeStatusOrderById(2,OrderStatus.COMPLETE);

        Order order2 = allOrders.get(2);
        orderService.changeStatusOrder(order2,OrderStatus.DELETE);
        orderService.changeStatusOrderById(3,OrderStatus.DELETE);
    }
}