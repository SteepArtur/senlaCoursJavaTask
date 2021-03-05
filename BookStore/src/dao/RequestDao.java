package dao;

import model.Request;
import java.util.List;

public interface RequestDao {

    void save(Request request);

    List<Request> getAll();

    void delete (Request request);

    Request update(Request request);
}
