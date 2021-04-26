package dao;

import model.Client;

import java.util.List;

public interface ClientDao {

    void create(Client client);

    List<Client> getAll();

    void delete(Integer id);

    Client update(Client client);
}
