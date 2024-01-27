package dao;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EntradaMaterial;
import static paineis.PainelEntradaDeMaterial.TableEntradaMat;

public class EntradaMaterialDAO2 implements EntradaMaterialDAO {

    private static final String SQL_REMOVE = "delete from entrada_material where id = ?";
    private static final String SQL_FIND_ALL = "select * from entrada_material ORDER BY id ASC";

    @Override
    public int save(EntradaMaterial entradaMaterial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(EntradaMaterial entradaMaterial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int remove(Long idEntradaMat) {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_REMOVE);
                pstm.setLong(1, idEntradaMat);
                result = pstm.executeUpdate();

            } catch (SQLException e) {
                try {
                    if (conexao != null) {
                        conexao.rollback();
                    }
                } catch (SQLException ex) {
                    ex.getMessage();
                }
                e.getMessage();
            }
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(EntradaMaterialDAO2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return 0;

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

    public EntradaMaterial findById(Long id) {
        try {
            Connection conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            ResultSet rs = null;
            EntradaMaterial entradaMaterial = null;
            try {
                pstm = conexao.prepareStatement("SELECT * FROM entrada_material WHERE id = ?");
                pstm.setLong(1, id);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    entradaMaterial = new EntradaMaterial();
                    entradaMaterial.setIdEntradaMat(rs.getLong("id"));
                    entradaMaterial.setDataCadastroEntrada(rs.getString("data_cadastro"));
                    entradaMaterial.setHoraEntrada(rs.getString("hora"));
                    entradaMaterial.setIdFornecedorEntrada(rs.getString("cod_fornecedor"));
                    entradaMaterial.setNomeFornecedorEntrada(rs.getString("nome_fornecedor"));
                    entradaMaterial.setNumeroNf(rs.getString("numero_nf"));
                    entradaMaterial.setDataEmissaoNf(rs.getString("data_emissao"));
                    entradaMaterial.setTotalNf(rs.getString("total_nf"));
                    entradaMaterial.setObservacoesEntrada(rs.getString("observacoes"));
                    entradaMaterial.setTableEntradaJson(rs.getString("table_entrada_mat"));
                }
            } catch (SQLException e) {
                System.out.println("Erro");
            } finally {
                ConexaoSingleton.close(conexao, pstm, rs);
            }
            return entradaMaterial;
        } catch (SQLException ex) {
            Logger.getLogger(EntradaMaterialDAO2.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
