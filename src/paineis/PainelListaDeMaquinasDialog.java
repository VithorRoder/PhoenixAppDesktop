package paineis;

import Teste.ComboBoxCellEditorDetalhes;
import static Teste.PainelDetalhesOrcamento.table;
import controller.MaquinasImpressorasController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JDialog;
import model.MaquinasImpressoras;
import table.MaquinasImpressorasTabela;
import table.MaquinasImpressorasTabelaRenderer;

public class PainelListaDeMaquinasDialog extends javax.swing.JPanel {

    private List<MaquinasImpressoras> maquinasList;
    private int linhaSelecionadaTabelaCriarOrc = -1;

    public PainelListaDeMaquinasDialog() {
        initComponents();
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaMaquinasImpressorasDialog = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Máquinas e Impressoras");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(262, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(262, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(262, 41));

        TabelaMaquinasImpressorasDialog.setAutoCreateRowSorter(true);
        TabelaMaquinasImpressorasDialog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaMaquinasImpressorasDialog.getTableHeader().setReorderingAllowed(false);
        TabelaMaquinasImpressorasDialog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TabelaMaquinasImpressorasDialogFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaMaquinasImpressorasDialog);

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

    private void TabelaMaquinasImpressorasDialogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaMaquinasImpressorasDialogFocusLost
        refreshTable();
    }//GEN-LAST:event_TabelaMaquinasImpressorasDialogFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaMaquinasImpressorasDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        maquinasList = new MaquinasImpressorasController().findMaq();
        if (maquinasList != null) {
            TabelaMaquinasImpressorasDialog.setModel(new MaquinasImpressorasTabela(maquinasList));
            TabelaMaquinasImpressorasDialog.setDefaultRenderer(Object.class, new MaquinasImpressorasTabelaRenderer());

        }
    }

    public void mouseTableMaquinas(JDialog dialog) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    linhaSelecionadaTabelaCriarOrc = table.getSelectedRow();

                }
            }
        });

        TabelaMaquinasImpressorasDialog.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selectedRowMat = TabelaMaquinasImpressorasDialog.getSelectedRow();
                    Object valorColuna1 = TabelaMaquinasImpressorasDialog.getValueAt(selectedRowMat, 8);

                    int linhaSelecionadaTabelaMaquinas = TabelaMaquinasImpressorasDialog.getSelectedRow();
                    if (linhaSelecionadaTabelaCriarOrc != -1 && linhaSelecionadaTabelaMaquinas != -1) {
                        // Obtém a linha selecionada previamente na TabelaCriarOrc
                        int linhaCriarOrc = linhaSelecionadaTabelaCriarOrc;

                        table.setValueAt(valorColuna1, linhaCriarOrc, 5);
                        ComboBoxCellEditorDetalhes.textField.setText("" + valorColuna1);
                        dialog.dispose();
                    }
                }
            }
        });
    }

}
