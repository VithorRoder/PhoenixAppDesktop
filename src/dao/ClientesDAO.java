package dao;

import java.util.List;
import model.Clientes;

public interface ClientesDAO {

    int save(Clientes clientes);

    int update(Clientes clientes);

    int remove(Long idCliente);

    List<Clientes> findAll();

}
