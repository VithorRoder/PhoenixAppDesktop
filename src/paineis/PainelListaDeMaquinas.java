package paineis;

import controller.MaquinasImpressorasController;
import java.util.List;
import model.MaquinasImpressoras;
import table.MaquinasImpressorasTabela;
import table.MaquinasImpressorasTabelaRenderer;

public class PainelListaDeMaquinas extends javax.swing.JPanel {

    private List<MaquinasImpressoras> maquinasList;

    public PainelListaDeMaquinas() {
        initComponents();
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaMaquinasImpressoras = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Máquinas e Impressoras");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(262, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(262, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(262, 41));

        TabelaMaquinasImpressoras.setAutoCreateRowSorter(true);
        TabelaMaquinasImpressoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaMaquinasImpressoras.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaMaquinasImpressoras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TabelaMaquinasImpressoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        maquinasList = new MaquinasImpressorasController().findMaq();
        if (maquinasList != null) {
            TabelaMaquinasImpressoras.setModel(new MaquinasImpressorasTabela(maquinasList));
            TabelaMaquinasImpressoras.setDefaultRenderer(Object.class, new MaquinasImpressorasTabelaRenderer());

        }
    }

}
