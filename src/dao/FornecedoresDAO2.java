package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Fornecedores;

public class FornecedoresDAO2 implements FornecedoresDAO {

    private static final String SQL_FIND_ALL = "select * from fornecedores ORDER BY id ASC";
    private static final String SQL_INSERT = "insert into fornecedores (data_cadastro, tipo, grupo1, grupo2, nome_fantasia, razao_social, cnpj, inscricao_estadual, inscricao_municipal, fone1, fone2, celular, contato_compras, contato_financeiro, cep, endereco, bairro, cidade, uf, email, site, observacoes) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "update fornecedores set data_cadastro = ?, tipo = ?, grupo1 = ?, grupo2 = ?, nome_fantasia = ?, razao_social = ?, cnpj = ?, inscricao_estadual = ?, inscricao_municipal = ?, fone1 = ?, fone2 = ?, celular = ?, contato_compras = ?, contato_financeiro = ?, cep = ?, endereco = ?, bairro = ?, cidade = ?, uf = ?, email=?, site = ?, observacoes = ? where id = ?";
    private static final String SQL_REMOVE = "delete from fornecedores where id = ?";

    @Override
    public List<Fornecedores> findAll() {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<Fornecedores> Fornecedores = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Fornecedores fornecedores = new Fornecedores();
                    fornecedores.setIdFornecedores(rs.getLong("id"));
                    fornecedores.setNomeFantasiaFornecedores(rs.getString("nome_fantasia"));
                    fornecedores.setTipoFornecedores(rs.getString("tipo"));
                    fornecedores.setCnpjFornecedores(rs.getString("cnpj"));
                    fornecedores.setCelularFornecedores(rs.getString("celular"));
                    fornecedores.setEmailFornecedores(rs.getString("email"));

                    Fornecedores.add(fornecedores);
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return Fornecedores;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public int save(Fornecedores fornecedores) {
        try {
            Connection conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_INSERT);
                pstm.setString(1, fornecedores.getDataCadastroFornecedores());
                pstm.setString(2, fornecedores.getTipoFornecedores());
                pstm.setString(3, fornecedores.getGrupo1Fornecedores());
                pstm.setString(4, fornecedores.getGrupo2Fornecedores());
                pstm.setString(5, fornecedores.getNomeFantasiaFornecedores());
                pstm.setString(6, fornecedores.getRazaoSocialFornecedores());
                pstm.setString(7, fornecedores.getCnpjFornecedores());
                pstm.setString(8, fornecedores.getInscricaoEstadualFornecedores());
                pstm.setString(9, fornecedores.getInscricaoMunicipalFornecedores());
                pstm.setString(10, fornecedores.getFone1Fornecedores());
                pstm.setString(11, fornecedores.getFone2Fornecedores());
                pstm.setString(12, fornecedores.getCelularFornecedores());
                pstm.setString(13, fornecedores.getContatoComprasFornecedores());
                pstm.setString(14, fornecedores.getContatoFinanceiroFornecedores());
                pstm.setString(15, fornecedores.getCepFornecedores());
                pstm.setString(16, fornecedores.getEnderecoFornecedores());
                pstm.setString(17, fornecedores.getBairroFornecedores());
                pstm.setString(18, fornecedores.getCidadeFornecedores());
                pstm.setString(19, fornecedores.getUfFornecedores());
                pstm.setString(20, fornecedores.getEmailFornecedores());
                pstm.setString(21, fornecedores.getSiteFornecedores());
                pstm.setString(22, fornecedores.getObservacoesFornecedores());
                result = pstm.executeUpdate();

            } catch (SQLException e) {
                System.err.println("Erro ao executar a query: " + e.getMessage());
                try {
                    if (conexao != null) {
                        conexao.rollback();
                    }
                } catch (SQLException ex) {
                    System.err.println("Erro ao tentar fazer rollback: " + ex.getMessage());
                }
                return 0;
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    @Override
    public int update(Fornecedores fornecedores) {
        try {
            Connection conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_UPDATE);
                pstm.setString(1, fornecedores.getDataCadastroFornecedores());
                pstm.setString(2, fornecedores.getTipoFornecedores());
                pstm.setString(3, fornecedores.getGrupo1Fornecedores());
                pstm.setString(4, fornecedores.getGrupo2Fornecedores());
                pstm.setString(5, fornecedores.getNomeFantasiaFornecedores());
                pstm.setString(6, fornecedores.getRazaoSocialFornecedores());
                pstm.setString(7, fornecedores.getCnpjFornecedores());
                pstm.setString(8, fornecedores.getInscricaoEstadualFornecedores());
                pstm.setString(9, fornecedores.getInscricaoMunicipalFornecedores());
                pstm.setString(10, fornecedores.getFone1Fornecedores());
                pstm.setString(11, fornecedores.getFone2Fornecedores());
                pstm.setString(12, fornecedores.getCelularFornecedores());
                pstm.setString(13, fornecedores.getContatoComprasFornecedores());
                pstm.setString(14, fornecedores.getContatoFinanceiroFornecedores());
                pstm.setString(15, fornecedores.getCepFornecedores());
                pstm.setString(16, fornecedores.getEnderecoFornecedores());
                pstm.setString(17, fornecedores.getBairroFornecedores());
                pstm.setString(18, fornecedores.getCidadeFornecedores());
                pstm.setString(19, fornecedores.getUfFornecedores());
                pstm.setString(20, fornecedores.getEmailFornecedores());
                pstm.setString(21, fornecedores.getSiteFornecedores());
                pstm.setString(22, fornecedores.getObservacoesFornecedores());
                pstm.setLong(23, fornecedores.getIdFornecedores());
                result = pstm.executeUpdate();

            } catch (SQLException e) {
                Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, e);
                System.err.println("Erro ao executar a query de atualização: " + e.getMessage());
                return 0;
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Erro ao obter conexão: " + ex.getMessage());
            return 0;
        }
    }

    @Override
    public int remove(Long idFornecedores) {
        try {
            Connection conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_REMOVE);
                pstm.setLong(1, idFornecedores);
                result = pstm.executeUpdate();

            } catch (SQLException e) {
                Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, e);
                System.err.println("Erro ao executar a query de remoção: " + e.getMessage());
                return 0;
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Erro ao obter conexão: " + ex.getMessage());
            return 0;
        }
    }

    public Fornecedores findById(Long id) {
        try {
            Connection conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            ResultSet rs = null;
            Fornecedores fornecedor = null;
            try {
                pstm = conexao.prepareStatement("SELECT * FROM fornecedores WHERE id = ?");
                pstm.setLong(1, id);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    fornecedor = new Fornecedores();
                    fornecedor.setIdFornecedores(rs.getLong("id"));
                    fornecedor.setDataCadastroFornecedores(rs.getString("data_cadastro"));
                    fornecedor.setTipoFornecedores(rs.getString("tipo"));
                    fornecedor.setGrupo1Fornecedores(rs.getString("grupo1"));
                    fornecedor.setGrupo2Fornecedores(rs.getString("grupo2"));
                    fornecedor.setNomeFantasiaFornecedores(rs.getString("nome_fantasia"));
                    fornecedor.setRazaoSocialFornecedores(rs.getString("razao_social"));
                    fornecedor.setCnpjFornecedores(rs.getString("cnpj"));
                    fornecedor.setInscricaoEstadualFornecedores(rs.getString("inscricao_estadual"));
                    fornecedor.setInscricaoMunicipalFornecedores(rs.getString("inscricao_municipal"));
                    fornecedor.setFone1Fornecedores(rs.getString("fone1"));
                    fornecedor.setFone2Fornecedores(rs.getString("fone2"));
                    fornecedor.setCelularFornecedores(rs.getString("celular"));
                    fornecedor.setContatoComprasFornecedores(rs.getString("contato_compras"));
                    fornecedor.setContatoFinanceiroFornecedores(rs.getString("contato_financeiro"));
                    fornecedor.setCepFornecedores(rs.getString("cep"));
                    fornecedor.setEnderecoFornecedores(rs.getString("endereco"));
                    fornecedor.setBairroFornecedores(rs.getString("bairro"));
                    fornecedor.setCidadeFornecedores(rs.getString("cidade"));
                    fornecedor.setUfFornecedores(rs.getString("uf"));
                    fornecedor.setEmailFornecedores(rs.getString("email"));
                    fornecedor.setSiteFornecedores(rs.getString("site"));
                    fornecedor.setObservacoesFornecedores(rs.getString("observacoes"));
                    
                }
            } catch (SQLException e) {
                System.out.println("Erro");
            } finally {
                ConexaoSingleton.close(conexao, pstm, rs);
            }
            return fornecedor;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
