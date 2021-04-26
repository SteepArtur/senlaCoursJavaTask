import model.Book;
import model.Order;
import model.OrderStatus;
import service.BookService;
import service.ClientService;
import service.OrderService;
import service.RequestService;
import service.impl.BookServiceImpl;
import service.impl.ClientServiceImpl;
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
        ClientService clientService = new ClientServiceImpl();

        List<Order> orders = createOrders(bookService, orderService);
//        deleteOrder(orderService);
//        orderSum(orderService);
//        changeOrderStatus(orderService);
//        createOrderWithRequest(orderService);
//        createRequestForBook(requestService);
//        sortBookName(bookService.findAll(), bookService);
//        sortBookByDate(bookService.findAll(), bookService);
//        sortBookByPrice(bookService.findAll(),bookService);
//        sortInBook(bookService.findAll(),bookService);
          sortOrderByDate(orderService, orders);
    }

    private static void sortOrderByDate(OrderService orderService, List<Order> orders) {
        System.out.println("\nComplete sortingByDate: ");
        List<Order> orderSorted = orderService.sortOrderDate(orders);
        orderSorted.forEach(System.out::println);
    }

    private static void sortInBook(List<Book> books, BookService bookService) {
        System.out.println("\nComplete sortingIn: ");
        List<Book> booksSorted = bookService.sortInBook(books);
        printListBook(booksSorted);
    }

    private static void sortBookByPrice(List<Book> books, BookService bookService) {
        System.out.println("\nComplete sortingPrice: ");
        printListBook(bookService.sortBookByPrice(books));
    }

    private static void sortBookByDate(List<Book> books, BookService bookService) {
        System.out.println("\nComplete sortingDate: ");
        printListBook(bookService.sortBookByDate(books));
    }

    private static void sortBookName(List<Book> books, BookService bookService) {
        System.out.println("\nComplete sortingName: ");
        List<Book> booksSorted = bookService.sortBookByName(books);
        printListBook(booksSorted);
    }

    private static void printListBook(List<Book> booksSorted) {
        for (Book book : booksSorted) {
            System.out.println(book);
        }
    }

    private static void printListOrder(List<Order> orderSorted) {
        for (Order order : orderSorted) {
            System.out.println(order);
        }
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
        System.out.println(order + " \n Сумма заказа " + sum);
    }

    private static List<Order> createOrders(BookService bookService, OrderService orderService) {
        List<Order> orders = new ArrayList<>();

        List<Book> booksForOrder = new ArrayList<>();
        List<Book> books = bookService.findAll();
        booksForOrder.add(books.get(1));
        booksForOrder.add(books.get(3));

        Order order1 = new Order();
        order1.setBooks(booksForOrder);
        orderService.saveOrderAndCreateRequest(order1);
        orders.add(order1);

        Order order2 = new Order();
        order2.setBooks(booksForOrder);
        orderService.saveOrderAndCreateRequest(order2);
        orders.add(order2);

        List<Book> booksForOrder1 = new ArrayList<>();
        booksForOrder1.add(books.get(2));

        List<Book> booksForOrder2 = new ArrayList<>();
        booksForOrder2.add(books.get(4));

        List<Book> booksForOrder3 = new ArrayList<>();
        booksForOrder3.add(books.get(5));

        System.out.println("\n");

        Order order3 = new Order();
        order3.setBooks(booksForOrder1);
        orderService.saveOrderAndCreateRequest(order3);
        orders.add(order3);

        System.out.println("\n");

        Order order4 = new Order();
        order4.setBooks(booksForOrder2);
        orderService.saveOrderAndCreateRequest(order4);
        orders.add(order4);

        System.out.println("\n");

        Order order5 = new Order();
        order5.setBooks(booksForOrder3);
        orderService.saveOrderAndCreateRequest(order5);
        orders.add(order5);

        return orders;
    }

    private static void deleteOrder(OrderService orderService) {
        System.out.println("Все ордера");
        List<Order> allOrders = orderService.findAll();
        allOrders.forEach(System.out::println);

        System.out.println();
        int idForDelete = 1;
        boolean result = orderService.delete(idForDelete);
        if (result) {
            System.out.println("Книга удалена с ID " + idForDelete);
        } else {
            System.out.println("Книга не найдена с ID " + idForDelete);
        }

        System.out.println("Все ордера после удаления");
        allOrders.forEach(System.out::println);
    }

    private static void changeOrderStatus(OrderService orderService) {
        System.out.println("Изменить статус ордера");
        System.out.println("Получить все ордера");
        List<Order> allOrders = orderService.findAll();

        System.out.println("Вывести на печать все ордера");
        allOrders.forEach(System.out::println);

        Order order = allOrders.get(0);
        orderService.changeStatusOrder(order, OrderStatus.NEW);
        orderService.changeStatusOrderById(1, OrderStatus.NEW);

        Order order1 = allOrders.get(1);
        orderService.changeStatusOrder(order1, OrderStatus.COMPLETE);
        orderService.changeStatusOrderById(2, OrderStatus.COMPLETE);

        Order order2 = allOrders.get(2);
        orderService.changeStatusOrder(order2, OrderStatus.DELETE);

        Order order3 = allOrders.get(3);
        orderService.changeStatusOrder(order3, OrderStatus.NEW);
        orderService.changeStatusOrderById(3, OrderStatus.NEW);

        Order order4 = allOrders.get(4);
        orderService.changeStatusOrder(order4, OrderStatus.NEW);
        orderService.changeStatusOrderById(4, OrderStatus.NEW);

        Order order5 = allOrders.get(5);
        orderService.changeStatusOrder(order5, OrderStatus.NEW);
        orderService.changeStatusOrderById(5, OrderStatus.NEW);

    }
}