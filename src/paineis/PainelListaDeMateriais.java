package paineis;

import controller.MateriaisInsumosController;
import java.util.List;
import model.MateriaisInsumos;
import table.MateriaisInsumosTabela;
import table.MateriaisInsumosTabelaRenderer;

public class PainelListaDeMateriais extends javax.swing.JPanel {

    private List<MateriaisInsumos> insumosList;

    public PainelListaDeMateriais() {
        initComponents();
        refreshTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriais = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTableMateriais.setAutoCreateRowSorter(true);
        jTableMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableMateriais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableMateriais.getTableHeader().setReorderingAllowed(false);
        jTableMateriais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableMateriaisFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMateriais);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materiais/Insumos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1274, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMateriaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableMateriaisFocusLost
        refreshTable();
    }//GEN-LAST:event_jTableMateriaisFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableMateriais;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        insumosList = new MateriaisInsumosController().findInsumos();
        if (insumosList != null) {
            jTableMateriais.setModel(new MateriaisInsumosTabela(insumosList));
            jTableMateriais.setDefaultRenderer(Object.class, new MateriaisInsumosTabelaRenderer());

        }
    }
}
