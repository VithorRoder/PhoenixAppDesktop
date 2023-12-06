package controller;

import paineis.PainelPrincipalLogin;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import paineis.PainelCadastroDeUsuario;
import dao.ConexaoSingleton;
import java.awt.BorderLayout;
import java.awt.Container;

public class FormCadastroController {

    private final PainelCadastroDeUsuario view;

    public FormCadastroController(PainelCadastroDeUsuario view) {
        this.view = view;
    }

    public void salvaUsuario() {

        String usuario = view.getjTextFieldUsuario().getText();
        @SuppressWarnings("deprecation")
        String senha = view.getjPasswordFieldSenha().getText();
        String cad = "Cadastro";

        if (usuario.length() < 5 || senha.length() < 5) {
            JOptionPane.showMessageDialog(null, "O usuário e a senha devem ter pelo menos 5 caracteres.", cad, JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar se o usuário já existe no banco de dados (case-insensitive)
        if (usuarioJaExiste(usuario)) {
            JOptionPane.showMessageDialog(null, "Um usuário com esse nome já foi registrado.", cad, JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario usuarioThorvi = new Usuario(usuario, senha);

        try {

            Connection connn = ConexaoSingleton.getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(connn);

            // Salvar o usuário exatamente como foi digitado (preservando a formatação)
            usuarioDao.insert(usuarioThorvi);

            JOptionPane.showMessageDialog(null, "Usuário Salvo com Sucesso !");

            Container container = view.getParent();
            container.remove(view);
            container.add(new PainelPrincipalLogin(), BorderLayout.CENTER);
            container.revalidate();
            container.repaint();

        } catch (SQLException ex) {
            Logger.getLogger(PainelCadastroDeUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean usuarioJaExiste(String usuario) {
        try {
            Connection conn = ConexaoSingleton.getConnection();
            String sql = "SELECT COUNT(*) FROM usuario WHERE LOWER(usuario) = LOWER(?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, usuario);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0; // Retorna verdadeiro se o usuário já existe
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false; // Retorna falso se ocorrer um erro ou se o usuário não existir
    }
}
