package dao;

import java.util.List;
import model.EntradaMaterial;

public interface EntradaMaterialDAO {

    int save(EntradaMaterial entradaMaterial);

    int update(EntradaMaterial entradaMaterial);

    int remove(Long idEntradaMat);

    List<EntradaMaterial> findAll();

}
