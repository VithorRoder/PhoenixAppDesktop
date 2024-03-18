package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MateriaisInsumos;

public class MateriaisInsumosDAO2 implements MateriaisInsumosDAO {
    
    private static final String SQL_FIND_ALL = "select * from materiais_insumos ORDER BY id ASC";
    
    @Override
    public List<MateriaisInsumos> findAll() {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<MateriaisInsumos> MateriaisInsumos = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    MateriaisInsumos materiaisInsumos = new MateriaisInsumos();
                    materiaisInsumos.setIdInsumos(rs.getLong("id"));
                    materiaisInsumos.setNomeInsumos(rs.getString("nome_material"));
                    materiaisInsumos.setTipoInsumos(rs.getString("tipo_material"));
                    materiaisInsumos.setGramaturaInsumos(rs.getString("gramatura"));
                    materiaisInsumos.setPreco(rs.getString("preco"));
                    materiaisInsumos.setTipoPreco(rs.getString("tipo_preco"));
                    materiaisInsumos.setCodinome(rs.getString("codinome"));
                    
                    MateriaisInsumos.add(materiaisInsumos);
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return MateriaisInsumos;
        } catch (SQLException ex) {
            Logger.getLogger(MateriaisInsumosDAO2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
