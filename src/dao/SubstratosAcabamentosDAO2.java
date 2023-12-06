package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SubstratosAcabamentos;

public class SubstratosAcabamentosDAO2 implements SubstratosAcabamentosDAO {

    private static final String SQL_FIND_ALL = "select * from substratos_acabamentos ORDER BY id ASC";

    @Override
    public List<SubstratosAcabamentos> findAll() {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            List<SubstratosAcabamentos> SubstratosAcabamentos = new ArrayList<>();
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_ALL);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    SubstratosAcabamentos substratosAcabamentos = new SubstratosAcabamentos();
                    substratosAcabamentos.setIdSubstratos(rs.getLong("id"));
                    substratosAcabamentos.setDescricaoSubstratos(rs.getString("descricao"));
                    substratosAcabamentos.setTipoSubstratos(rs.getString("tipo"));
                    substratosAcabamentos.setValorSubstratos(rs.getString("valor"));
                    substratosAcabamentos.setTipoValorSubstratos(rs.getString("tipo_valor"));

                    SubstratosAcabamentos.add(substratosAcabamentos);
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return SubstratosAcabamentos;
        } catch (SQLException ex) {
            Logger.getLogger(SubstratosAcabamentosDAO2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
