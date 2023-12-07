package paineis;

import static paineis.PainelCriarCadastroFornecedores.comboBoxGrupo2Fornecedores;
import static paineis.PainelCriarCadastroFornecedores.jTextAreaThorvi;
import static paineis.PainelCriarCadastroFornecedores.labelCodigoFornecedores;
import static paineis.PainelCriarCadastroFornecedores.labelDataFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldBairroFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldCelularFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldCepFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldCidadeFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldCnpjFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldContatoComprasFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldContatoFinanceiroFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldEmailFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldEnderecoFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldFone1Fornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldFone2Fornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldIncricaoMunicipalFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldInscricaoEstadualFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldNomeFantasiaFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldRazaoSocialFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldSiteFornecedores;
import static paineis.PainelCriarCadastroFornecedores.textFieldUfFornecedores;
import controller.FornecedoresController;
import dao.FornecedoresDAO2;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import model.Fornecedores;
import table.FornecedoresTabela;
import table.FornecedoresTabelaRenderer;
import static paineis.PainelCriarCadastroFornecedores.comboBoxGrupo1Fornecedores;
import static paineis.PainelCriarCadastroFornecedores.comboBoxTipoFornecedores;
import static paineis.PainelEntradaDeMaterial.textFieldFornecedor;

public class PainelListaDeFornecedores extends javax.swing.JPanel {

    private List<Fornecedores> fornecedoreslist;

    public PainelListaDeFornecedores() {
        initComponents();
        refreshTable();
        duploClickFornecedor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaListaFornecedores = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Fornecedores");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(352, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(352, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(352, 41));

        TabelaListaFornecedores.setAutoCreateRowSorter(true);
        TabelaListaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome Fantasia", "Tipo", "Cnpj", "Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaListaFornecedores);
        if (TabelaListaFornecedores.getColumnModel().getColumnCount() > 0) {
            TabelaListaFornecedores.getColumnModel().getColumn(0).setMinWidth(80);
            TabelaListaFornecedores.getColumnModel().getColumn(0).setPreferredWidth(80);
            TabelaListaFornecedores.getColumnModel().getColumn(0).setMaxWidth(100);
            TabelaListaFornecedores.getColumnModel().getColumn(2).setMinWidth(150);
            TabelaListaFornecedores.getColumnModel().getColumn(2).setPreferredWidth(150);
            TabelaListaFornecedores.getColumnModel().getColumn(2).setMaxWidth(150);
            TabelaListaFornecedores.getColumnModel().getColumn(3).setMinWidth(200);
            TabelaListaFornecedores.getColumnModel().getColumn(3).setPreferredWidth(200);
            TabelaListaFornecedores.getColumnModel().getColumn(3).setMaxWidth(200);
            TabelaListaFornecedores.getColumnModel().getColumn(4).setMinWidth(200);
            TabelaListaFornecedores.getColumnModel().getColumn(4).setPreferredWidth(200);
            TabelaListaFornecedores.getColumnModel().getColumn(4).setMaxWidth(200);
            TabelaListaFornecedores.getColumnModel().getColumn(5).setMinWidth(220);
            TabelaListaFornecedores.getColumnModel().getColumn(5).setPreferredWidth(220);
            TabelaListaFornecedores.getColumnModel().getColumn(5).setMaxWidth(220);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TabelaListaFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        fornecedoreslist = new FornecedoresController().findFornecedores();
        if (fornecedoreslist != null) {
            TabelaListaFornecedores.setModel(new FornecedoresTabela(fornecedoreslist));
            TabelaListaFornecedores.setDefaultRenderer(Object.class, new FornecedoresTabelaRenderer());

        }

    }

    private void duploClickFornecedor() {

        TabelaListaFornecedores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int rowIndex = TabelaListaFornecedores.getSelectedRow();
                    if (rowIndex != -1) {
                        Long idFornecedorSelecionado = (Long) TabelaListaFornecedores.getValueAt(rowIndex, 0);
                        FornecedoresDAO2 fornecedoresDAO = new FornecedoresDAO2();
                        Fornecedores fornecedor = fornecedoresDAO.findById(idFornecedorSelecionado);
                        if (fornecedor != null) {
                            // Preencher os componentes com os detalhes do fornecedor selecionado
                            preencherFornecedores(fornecedor);
                        }
                    }
                }
            }
        });
    }

    private void preencherFornecedores(Fornecedores fornecedor) {

        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelCriarCadastroFornecedores());
        container.revalidate();
        container.repaint();

        labelCodigoFornecedores.setText(String.valueOf(fornecedor.getIdFornecedores()));
        labelDataFornecedores.setText(fornecedor.getDataCadastroFornecedores());
        comboBoxTipoFornecedores.setSelectedItem(fornecedor.getTipoFornecedores());
        comboBoxGrupo1Fornecedores.setSelectedItem(fornecedor.getGrupo1Fornecedores());
        comboBoxGrupo2Fornecedores.setSelectedItem(fornecedor.getGrupo2Fornecedores());
        textFieldNomeFantasiaFornecedores.setText(fornecedor.getNomeFantasiaFornecedores());
        textFieldRazaoSocialFornecedores.setText(fornecedor.getRazaoSocialFornecedores());
        textFieldCnpjFornecedores.setText(fornecedor.getCnpjFornecedores());
        textFieldInscricaoEstadualFornecedores.setText(fornecedor.getInscricaoEstadualFornecedores());
        textFieldIncricaoMunicipalFornecedores.setText(fornecedor.getInscricaoMunicipalFornecedores());
        textFieldFone1Fornecedores.setText(fornecedor.getFone1Fornecedores());
        textFieldFone2Fornecedores.setText(fornecedor.getFone2Fornecedores());
        textFieldCelularFornecedores.setText(fornecedor.getCelularFornecedores());
        textFieldContatoComprasFornecedores.setText(fornecedor.getContatoComprasFornecedores());
        textFieldContatoFinanceiroFornecedores.setText(fornecedor.getContatoFinanceiroFornecedores());
        textFieldCepFornecedores.setText(fornecedor.getCepFornecedores());
        textFieldEnderecoFornecedores.setText(fornecedor.getEnderecoFornecedores());
        textFieldBairroFornecedores.setText(fornecedor.getBairroFornecedores());
        textFieldCidadeFornecedores.setText(fornecedor.getCidadeFornecedores());
        textFieldUfFornecedores.setText(fornecedor.getUfFornecedores());
        textFieldEmailFornecedores.setText(fornecedor.getEmailFornecedores());
        textFieldSiteFornecedores.setText(fornecedor.getSiteFornecedores());
        jTextAreaThorvi.setText(fornecedor.getObservacoesFornecedores());
    }

    public static final void passarFornecedorParaEntradaMat(JDialog dialog) {

        TabelaListaFornecedores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();
                    int column = 1;

                    if (row != -1) {
                        Object value = target.getValueAt(row, column);
                        if (value != null) {
                            textFieldFornecedor.setText(value.toString());
                            dialog.dispose();

                        }
                    }
                }
            }
        });
    }
}
