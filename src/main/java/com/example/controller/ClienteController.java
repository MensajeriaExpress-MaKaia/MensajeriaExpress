package com.example.controller;

import com.example.model.Cliente;
import com.example.service.ClientService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.apache.catalina.connector.ClientAbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClientService clienteService;

    @Autowired
    public ClienteController(ClientService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public Cliente getAllClintes(@PathVariable Integer id){
        return (Cliente) clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente findClienteById(@PathVariable @NotNull Integer id) {
        try {
            Cliente cliente = clienteService.findClienteById(id);
            if (cliente == null){
                throw new ClientAbortException("No existe cliente con id " + id);
            }
            return cliente;
        } catch (ClientAbortException e) {
            throw new ResponseStatusException(HttpStatus .NOT_FOUND,e.getMessage(),e);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente addCliente(@Valid @RequestBody Cliente cliente) {

        return clienteService.addCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Integer id,@Valid @RequestBody Cliente cliente) {
        if (id == null){
            throw new RuntimeException("El id del cliente es requerido");
        }
        return clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Integer id) {
        clienteService.deleteCliente(id);
    }
}
