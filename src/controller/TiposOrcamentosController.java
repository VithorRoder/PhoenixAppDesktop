package controller;

import facade.TiposOrcamentosFacade;
import java.util.List;
import model.TiposOrcamentos;

public class TiposOrcamentosController {
    
    private TiposOrcamentosFacade facade;
    
    public TiposOrcamentosController() {
        this.facade = new TiposOrcamentosFacade();
    }
    
    public List<TiposOrcamentos> findOrc(){
        return facade.findAll();
    }

}
