package facade;

import dao.FornecedoresDAO;
import dao.FornecedoresDAO2;
import java.util.List;
import model.Fornecedores;

public class FornecedoresFacade {

    private final FornecedoresDAO dao;

    public FornecedoresFacade() {
        this.dao = new FornecedoresDAO2();
    }

    public List<Fornecedores> findAll() {
        return dao.findAll();
    }

    public int save(Fornecedores fornecedores) {
        return dao.save(fornecedores);

    }

    public int update(Fornecedores fornecedores) {
        return dao.update(fornecedores);
    }

    public int remove(Long id) {
        return dao.remove(id);
    }

}
