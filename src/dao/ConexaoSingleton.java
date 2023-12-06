package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoSingleton {

    private static Connection connn = null;

    private ConexaoSingleton() {

    }

    public static synchronized Connection getConnection() throws SQLException {
        try {
            if (connn == null || connn.isClosed()) {
                System.out.println("Conectando ao banco de dados Singleton...");
                String url = "jdbc:postgresql://localhost:5433/phoenix";
                String user = "postgres";
                String password = "211205";
                connn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão Com o Servidor: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return connn;

    }

    public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (stmt != null) {
                stmt.close();
            }

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {

        }
    }
}
