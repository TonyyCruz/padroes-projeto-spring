package anthony.cruz.padroesprojetospring.service.interfaces;

import anthony.cruz.padroesprojetospring.model.Client;

import java.util.List;

public interface IClientService {

    List<Client> findAll();

    Client findById(Long id);

    void insert(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
