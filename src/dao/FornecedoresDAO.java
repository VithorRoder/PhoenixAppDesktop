package dao;

import java.util.List;
import model.Fornecedores;

public interface FornecedoresDAO {

    List<Fornecedores> findAll();

    int save(Fornecedores fornecedores);

    int update(Fornecedores fornecedores);

    int remove(Long idFornecedores);

}
