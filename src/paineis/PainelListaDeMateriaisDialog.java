package paineis;

import controller.MateriaisInsumosController;
import model.MateriaisInsumos;
import table.MateriaisInsumosTabela;
import table.MateriaisInsumosTabelaRenderer;
import Teste.ComboBoxCellEditorMaterial;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class PainelListaDeMateriaisDialog extends javax.swing.JPanel {

    private List<MateriaisInsumos> insumosList;
    private ComboBoxCellEditorMaterial cellEditor;
    private int row;
    private int column;

    public PainelListaDeMateriaisDialog() {
        initComponents();
        refreshTable();
        setupTableClickListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriaisDialog = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTableMateriaisDialog.setAutoCreateRowSorter(true);
        jTableMateriaisDialog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableMateriaisDialog.getTableHeader().setReorderingAllowed(false);
        jTableMateriaisDialog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableMateriaisDialogFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMateriaisDialog);

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

    private void jTableMateriaisDialogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableMateriaisDialogFocusLost
        refreshTable();
    }//GEN-LAST:event_jTableMateriaisDialogFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableMateriaisDialog;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        insumosList = new MateriaisInsumosController().findInsumos();
        if (insumosList != null) {
            jTableMateriaisDialog.setModel(new MateriaisInsumosTabela(insumosList));
            jTableMateriaisDialog.setDefaultRenderer(Object.class, new MateriaisInsumosTabelaRenderer());
        }
    }

    public void setCellEditor(ComboBoxCellEditorMaterial cellEditor, int row, int column) {
        this.cellEditor = cellEditor;
        this.row = row;
        this.column = column;
    }

    private void setupTableClickListener() {
        jTableMateriaisDialog.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selectedRow = jTableMateriaisDialog.getSelectedRow();
                    if (selectedRow != -1) {
                        String value = jTableMateriaisDialog.getValueAt(selectedRow, 6).toString();
                        if (cellEditor != null) {
                            cellEditor.setSelectedValue(value);
                        }
                        SwingUtilities.getWindowAncestor(PainelListaDeMateriaisDialog.this).dispose();
                    }
                }
            }
        });
    }
}
