package paineis;

import controller.EstoqueController;
import java.util.List;
import model.Estoque;
import table.EstoqueTabela;
import table.EstoqueTabelaRenderer;

public class PainelListaEstoqueDialog extends javax.swing.JPanel {

    private List<Estoque> estoqueList;

    public PainelListaEstoqueDialog() {
        initComponents();
        refreshTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableListaEstoqueDialog = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        TableListaEstoqueDialog.setAutoCreateRowSorter(true);
        TableListaEstoqueDialog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableListaEstoqueDialog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TableListaEstoqueDialogFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(TableListaEstoqueDialog);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Estoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableListaEstoqueDialogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableListaEstoqueDialogFocusLost
        refreshTable();
    }//GEN-LAST:event_TableListaEstoqueDialogFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TableListaEstoqueDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        estoqueList = new EstoqueController().findEstoque();
        if (estoqueList != null) {
            TableListaEstoqueDialog.setModel(new EstoqueTabela(estoqueList));
            TableListaEstoqueDialog.setDefaultRenderer(Object.class, new EstoqueTabelaRenderer());
        }
    }
}
