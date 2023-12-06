package facade;

import dao.MateriaisInsumosDAO;
import dao.MateriaisInsumosDAO2;
import java.util.List;
import model.MateriaisInsumos;

public class MateriaisInsumosFacade {

    private final MateriaisInsumosDAO dao;

    public MateriaisInsumosFacade() {
        this.dao = new MateriaisInsumosDAO2();
    }

    public List<MateriaisInsumos> findAll() {
        return dao.findAll();
    }

}
