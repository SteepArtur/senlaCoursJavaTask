package dao.impl;

import dao.ClientDao;
import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl implements ClientDao {

    private List<Client> clients = new ArrayList<>();
    private Integer id = 0;
    public ClientDaoImpl() { unit();
    }

    private void unit() {
        Client client = new Client(idGenerator(),"Максим");
        Client client1 = new Client(idGenerator(),"Александр");
        Client client2 = new Client(idGenerator(),"Семён");
        Client client3 = new Client(idGenerator(),"Юра");
        Client client4 = new Client(idGenerator(),"Алексей");
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
    }


    private int idGenerator() {
        id = id + 1;
        return id;
    }

    @Override
    public void create(Client client) {
        client.setId(idGenerator());
        clients.add(client);

    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients);
    }

    @Override
    public void delete(Integer id) {
        clients.remove(id);

    }

    @Override
    public Client update(Client client) {
        client = clients.get(idGenerator());
        client.setName(client.getName());
        return client;
    }
}
