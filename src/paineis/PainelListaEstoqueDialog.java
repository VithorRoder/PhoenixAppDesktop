package paineis;

import controller.EstoqueController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import model.Estoque;
import static paineis.PainelEntradaDeMaterial.TableEntradaMat;
import table.EstoqueTabela;
import table.EstoqueTabelaRenderer;

public class PainelListaEstoqueDialog extends javax.swing.JPanel {

    private List<Estoque> estoqueList;
    private TableCellEditor cellEditor;
    private int editingRow;
    private int editingColumn;
    private JDialog dialog;

    public PainelListaEstoqueDialog(JDialog dialog) {
        this.dialog = dialog;
        initComponents();
        refreshTable();
    }

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
        TableListaEstoqueDialog.getTableHeader().setReorderingAllowed(false);
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

            TableListaEstoqueDialog.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        JTable target = (JTable) e.getSource();
                        int selectedRow = target.getSelectedRow();
                        if (selectedRow != -1) {
                            // Obtenha os valores das colunas 0 e 1 na linha selecionada da TableListaEstoqueDialog
                            Object valueCol0 = target.getValueAt(selectedRow, 0);
                            Object valueCol1 = target.getValueAt(selectedRow, 1);

                            // Supondo que `TableEntradaMat` seja a tabela de destino
                            int rowEntradaMat = TableEntradaMat.getSelectedRow();  // Pegue a linha selecionada na TableEntradaMat
                            if (rowEntradaMat != -1) {
                                // Defina os valores na `TableEntradaMat`
                                TableEntradaMat.setValueAt(valueCol0, rowEntradaMat, 1); // Define o valor da coluna 0 para a coluna 1
                                TableEntradaMat.setValueAt(valueCol1, rowEntradaMat, 2); // Define o valor da coluna 1 para a coluna 2

                                if (cellEditor != null) {
                                    cellEditor.getTableCellEditorComponent(null, valueCol0, true, editingRow, editingColumn);
                                    cellEditor.stopCellEditing();
                                }

                                dialog.dispose(); // Fecha o diálogo
                            }
                        }
                    }
                }
            });
        }
    }

    public void setCellEditor(TableCellEditor cellEditor, int editingRow, int editingColumn) {
        this.cellEditor = cellEditor;
        this.editingRow = editingRow;
        this.editingColumn = editingColumn;
    }
}
