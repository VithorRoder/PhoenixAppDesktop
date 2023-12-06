package controller;

import facade.MaquinasImpressorasFacade;
import java.util.List;
import model.MaquinasImpressoras;

public class MaquinasImpressorasController {

    private MaquinasImpressorasFacade facade;

    public MaquinasImpressorasController() {
       this.facade = new MaquinasImpressorasFacade();
    }
        public List<MaquinasImpressoras> findMaq() {
        return facade.findAll();
    }

}
