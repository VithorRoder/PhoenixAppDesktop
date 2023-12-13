package paineis;

import static paineis.PainelCriarOrcamento.jTextFieldNomeCliente;
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
import controller.ClientesController;
import dao.ClientesDAO2;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import model.Clientes;
import table.ClientesTabela;
import table.ClientesTabelaRenderer;

public class PainelListaDeClientes extends javax.swing.JPanel {

    private List<Clientes> clientesList;

    public PainelListaDeClientes() {
        initComponents();
        refreshTable();
        duploClickClientes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaDeClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        TabelaListaDeClientes.setAutoCreateRowSorter(true);
        TabelaListaDeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaListaDeClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaListaDeClientes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TabelaListaDeClientes;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        clientesList = new ClientesController().findClientes();
        if (clientesList != null) {
            TabelaListaDeClientes.setModel(new ClientesTabela(clientesList));
            TabelaListaDeClientes.setDefaultRenderer(Object.class, new ClientesTabelaRenderer());

        }
    }

    private void duploClickClientes() {

        TabelaListaDeClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int rowIndex = TabelaListaDeClientes.getSelectedRow();
                    if (rowIndex != -1) {
                        Long idClienteSelecionado = (Long) TabelaListaDeClientes.getValueAt(rowIndex, 0);
                        ClientesDAO2 clientesDAO = new ClientesDAO2();
                        Clientes clientes = clientesDAO.findById(idClienteSelecionado);
                        if (clientes != null) {
                            // Preencher os componentes com os detalhes do cliente selecionado
                            PreencherClientes(clientes);
                        }
                    }
                }
            }
        });
    }

    private void PreencherClientes(Clientes clientes) {

        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelCriarCadastroClientes());
        container.revalidate();
        container.repaint();

        labelCodigoClientes.setText(String.valueOf(clientes.getIdCliente()));
        labelDataClientes.setText(clientes.getDataCadastroClientes());
        comboBoxGrupo1Clientes.setSelectedItem(clientes.getGrupo01_clientes());
        comboBoxGrupo2Clientes.setSelectedItem(clientes.getGrupo02_clientes());
        textFieldNomeFantasiaClientes.setText(clientes.getNomeFantasiaClientes());
        textFieldRazaoSocialClientes.setText(clientes.getRazaoSocialClientes());
        textFieldCnpjClientes.setText(clientes.getCnpjCpfClientes());
        textFieldInscricaoEstadualClientes.setText(clientes.getInscricaoEstadualClientes());
        textFieldIncricaoMunicipalClientes.setText(clientes.getInscricaoMunicipalClientes());
        textFieldFone1Clientes.setText(clientes.getFone01Clientes());
        textFieldFone2Clientes.setText(clientes.getFone02Clientes());
        textFieldCelularClientes.setText(clientes.getCelularClientes());
        textFieldContatoComprasClientes.setText(clientes.getContatoComprasClientes());
        textFieldContatoFinanceiroClientes.setText(clientes.getContatoFinanceiroClientes());
        textFieldCepClientes.setText(clientes.getCepClientes());
        textFieldEnderecoClientes.setText(clientes.getEnderecoClientes());
        textFieldBairroClientes.setText(clientes.getBairroClientes());
        textFieldCidadeClientes.setText(clientes.getCidadeClientes());
        textFieldUfClientes.setText(clientes.getUfClientes());
        textFieldEmailClientes.setText(clientes.getEmailClientes());
        textFieldSiteClientes.setText(clientes.getSiteClientes());
        jTextAreaClientes.setText(clientes.getObservacoesClientes());
    }

    public static final void passarClienteParaOrc(JDialog dialog) {
        TabelaListaDeClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();
                    int column = 1;

                    if (row != -1) {
                        Object value = target.getValueAt(row, column);
                        if (value != null) {
                            jTextFieldNomeCliente.setText(value.toString());
                            dialog.dispose();
                        }
                    }
                }
            }
        });
    }
}
