package controller;

import facade.ClientesFacade;
import java.util.List;
import model.Clientes;

public class ClientesController {

    private ClientesFacade facade;

    public ClientesController() {
        this.facade = new ClientesFacade();
    }

    public int addClientes(Clientes clientes) {
        return facade.save(clientes);
    }

    public int alterarClientes(Clientes clientes) {
        return facade.update(clientes);
    }

    public int excluirClientes(Long id) {
        return facade.remove(id);
    }

    public List<Clientes> findClientes() {
        return facade.findAll();
    }

}
