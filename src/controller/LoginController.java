package controller;

import static application.ProgramFrame.jMenuCadastroDeFornecedores;
import static application.ProgramFrame.jMenuEstoque;
import paineis.PainelBemVindo;
import dao.ConexaoSingleton;
import dao.UsuarioDAO;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import static application.ProgramFrame.jMenuSubstratosAcabamentos;
import static application.ProgramFrame.jMenuMaquinasImpressoras;
import static application.ProgramFrame.jMenuMateriaisInsumos;
import static application.ProgramFrame.jMenuOrdemServico;
import static application.ProgramFrame.jMenuTipoOrcamento;
import static application.ProgramFrame.jMenuCriarOrcamento;
import static application.ProgramFrame.jMenuListaOrcamento;
import static application.ProgramFrame.jMenuOrcamento;
import static application.ProgramFrame.jMenuClientes;
import static application.ProgramFrame.jMenuCriarCadastroDeFornecedores;
import static application.ProgramFrame.jMenuEntradaMaterial;
import static application.ProgramFrame.jMenuListaDeFornecedores;
import static application.ProgramFrame.jMenuListaEntradaMaterial;
import static application.ProgramFrame.jMenuListaEstoque;
import paineis.PainelPrincipalLogin;

public class LoginController {

    private final PainelPrincipalLogin painelPrincipal;
    private PainelBemVindo panelBemVindo;

    @SuppressWarnings("LeakingThisInConstructor")
    public LoginController(PainelPrincipalLogin painelPrincipal, PainelBemVindo panelBemVindo) {
        this.painelPrincipal = painelPrincipal;
        this.panelBemVindo = panelBemVindo;
        this.panelBemVindo.setController(this);

    }

    public void setPanelBemVindo(PainelBemVindo panelBemVindo) {
        this.panelBemVindo = panelBemVindo;
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
            panelBemVindo.getLabelUsuario().setText(Controladorjmenubar.nomeUsuarioAutenticado);
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
            parent.add(panelBemVindo);
            parent.revalidate();
            parent.repaint();

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreta", "Autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void fazerLogout() {

        Controladorjmenubar.usuarioAutenticado = false;
        Controladorjmenubar.nomeUsuarioAutenticado = null;
        panelBemVindo.getLabelUsuario().setText("");

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

        painelPrincipal.getjFormattedTextField1usuariologin().setText("");
        painelPrincipal.getjPasswordField1senhalogin().setText("");

        JOptionPane.showMessageDialog(null, "Usuário deslogado", "Logout", JOptionPane.INFORMATION_MESSAGE);
    }

}
