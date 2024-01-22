package controller;

import facade.EntradaMaterialFacade;
import java.util.List;
import model.EntradaMaterial;

public class EntradaMaterialController {

    private EntradaMaterialFacade facade;

    public EntradaMaterialController() {
        this.facade = new EntradaMaterialFacade();
    }

    public int addEntradaMaterial(EntradaMaterial entradaMaterial) {
        return facade.save(entradaMaterial);
    }

    public int alterarEntradaMaterial(EntradaMaterial entradaMaterial) {
        return facade.update(entradaMaterial);
    }

    public int excluirEntradaMaterial(Long id) {
        return facade.remove(id);
    }

    public List<EntradaMaterial> findEntradaMaterial() {
        return facade.findAll();
    }

}
