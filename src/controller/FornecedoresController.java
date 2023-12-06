package controller;

import facade.FornecedoresFacade;
import java.util.List;
import model.Fornecedores;

public class FornecedoresController {

    private final FornecedoresFacade facade;

    public FornecedoresController() {
        this.facade = new FornecedoresFacade();
    }

    public List<Fornecedores> findFornecedores() {
        return facade.findAll();
    }

    public int addFornecedores(Fornecedores fornecedores) {
        return facade.save(fornecedores);
    }

    public int alterarFornecedores(Fornecedores fornecedores) {
        return facade.update(fornecedores);
    }

    public int excluirFornecedores(Long id) {
        return facade.remove(id);
    }

}
