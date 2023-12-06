package controller;

import facade.MateriaisInsumosFacade;
import java.util.List;
import model.MateriaisInsumos;

public class MateriaisInsumosController {

    private MateriaisInsumosFacade facade;

    public MateriaisInsumosController() {
        this.facade = new MateriaisInsumosFacade();
    }

    public List<MateriaisInsumos> findInsumos() {
        return facade.findAll();
    }

}
