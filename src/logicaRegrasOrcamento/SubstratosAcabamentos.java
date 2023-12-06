package logicaRegrasOrcamento;

import dao.ConexaoSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SubstratosAcabamentos {

    public static double Tipo() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM substratos_acabamentos WHERE tipo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Substrato");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 4.50;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

    public static double valor() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM substratos_acabamentos WHERE valor = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "R$80,00");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 15.75;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

    public static double tipoValor() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM substratos_acabamentos WHERE tipo_valor = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Litro");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 8.20;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

}
