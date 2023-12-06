package facade;

import dao.TiposOrcamentosDAO;
import dao.TiposOrcamentosDAO2;
import java.util.List;
import model.TiposOrcamentos;

public class TiposOrcamentosFacade {

    private final TiposOrcamentosDAO dao;

    public TiposOrcamentosFacade() {
        this.dao = new TiposOrcamentosDAO2();
    }

    public List<TiposOrcamentos> findAll() {
        return dao.findAll();
    }
}
