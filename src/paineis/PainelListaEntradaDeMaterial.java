package paineis;

import application.ApplicationFrame;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import controller.EntradaMaterialController;
import dao.EntradaMaterialDAO2;
import java.util.List;
import model.EntradaMaterial;
import static paineis.PainelEntradaDeMaterial.TableEntradaMat;
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
        jTableListaEntMaterial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTableListaEntMaterial.setAutoCreateRowSorter(true);
        jTableListaEntMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data De Entrada", "Nome Fornecedor", "Nro NF", "Data Emissão NF", "Total NF"
            }
        ));
        jScrollPane1.setViewportView(jTableListaEntMaterial);
        if (jTableListaEntMaterial.getColumnModel().getColumnCount() > 0) {
            jTableListaEntMaterial.getColumnModel().getColumn(0).setMaxWidth(90);
            jTableListaEntMaterial.getColumnModel().getColumn(2).setMinWidth(350);
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
            .addGroup(layout.createSequentialGroup()
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
    public static javax.swing.JTable jTableListaEntMaterial;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        entradaMaterialList = new EntradaMaterialController().findEntradaMaterial();
        if (entradaMaterialList != null) {
            jTableListaEntMaterial.setModel(new EntradaMaterialTabela(entradaMaterialList));
            jTableListaEntMaterial.setDefaultRenderer(Object.class, new EntradaMaterialTabelaRenderer());

        }
    }

    private void duploClickEntradaMaterial() {

        int rowIndex = jTableListaEntMaterial.getSelectedRow();
        if (rowIndex != -1) {
            Long idEntradaMaterialSelecionado = (Long) jTableListaEntMaterial.getValueAt(rowIndex, 0);
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

        // Lógica para processar o JSON
        JsonNode jsonData = entrada.getJsonDataAsJsonNode();
        if (jsonData != null && jsonData.isArray()) {
            ArrayNode arrayNode = (ArrayNode) jsonData;

            // Preencher a tabela
            for (int i = 0; i < arrayNode.size(); i++) {
                JsonNode rowNode = arrayNode.get(i);
                for (int j = 0; j < rowNode.size(); j++) {
                    Object cellValue = convertJsonValueToObject(rowNode.get(j));

                    // Acesso Direto para Tabela
                    TableEntradaMat.getModel().setValueAt(cellValue, i, j);
                }
            }
        }
    }

    private Object convertJsonValueToObject(JsonNode jsonNode) {
        if (jsonNode == null || jsonNode.isNull()) {
            return "";
        } else if (jsonNode.isTextual()) {
            return jsonNode.asText();
        } else if (jsonNode.isNumber()) {
            return jsonNode.numberValue();
        } else if (jsonNode.isBoolean()) {
            return jsonNode.asBoolean();
        } else if (jsonNode.isObject() || jsonNode.isArray()) {
            return jsonNode.toString();
        } else {
            return null;
        }
    }
}
