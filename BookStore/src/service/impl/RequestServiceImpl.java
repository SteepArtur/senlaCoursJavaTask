package service.impl;

import dao.RequestDao;
import dao.impl.RequestDaoImpl;
import model.Request;
import service.RequestService;

public class RequestServiceImpl implements RequestService {

    private RequestDao requestDao = new RequestDaoImpl();

    @Override
    public void create(String bookName) {
        Request request = new Request();
        request.setBookName(bookName);
        requestDao.save(request);
    }
}
