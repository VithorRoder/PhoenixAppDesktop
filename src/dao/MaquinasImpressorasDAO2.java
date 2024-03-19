package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MaquinasImpressoras;

public class MaquinasImpressorasDAO2 implements MaquinasImpressorasDAO {
    
    private static final String SQL_FIND_ALL = "select * from maquinas_impressoras ORDER BY id ASC";
    
    @Override
    public List<MaquinasImpressoras> findAll() {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<MaquinasImpressoras> MaquinasImpressoras = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    MaquinasImpressoras maquinasImpressoras = new MaquinasImpressoras();
                    maquinasImpressoras.setIdMaq(rs.getLong("id"));
                    maquinasImpressoras.setNomeMaq(rs.getString("nome_maquina"));
                    maquinasImpressoras.setDescricaoMaq(rs.getString("descricao"));
                    maquinasImpressoras.setTipoMaq(rs.getString("tipo_maquina"));
                    maquinasImpressoras.setCoresMaq(rs.getString("cores_maquina"));
                    maquinasImpressoras.setFormatoMinMaxMaq(rs.getString("formato_min_max"));
                    maquinasImpressoras.setGramaturaMinMaxMaq(rs.getString("gramatura_min_max"));
                    maquinasImpressoras.setInsumoMaq(rs.getString("insumo_utilizado"));
                    maquinasImpressoras.setCodinome(rs.getString("codinome"));
                    
                    MaquinasImpressoras.add(maquinasImpressoras);
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return MaquinasImpressoras;
        } catch (SQLException ex) {
            Logger.getLogger(MaquinasImpressorasDAO2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
