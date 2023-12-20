package controller;

import paineis.PainelPrincipalLogin;
import application.ApplicationFrame;
import static application.ApplicationFrame.chama;
import dao.ConexaoSingleton;
import dao.UsuarioDAO;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import static application.ApplicationFrame.jMenuCadastroDeFornecedores;
import static application.ApplicationFrame.jMenuClientes;
import static application.ApplicationFrame.jMenuCriarCadastroDeFornecedores;
import static application.ApplicationFrame.jMenuCriarOrcamento;
import static application.ApplicationFrame.jMenuEntradaMaterial;
import static application.ApplicationFrame.jMenuEstoque;
import static application.ApplicationFrame.jMenuListaDeFornecedores;
import static application.ApplicationFrame.jMenuListaEntradaMaterial;
import static application.ApplicationFrame.jMenuListaEstoque;
import static application.ApplicationFrame.jMenuListaOrcamento;
import static application.ApplicationFrame.jMenuMaquinasImpressoras;
import static application.ApplicationFrame.jMenuMateriaisInsumos;
import static application.ApplicationFrame.jMenuOrcamento;
import static application.ApplicationFrame.jMenuOrdemServico;
import static application.ApplicationFrame.jMenuSubstratosAcabamentos;
import static application.ApplicationFrame.jMenuTipoOrcamento;
import static application.ApplicationFrame.tabbedPaneCustom1;
import paineis.PainelJmenuBar;
import static paineis.PainelJmenuBar.labelUsuario;

public class LoginController {

    private final PainelPrincipalLogin painelPrincipal;
    private final ApplicationFrame tabbed;

    @SuppressWarnings("LeakingThisInConstructor")
    public LoginController(PainelPrincipalLogin painelPrincipal, ApplicationFrame tabbed) {
        this.painelPrincipal = painelPrincipal;
        this.tabbed = tabbed;
    }

    public void autenticar() throws SQLException {
        // buscar um usuário da view.
        String usuario = painelPrincipal.getjFormattedTextField1usuariologin().getText();
        @SuppressWarnings("deprecation")
        String senha = painelPrincipal.getjPasswordField1senhalogin().getText();
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

            Container parent = painelPrincipal.getParent();
            parent.remove(painelPrincipal);
            parent.add(tabbedPaneCustom1);
            chama();
            PainelJmenuBar.botaoLogoff.setVisible(true);
            parent.revalidate();
            parent.repaint();

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreta", "Autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void fazerLogout() {

        tabbedPaneCustom1.removeAll();
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

        labelUsuario.setText("");

        Container parent = tabbedPaneCustom1.getParent();
        parent.remove(tabbedPaneCustom1);
        parent.add(painelPrincipal);
        PainelJmenuBar.botaoLogoff.setVisible(false);
        parent.revalidate();
        parent.repaint();

        painelPrincipal.getjFormattedTextField1usuariologin().setText("");
        painelPrincipal.getjPasswordField1senhalogin().setText("");

        JOptionPane.showMessageDialog(null, "Usuário deslogado", "Logout", JOptionPane.INFORMATION_MESSAGE);
    }

}
