package com.example.repository;

import com.example.model.Cliente;

import java.util.List;

public interface IClientRepository {
        List<Cliente> getAllClientes();
        Cliente findClienteById(Integer id);
        Cliente addCliente(Cliente cliente);
        Cliente updateCliente(Integer id, Cliente cliente);
        void deleteCliente(Integer id);


}
