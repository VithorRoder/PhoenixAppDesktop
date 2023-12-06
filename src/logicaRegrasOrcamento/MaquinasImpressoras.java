package logicaRegrasOrcamento;

import dao.ConexaoSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaquinasImpressoras {

    public static double TipoMaquina() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM maquinas_impressoras WHERE tipo_maquina = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "4 cores");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 10.00;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

    public static double CoresMaquina() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM maquinas_impressoras WHERE cores_maquina = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "1x0 a 4x4");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 12.00;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

    public static double FormatoMinMax() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM maquinas_impressoras WHERE formato_min_max = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "10x15cm - 57x44cm");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 5.00;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

    public static double GramaturaMinMax() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM maquinas_impressoras WHERE gramatura_min_max = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "70g a 300g");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 5.00;
                return quantidade * precoUnitario;
            } else {
                System.out.println("Valor não encontrado");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return 0;
    }

    public static double InsumoUtilizado() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM maquinas_impressoras WHERE insumo_utilizado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Resmas");
            rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt(1);
                double precoUnitario = 2.00;
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
