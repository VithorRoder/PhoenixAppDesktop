package paineis;

import application.ApplicationFrame;
import controller.EntradaMaterialController;
import dao.EntradaMaterialDAO2;
import java.util.List;
import model.EntradaMaterial;
import static paineis.PainelEntradaDeMaterial.jFormattedTextFieldDataENF;
import static paineis.PainelEntradaDeMaterial.jFormattedTextFieldNNF;
import static paineis.PainelEntradaDeMaterial.jFormattedTextFieldObservacoes;
import static paineis.PainelEntradaDeMaterial.jLabelID;
import static paineis.PainelEntradaDeMaterial.jformatedTextFieldPreco1;
import static paineis.PainelEntradaDeMaterial.labelCodigoForn02;
import static paineis.PainelEntradaDeMaterial.labelData;
import static paineis.PainelEntradaDeMaterial.labelHora;
import static paineis.PainelEntradaDeMaterial.textFieldFornecedor;
import table.EntradaMaterialTabela;
import table.EntradaMaterialTabelaRenderer;

public class PainelListaEntradaDeMaterial extends javax.swing.JPanel {
    
    private List<EntradaMaterial> entradaMaterialList;
    
    public PainelListaEntradaDeMaterial() {
        initComponents();
        refreshTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Data De Entrada", "Nome Fornecedor", "Nro NF", "Data Emissão NF", "Total NF"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(2).setMinWidth(350);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Entrada de Material");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        duploClickEntradaMaterial();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        
        entradaMaterialList = new EntradaMaterialController().findEntradaMaterial();
        if (entradaMaterialList != null) {
            jTable1.setModel(new EntradaMaterialTabela(entradaMaterialList));
            jTable1.setDefaultRenderer(Object.class, new EntradaMaterialTabelaRenderer());
            
        }
    }
    
    private void duploClickEntradaMaterial() {
        
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex != -1) {
            Long idEntradaMaterialSelecionado = (Long) jTable1.getValueAt(rowIndex, 0);
            EntradaMaterialDAO2 entradaMaterialDAO2 = new EntradaMaterialDAO2();
            EntradaMaterial entrada = entradaMaterialDAO2.findById(idEntradaMaterialSelecionado);
            if (entrada != null) {
                // Preencher os componentes com os detalhes da Entrada de Matrial selecionado
                preencherEntradaDeMaterial(entrada);
            }
        }
    }
    
    private void preencherEntradaDeMaterial(EntradaMaterial entrada) {
        
        ApplicationFrame.tabbedPaneCustom1.remove(this);
        ApplicationFrame.showPainelEntradaDeMaterial();
        
        jLabelID.setText(String.valueOf(entrada.getIdEntradaMat()));
        labelData.setText(String.valueOf(entrada.getDataCadastroEntrada()));
        labelHora.setText(String.valueOf(entrada.getHoraEntrada()));
        labelCodigoForn02.setText(String.valueOf(entrada.getIdFornecedorEntrada()));
        textFieldFornecedor.setText(String.valueOf(entrada.getNomeFornecedorEntrada()));
        jFormattedTextFieldNNF.setText(String.valueOf(entrada.getNumeroNf()));
        jFormattedTextFieldDataENF.setText(String.valueOf(entrada.getDataEmissaoNf()));
        jformatedTextFieldPreco1.setText(String.valueOf(entrada.getTotalNf()));
        jFormattedTextFieldObservacoes.setText(String.valueOf(entrada.getObservacoesEntrada()));
    }
}
