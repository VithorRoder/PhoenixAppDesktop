package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TiposOrcamentos;

public class TiposOrcamentosDAO2 implements TiposOrcamentosDAO {

    private static final String SQL_FIND_ALL = "select * from tipo_orcamento ORDER BY id ASC";

    @Override
    public List<TiposOrcamentos> findAll() {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<TiposOrcamentos> TiposOrcamentos = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    TiposOrcamentos tiposOrcamentos = new TiposOrcamentos();
                    tiposOrcamentos.setIdTiposOrc(rs.getLong("id"));
                    tiposOrcamentos.setDescricaoTiposOrc(rs.getString("descricao_interna"));
                    tiposOrcamentos.setTipoServicoTiposOrc(rs.getString("tipo_servico"));
                    tiposOrcamentos.setClassificacaoTiposOrc(rs.getString("classificacao"));
                    tiposOrcamentos.setValorMinTiposOrc(rs.getString("valor_min"));
                    tiposOrcamentos.setTipovalorMinTiposOrc(rs.getString("tipo_valor_min"));
                    tiposOrcamentos.setTipoUnitarioTiposOrc(rs.getString("tipo_unitario"));

                    TiposOrcamentos.add(tiposOrcamentos);
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return TiposOrcamentos;
        } catch (SQLException ex) {
            Logger.getLogger(MaquinasImpressorasDAO2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
