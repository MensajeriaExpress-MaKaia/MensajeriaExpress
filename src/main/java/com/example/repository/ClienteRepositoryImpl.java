package com.example.repository;

import com.example.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements IClientRepository {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteRepositoryImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }


    @Override
    public Cliente findClienteById(Integer id) {
        Optional<Cliente> client = clienteRepository.findById(id);
        return client.orElse(null);
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Integer id, Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setCedulaCliente(id);
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @Override
    public void deleteCliente(Integer id) {
        clienteRepository.deleteById(id);

    }
}
