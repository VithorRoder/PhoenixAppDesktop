package controller;

import facade.SubstratosAcabamentosFacade;
import java.util.List;
import model.SubstratosAcabamentos;

public class SubstratosAcabamentosController {

    private SubstratosAcabamentosFacade facade;

    public SubstratosAcabamentosController() {
        this.facade = new SubstratosAcabamentosFacade();
    }

    public List<SubstratosAcabamentos> findSubstratos() {
        return facade.findAll();
    }

}
