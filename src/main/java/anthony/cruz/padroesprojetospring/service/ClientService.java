package anthony.cruz.padroesprojetospring.service;

import anthony.cruz.padroesprojetospring.model.Address;
import anthony.cruz.padroesprojetospring.model.Client;
import anthony.cruz.padroesprojetospring.repository.AddressRepository;
import anthony.cruz.padroesprojetospring.repository.ClientRepository;
import anthony.cruz.padroesprojetospring.service.interfaces.ICepService;
import anthony.cruz.padroesprojetospring.service.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ICepService cepService;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client insert(Client client) {
        String cep = client.getAddress().getCep();
        persistCep(cep);
        return clientRepository.save(client);
    }

    @Override
    public Client update(Long id, Client client) {
        String cep = client.getAddress().getCep();
        persistCep(cep);
        client.setId(id);
        return clientRepository.save(client);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void persistCep(String cep) {
        if (addressRepository.existsById(cep))
            return;
        Address newAddress = cepService.getCepData(cep);
        addressRepository.save(newAddress);
    }
}
