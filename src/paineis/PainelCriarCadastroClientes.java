package paineis;

import paineisAbas.PainelDadosClientes;
import static paineisAbas.PainelDadosClientes.comboBoxGrupo1Clientes;
import static paineisAbas.PainelDadosClientes.comboBoxGrupo2Clientes;
import static paineisAbas.PainelDadosClientes.jTextAreaClientes;
import static paineisAbas.PainelDadosClientes.labelCodigoClientes;
import static paineisAbas.PainelDadosClientes.labelDataClientes;
import static paineisAbas.PainelDadosClientes.textFieldBairroClientes;
import static paineisAbas.PainelDadosClientes.textFieldCelularClientes;
import static paineisAbas.PainelDadosClientes.textFieldCepClientes;
import static paineisAbas.PainelDadosClientes.textFieldCidadeClientes;
import static paineisAbas.PainelDadosClientes.textFieldCnpjClientes;
import static paineisAbas.PainelDadosClientes.textFieldContatoComprasClientes;
import static paineisAbas.PainelDadosClientes.textFieldContatoFinanceiroClientes;
import static paineisAbas.PainelDadosClientes.textFieldEmailClientes;
import static paineisAbas.PainelDadosClientes.textFieldEnderecoClientes;
import static paineisAbas.PainelDadosClientes.textFieldFone1Clientes;
import static paineisAbas.PainelDadosClientes.textFieldFone2Clientes;
import static paineisAbas.PainelDadosClientes.textFieldIncricaoMunicipalClientes;
import static paineisAbas.PainelDadosClientes.textFieldInscricaoEstadualClientes;
import static paineisAbas.PainelDadosClientes.textFieldNomeFantasiaClientes;
import static paineisAbas.PainelDadosClientes.textFieldRazaoSocialClientes;
import static paineisAbas.PainelDadosClientes.textFieldSiteClientes;
import static paineisAbas.PainelDadosClientes.textFieldUfClientes;
import paineisAbas.PainelProducaoClientes;
import controller.ClientesController;
import javax.swing.JOptionPane;
import model.Clientes;
import application.ApplicationFrame;

public class PainelCriarCadastroClientes extends javax.swing.JPanel {

    public PainelCriarCadastroClientes() {
        initComponents();
        addTab();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void addTab() {
        PainelDadosClientes painelDados = new PainelDadosClientes(this);
        PainelProducaoClientes painelProducao = new PainelProducaoClientes(this);

        jTabbedPane1.addTab("Dados Gerais", painelDados);
        jTabbedPane1.addTab("Produção", painelProducao);
    }

    public void cancelarAlteraçãoClientes() {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Cancelar Alteração ?", "Cancelar Alteração", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaDeClientes();
        }
    }

    public void removerClientes() {

        // Ler o ID do campo labelCodigoClientes
        Long idClientes = null;
        String idTexto = labelCodigoClientes.getText();
        if (!idTexto.isEmpty()) {
            try {
                idClientes = Long.parseLong(idTexto);
            } catch (NumberFormatException e) {

            }
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?", "Excluir Cadastro de Clientes", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (idClientes != null) {
                new ClientesController().excluirClientes(idClientes);
                JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
                ApplicationFrame.tabbedPaneCustom1.remove(this);
                ApplicationFrame.showPainelListaDeClientes();
            } else {
                JOptionPane.showMessageDialog(this, "Código do Cliente é Nulo !", "Código Vazio", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void salvarAlterarClientes() {

        Clientes clientes = new Clientes();

        String itemSelecionadoGrupo1 = comboBoxGrupo1Clientes.getSelectedItem() != null ? comboBoxGrupo1Clientes.getSelectedItem().toString() : "";
        String itemSelecionadoGrupo2 = comboBoxGrupo2Clientes.getSelectedItem() != null ? comboBoxGrupo2Clientes.getSelectedItem().toString() : "";

        if (labelDataClientes.getText().length() > 0
                && itemSelecionadoGrupo1.length() > 0
                && itemSelecionadoGrupo2.length() > 0
                && textFieldNomeFantasiaClientes.getText().length() > 0
                && textFieldRazaoSocialClientes.getText().length() > 0
                && textFieldCnpjClientes.getText().length() > 0
                && textFieldInscricaoEstadualClientes.getText().length() > 0
                && textFieldIncricaoMunicipalClientes.getText().length() > 0
                && textFieldFone1Clientes.getText().length() > 0
                && textFieldFone2Clientes.getText().length() > 0
                && textFieldCelularClientes.getText().length() > 0
                && textFieldContatoComprasClientes.getText().length() > 0
                && textFieldContatoFinanceiroClientes.getText().length() > 0
                && textFieldCepClientes.getText().length() > 0
                && textFieldEnderecoClientes.getText().length() > 0
                && textFieldBairroClientes.getText().length() > 0
                && textFieldCidadeClientes.getText().length() > 0
                && textFieldUfClientes.getText().length() > 0
                && textFieldEmailClientes.getText().length() > 0
                && textFieldSiteClientes.getText().length() > 0
                && jTextAreaClientes.getText().length() > 0) {

            clientes.setDataCadastroClientes(labelDataClientes.getText());
            clientes.setGrupo01_clientes(itemSelecionadoGrupo1);
            clientes.setGrupo02_clientes(itemSelecionadoGrupo2);
            clientes.setNomeFantasiaClientes(textFieldNomeFantasiaClientes.getText());
            clientes.setRazaoSocialClientes(textFieldRazaoSocialClientes.getText());
            clientes.setCnpjCpfClientes(textFieldCnpjClientes.getText());
            clientes.setInscricaoEstadualClientes(textFieldInscricaoEstadualClientes.getText());
            clientes.setInscricaoMunicipalClientes(textFieldIncricaoMunicipalClientes.getText());
            clientes.setFone01Clientes(textFieldFone1Clientes.getText());
            clientes.setFone02Clientes(textFieldFone2Clientes.getText());
            clientes.setCelularClientes(textFieldCelularClientes.getText());
            clientes.setContatoComprasClientes(textFieldContatoComprasClientes.getText());
            clientes.setContatoFinanceiroClientes(textFieldContatoFinanceiroClientes.getText());
            clientes.setCepClientes(textFieldCepClientes.getText());
            clientes.setEnderecoClientes(textFieldEnderecoClientes.getText());
            clientes.setBairroClientes(textFieldBairroClientes.getText());
            clientes.setCidadeClientes(textFieldCidadeClientes.getText());
            clientes.setUfClientes(textFieldUfClientes.getText());
            clientes.setEmailClientes(textFieldEmailClientes.getText());
            clientes.setSiteClientes(textFieldSiteClientes.getText());
            clientes.setObservacoesClientes(jTextAreaClientes.getText());

        } else {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!", "Código Vazio", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ler o ID do campo labelCodigoClientes
        Long idClientes = null;
        String idTexto = labelCodigoClientes.getText();
        if (!idTexto.isEmpty()) {
            try {
                idClientes = Long.parseLong(idTexto);
            } catch (NumberFormatException e) {

            }
        }

        int result = 0;

        if (idClientes == null) {
            result = new ClientesController().addClientes(clientes);
            JOptionPane.showMessageDialog(this, result == 1 ? "Valor inserido com sucesso!" : "Falha ao inserir valor!");

            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaDeClientes();
        } else {

            clientes.setIdCliente(idClientes);
            result = new ClientesController().alterarClientes(clientes);
            JOptionPane.showMessageDialog(this, result == 1 ? "Valor Alterado Com Sucesso!" : "Falha ao alterar valor!");
            idClientes = null;

            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaDeClientes();
        }

    }

}
