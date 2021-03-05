package dao.impl;

import dao.RequestDao;
import model.Request;
import java.util.ArrayList;
import java.util.List;

public class RequestDaoImpl implements RequestDao {

    private final List<Request> requests = new ArrayList<>();

    private Integer id = 0;

    @Override
    public void save(Request request) {
        request.setId(idGenerator());
        System.out.println("Save request: " + request);
        requests.add(request);
    }

    private int idGenerator() {
        id = id + 1;
        return id;
    }

    @Override
    public List<Request> getAll() {
        return new ArrayList<>(requests);
    }

    @Override
    public void delete(Request entity) {
        requests.remove(entity);
    }

    @Override
    public Request update(Request request) {
        return null;
    }
}
