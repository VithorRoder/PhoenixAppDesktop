package facade;

import dao.EntradaMaterialDAO;
import dao.EntradaMaterialDAO2;
import java.util.List;
import model.EntradaMaterial;

public class EntradaMaterialFacade {

    private final EntradaMaterialDAO dao;

    public EntradaMaterialFacade() {
        this.dao = new EntradaMaterialDAO2();
    }

    public int save(EntradaMaterial entradaMaterial) {
        return dao.save(entradaMaterial);

    }

    public int update(EntradaMaterial entradaMaterial) {
        return dao.update(entradaMaterial);
    }

    public int remove(Long id) {
        return dao.remove(id);
    }

    public List<EntradaMaterial> findAll() {
        return dao.findAll();
    }

}
