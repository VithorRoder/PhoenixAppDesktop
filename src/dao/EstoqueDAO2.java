package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Estoque;

public class EstoqueDAO2 implements EstoqueDAO {
    
    private static final String SQL_FIND_ALL = "select * from estoque ORDER BY id ASC";
    
    @Override
    public List<Estoque> findAll() {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<Estoque> Estoque = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Estoque estoque = new Estoque();
                    estoque.setId_estoque(rs.getLong("id"));
                    estoque.setDescricao_estoque(rs.getString("descricao_estoque"));
                    estoque.setTipo_material(rs.getString("tipo_material"));
                    estoque.setTipo_substrato(rs.getString("tipo_substrato"));
                    estoque.setQuantidade_estoque(rs.getString("quantidade_estoque"));
                    estoque.setUnidade_uso(rs.getString("unidade_uso"));
                    estoque.setQuantidade_empenho(rs.getString("quantidade_empenho"));
                    estoque.setEstoque_empenho(rs.getString("estoque_empenho"));
                    
                    Estoque.add(estoque);
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return Estoque;
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
