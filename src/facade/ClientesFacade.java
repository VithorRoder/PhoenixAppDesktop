package facade;

import dao.ClientesDAO;
import dao.ClientesDAO2;
import java.util.List;
import model.Clientes;

public class ClientesFacade {

    private final ClientesDAO dao;

    public ClientesFacade() {
        this.dao = new ClientesDAO2();
    }

    public int save(Clientes clientes) {
        return dao.save(clientes);

    }

    public int update(Clientes clientes) {
        return dao.update(clientes);
    }

    public int remove(Long id) {
        return dao.remove(id);
    }

    public List<Clientes> findAll() {
        return dao.findAll();
    }

}
