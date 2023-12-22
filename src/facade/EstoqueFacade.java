package facade;

import dao.EstoqueDAO;
import dao.EstoqueDAO2;
import java.util.List;
import model.Estoque;

public class EstoqueFacade {

    private final EstoqueDAO dao;

    public EstoqueFacade() {
        this.dao = new EstoqueDAO2();
    }

    public List<Estoque> findAll() {
        return dao.findAll();
    }

}
