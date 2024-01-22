package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Clientes;

public class ClientesDAO2 implements ClientesDAO {

    private static final String SQL_INSERT = "insert into clientes (data_cadastro_clientes, grupo01_clientes, grupo02_clientes, nome_fantasia_clientes, razao_social_clientes, cnpj_cpf_clientes, inscricao_estadual_clientes, inscricao_municipal_clientes, fone01_clientes, fone02_clientes, celular_clientes, contato_compras_clientes, contato_financeiro_clientes, cep_clientes, endereco_clientes, bairro_clientes, cidade_clientes, uf_clientes, email_clientes, site_clientes, observacoes_clientes) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "update clientes set data_cadastro_clientes = ?, grupo01_clientes = ?, grupo02_clientes = ?, nome_fantasia_clientes = ?, razao_social_clientes = ?, cnpj_cpf_clientes = ?, inscricao_estadual_clientes = ?, inscricao_municipal_clientes = ?, fone01_clientes = ?, fone02_clientes = ?, celular_clientes = ?, contato_compras_clientes = ?, contato_financeiro_clientes = ?, cep_clientes = ?, endereco_clientes = ?, bairro_clientes = ?, cidade_clientes = ?, uf_clientes = ?, email_clientes = ?, site_clientes = ?, observacoes_clientes = ? where id = ?";
    private static final String SQL_REMOVE = "delete from clientes where id = ?";
    private static final String SQL_FIND_ALL = "select * from clientes ORDER BY id ASC";

    @Override
    public int save(Clientes clientes) {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_INSERT);
                pstm.setString(1, clientes.getDataCadastroClientes());
                pstm.setString(2, clientes.getGrupo01_clientes());
                pstm.setString(3, clientes.getGrupo02_clientes());
                pstm.setString(4, clientes.getNomeFantasiaClientes());
                pstm.setString(5, clientes.getRazaoSocialClientes());
                pstm.setString(6, clientes.getCnpjCpfClientes());
                pstm.setString(7, clientes.getInscricaoEstadualClientes());
                pstm.setString(8, clientes.getInscricaoMunicipalClientes());
                pstm.setString(9, clientes.getFone01Clientes());
                pstm.setString(10, clientes.getFone02Clientes());
                pstm.setString(11, clientes.getCelularClientes());
                pstm.setString(12, clientes.getContatoComprasClientes());
                pstm.setString(13, clientes.getContatoFinanceiroClientes());
                pstm.setString(14, clientes.getCepClientes());
                pstm.setString(15, clientes.getEnderecoClientes());
                pstm.setString(16, clientes.getBairroClientes());
                pstm.setString(17, clientes.getCidadeClientes());
                pstm.setString(18, clientes.getUfClientes());
                pstm.setString(19, clientes.getEmailClientes());
                pstm.setString(20, clientes.getSiteClientes());
                pstm.setString(21, clientes.getObservacoesClientes());

                result = pstm.executeUpdate();

            } catch (SQLException e) {
                System.out.println("Erro ao executar o PreparedStatement: " + e.getMessage());
                try {
                    if (conexao != null) {
                        conexao.rollback();
                    }
                } catch (SQLException ex) {
                    System.out.println("Erro ao realizar o rollback: " + ex.getMessage());
                }
                e.printStackTrace();
            } finally {
                if (pstm != null) {
                    try {
                        pstm.close();
                    } catch (SQLException e) {
                        System.out.println("Erro ao fechar o PreparedStatement: " + e.getMessage());
                    }
                }
            }
            return result;

        } catch (SQLException ex) {
            System.out.println("Erro ao obter a conexão com o banco de dados: " + ex.getMessage());
            Logger.getLogger(ClientesDAO2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return 0;
    }

    @Override
    public int update(Clientes clientes) {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_UPDATE);
                pstm.setString(1, clientes.getDataCadastroClientes());
                pstm.setString(2, clientes.getGrupo01_clientes());
                pstm.setString(3, clientes.getGrupo02_clientes());
                pstm.setString(4, clientes.getNomeFantasiaClientes());
                pstm.setString(5, clientes.getRazaoSocialClientes());
                pstm.setString(6, clientes.getCnpjCpfClientes());
                pstm.setString(7, clientes.getInscricaoEstadualClientes());
                pstm.setString(8, clientes.getInscricaoMunicipalClientes());
                pstm.setString(9, clientes.getFone01Clientes());
                pstm.setString(10, clientes.getFone02Clientes());
                pstm.setString(11, clientes.getCelularClientes());
                pstm.setString(12, clientes.getContatoComprasClientes());
                pstm.setString(13, clientes.getContatoFinanceiroClientes());
                pstm.setString(14, clientes.getCepClientes());
                pstm.setString(15, clientes.getEnderecoClientes());
                pstm.setString(16, clientes.getBairroClientes());
                pstm.setString(17, clientes.getCidadeClientes());
                pstm.setString(18, clientes.getUfClientes());
                pstm.setString(19, clientes.getEmailClientes());
                pstm.setString(20, clientes.getSiteClientes());
                pstm.setString(21, clientes.getObservacoesClientes());
                pstm.setLong(22, clientes.getIdCliente());
                result = pstm.executeUpdate();
            } catch (SQLException e) {
                Logger.getLogger(ClientesDAO2.class.getName()).log(Level.SEVERE, null, e);
            }
            return result;
        } catch (SQLException e) {
            Logger.getLogger(ClientesDAO2.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return 0;
    }

    @Override
    public int remove(Long idCliente) {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            int result = 0;
            try {
                pstm = conexao.prepareStatement(SQL_REMOVE);
                pstm.setLong(1, idCliente);
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
            Logger.getLogger(ClientesDAO2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return 0;
    }

    @Override
    public List<Clientes> findAll() {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<Clientes> Clientes = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conexao.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Clientes clientes = new Clientes();
                    clientes.setIdCliente(rs.getLong("id"));
                    clientes.setNomeFantasiaClientes(rs.getString("nome_fantasia_clientes"));
                    clientes.setEnderecoClientes(rs.getString("endereco_clientes"));
                    clientes.setCelularClientes(rs.getString("celular_clientes"));
                    clientes.setEmailClientes(rs.getString("email_clientes"));

                    Clientes.add(clientes);

                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return Clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return null;
    }

    public Clientes findById(Long id) {
        Connection conexao = null;
        try {
            conexao = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            ResultSet rs = null;
            Clientes clientes = null;
            try {
                pstm = conexao.prepareStatement("SELECT * FROM clientes WHERE id = ?");
                pstm.setLong(1, id);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    clientes = new Clientes();
                    clientes.setIdCliente(rs.getLong("id"));
                    clientes.setDataCadastroClientes(rs.getString("data_cadastro_clientes"));
                    clientes.setGrupo01_clientes(rs.getString("grupo01_clientes"));
                    clientes.setGrupo02_clientes(rs.getString("grupo02_clientes"));
                    clientes.setNomeFantasiaClientes(rs.getString("nome_fantasia_clientes"));
                    clientes.setRazaoSocialClientes(rs.getString("razao_social_clientes"));
                    clientes.setCnpjCpfClientes(rs.getString("cnpj_cpf_clientes"));
                    clientes.setInscricaoEstadualClientes(rs.getString("inscricao_estadual_clientes"));
                    clientes.setInscricaoMunicipalClientes(rs.getString("inscricao_municipal_clientes"));
                    clientes.setFone01Clientes(rs.getString("fone01_clientes"));
                    clientes.setFone02Clientes(rs.getString("fone02_clientes"));
                    clientes.setCelularClientes(rs.getString("celular_clientes"));
                    clientes.setContatoComprasClientes(rs.getString("contato_compras_clientes"));
                    clientes.setContatoFinanceiroClientes(rs.getString("contato_financeiro_clientes"));
                    clientes.setCepClientes(rs.getString("cep_clientes"));
                    clientes.setEnderecoClientes(rs.getString("endereco_clientes"));
                    clientes.setBairroClientes(rs.getString("bairro_clientes"));
                    clientes.setCidadeClientes(rs.getString("cidade_clientes"));
                    clientes.setUfClientes(rs.getString("uf_clientes"));
                    clientes.setEmailClientes(rs.getString("email_clientes"));
                    clientes.setSiteClientes(rs.getString("site_clientes"));
                    clientes.setObservacoesClientes(rs.getString("observacoes_clientes"));

                }
            } catch (SQLException e) {
                System.out.println("Erro");
            } finally {
                ConexaoSingleton.close(conexao, pstm, rs);
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresDAO2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoSingleton.close(conexao, null, null);
        }
        return null;
    }

}
