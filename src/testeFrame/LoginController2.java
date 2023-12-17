package testeFrame;

import controller.*;
import dao.ConexaoSingleton;
import dao.UsuarioDAO;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import static testeFrame.ApplicationFrame.jMenuCadastroDeFornecedores;
import static testeFrame.ApplicationFrame.jMenuClientes;
import static testeFrame.ApplicationFrame.jMenuCriarCadastroDeFornecedores;
import static testeFrame.ApplicationFrame.jMenuCriarOrcamento;
import static testeFrame.ApplicationFrame.jMenuEntradaMaterial;
import static testeFrame.ApplicationFrame.jMenuEstoque;
import static testeFrame.ApplicationFrame.jMenuListaDeFornecedores;
import static testeFrame.ApplicationFrame.jMenuListaEntradaMaterial;
import static testeFrame.ApplicationFrame.jMenuListaEstoque;
import static testeFrame.ApplicationFrame.jMenuListaOrcamento;
import static testeFrame.ApplicationFrame.jMenuMaquinasImpressoras;
import static testeFrame.ApplicationFrame.jMenuMateriaisInsumos;
import static testeFrame.ApplicationFrame.jMenuOrcamento;
import static testeFrame.ApplicationFrame.jMenuOrdemServico;
import static testeFrame.ApplicationFrame.jMenuSubstratosAcabamentos;
import static testeFrame.ApplicationFrame.jMenuTipoOrcamento;
//import static testeFrame.ApplicationFrame.tabbedPaneCustom1;

public class LoginController2 {

    private final PainelPrincipalLogin2 painelPrincipal2;
    private final ApplicationFrame tabbed;

    @SuppressWarnings("LeakingThisInConstructor")
    public LoginController2(PainelPrincipalLogin2 painelPrincipal2, ApplicationFrame tabbed) {
        this.painelPrincipal2 = painelPrincipal2;
        this.tabbed = tabbed;
    }

    public void autenticar() throws SQLException {
        // buscar um usuário da view.
        String usuario = painelPrincipal2.getjFormattedTextField1usuariologin().getText();
        @SuppressWarnings("deprecation")
        String senha = painelPrincipal2.getjPasswordField1senhalogin().getText();
        Usuario usuarioAutenticar = new Usuario(usuario, senha);

        // verificar se existe no banco de dados.
        Connection conexao = ConexaoSingleton.getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);

        // se existir, desbloquear as funcionalidades do programa.
        if (existe) {
            Controladorjmenubar.usuarioAutenticado = true;
            Controladorjmenubar.nomeUsuarioAutenticado = usuario;
            JOptionPane.showMessageDialog(null, "Usuário autenticado", "Autenticação", JOptionPane.INFORMATION_MESSAGE);

            jMenuOrcamento.setEnabled(true);
            jMenuListaOrcamento.setEnabled(true);
            jMenuCriarOrcamento.setEnabled(true);
            jMenuOrdemServico.setEnabled(true);
            jMenuClientes.setEnabled(true);
            jMenuMateriaisInsumos.setEnabled(true);
            jMenuMaquinasImpressoras.setEnabled(true);
            jMenuTipoOrcamento.setEnabled(true);
            jMenuSubstratosAcabamentos.setEnabled(true);
            jMenuEstoque.setEnabled(true);
            jMenuEntradaMaterial.setEnabled(true);
            jMenuListaEstoque.setEnabled(true);
            jMenuListaEntradaMaterial.setEnabled(true);
            jMenuCadastroDeFornecedores.setEnabled(true);
            jMenuCriarCadastroDeFornecedores.setEnabled(true);
            jMenuListaDeFornecedores.setEnabled(true);

            Container parent = painelPrincipal2.getParent();
            parent.remove(painelPrincipal2);
            parent.add(tabbed.getTabbedPaneCustom1());
            parent.revalidate();
            parent.repaint();

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreta", "Autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void fazerLogout() {

        Controladorjmenubar.usuarioAutenticado = false;
        Controladorjmenubar.nomeUsuarioAutenticado = null;

        jMenuOrcamento.setEnabled(false);
        jMenuListaOrcamento.setEnabled(false);
        jMenuCriarOrcamento.setEnabled(false);
        jMenuOrdemServico.setEnabled(false);
        jMenuClientes.setEnabled(false);
        jMenuMateriaisInsumos.setEnabled(false);
        jMenuMaquinasImpressoras.setEnabled(false);
        jMenuTipoOrcamento.setEnabled(false);
        jMenuSubstratosAcabamentos.setEnabled(false);
        jMenuEstoque.setEnabled(false);
        jMenuEntradaMaterial.setEnabled(false);
        jMenuListaEstoque.setEnabled(false);
        jMenuListaEntradaMaterial.setEnabled(false);
        jMenuCadastroDeFornecedores.setEnabled(false);
        jMenuCriarCadastroDeFornecedores.setEnabled(false);
        jMenuListaDeFornecedores.setEnabled(false);

        painelPrincipal2.getjFormattedTextField1usuariologin().setText("");
        painelPrincipal2.getjPasswordField1senhalogin().setText("");

        JOptionPane.showMessageDialog(null, "Usuário deslogado", "Logout", JOptionPane.INFORMATION_MESSAGE);
    }

}
