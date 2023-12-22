package controller;

import facade.EstoqueFacade;
import java.util.List;
import model.Estoque;

public class EstoqueController {

    private EstoqueFacade facade;

    public EstoqueController() {
        this.facade = new EstoqueFacade();
    }

    public List<Estoque> findEstoque() {
        return facade.findAll();
    }

}
