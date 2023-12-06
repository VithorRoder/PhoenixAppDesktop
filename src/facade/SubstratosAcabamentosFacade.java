package facade;

import dao.SubstratosAcabamentosDAO;
import dao.SubstratosAcabamentosDAO2;
import java.util.List;
import model.SubstratosAcabamentos;

public class SubstratosAcabamentosFacade {

    private final SubstratosAcabamentosDAO dao;

    public SubstratosAcabamentosFacade() {
        this.dao = new SubstratosAcabamentosDAO2();
    }

    public List<SubstratosAcabamentos> findAll() {
        return dao.findAll();
    }
}
