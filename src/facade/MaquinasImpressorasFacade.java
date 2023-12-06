package facade;

import dao.MaquinasImpressorasDAO;
import dao.MaquinasImpressorasDAO2;
import java.util.List;
import model.MaquinasImpressoras;

public class MaquinasImpressorasFacade {

    private final MaquinasImpressorasDAO dao;

    public MaquinasImpressorasFacade() {
        this.dao = new MaquinasImpressorasDAO2();
    }

    public List<MaquinasImpressoras> findAll() {
        return dao.findAll();
    }
}
