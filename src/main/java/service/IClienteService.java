package service;

import model.Cliente;

import java.util.List;

public interface IClienteService {
        List<Cliente> getAllClientes();
        Cliente getClienteById(Integer id);
        Cliente addCliente(Cliente cliente);
        Cliente updateCliente(Integer id, Cliente cliente);
        void deleteCliente(Integer id);


}
