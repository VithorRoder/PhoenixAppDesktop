package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EntradaMaterial;

public class EntradaMaterialDAO2 implements EntradaMaterialDAO {
    
    private static final String SQL_FIND_ALL = "select * from entrada_material ORDER BY id ASC";
    
    @Override
    public int save(EntradaMaterial entradaMaterial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public int update(EntradaMaterial entradaMaterial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public int remove(Long idEntradaMat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<EntradaMaterial> findAll() {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<EntradaMaterial> EntradaMaterial = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conexao.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    EntradaMaterial entradaMaterial = new EntradaMaterial();
                    entradaMaterial.setIdEntradaMat(rs.getLong("id"));
                    entradaMaterial.setDataCadastroEntrada(rs.getString("data_cadastro"));
                    entradaMaterial.setNomeFornecedorEntrada(rs.getString("nome_fornecedor"));
                    entradaMaterial.setNumeroNf(rs.getString("numero_nf"));
                    entradaMaterial.setDataEmissaoNf(rs.getString("data_emissao"));
                    entradaMaterial.setTotalNf(rs.getString("total_nf"));
                    
                    EntradaMaterial.add(entradaMaterial);
                    
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return EntradaMaterial;
        } catch (SQLException ex) {
            Logger.getLogger(EntradaMaterialDAO2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return null;
    }
    
}
