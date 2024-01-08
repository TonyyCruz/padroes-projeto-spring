package anthony.cruz.padroesprojetospring.service;

import anthony.cruz.padroesprojetospring.model.Client;
import anthony.cruz.padroesprojetospring.service.interfaces.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {



    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public void insert(Client client) {

    }

    @Override
    public void update(Long id, Client client) {

    }

    @Override
    public void delete(Long id) {

    }
}
