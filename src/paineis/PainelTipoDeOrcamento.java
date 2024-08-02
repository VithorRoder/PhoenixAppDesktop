package paineis;

import controller.TiposOrcamentosController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import model.TiposOrcamentos;
import table.TiposOrcamentosTabela;
import table.TiposOrcamentosTabelaRenderer;

public class PainelTipoDeOrcamento extends javax.swing.JPanel {

    private List<TiposOrcamentos> tiposOrcList;

    public PainelTipoDeOrcamento() {
        initComponents();
        refreshTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTiposOrcamentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        TabelaTiposOrcamentos.setAutoCreateRowSorter(true);
        TabelaTiposOrcamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaTiposOrcamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaTiposOrcamentos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipos de Orçamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TabelaTiposOrcamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        tiposOrcList = new TiposOrcamentosController().findOrc();
        if (tiposOrcList != null) {
            TabelaTiposOrcamentos.setModel(new TiposOrcamentosTabela(tiposOrcList));
            TabelaTiposOrcamentos.setDefaultRenderer(Object.class, new TiposOrcamentosTabelaRenderer());
        }
    }

    public static final void passarTipoOrcamentoParaOrc(JDialog dialog, JComboBox comboBoxTOPainelOrcamento, JLabel jLabelTipoOrcamento) {
        TabelaTiposOrcamentos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();
                    int column = 1;
                    int column0 = 0;

                    if (row != -1) {
                        Object value1 = target.getValueAt(row, column);
                        Object value2 = target.getValueAt(row, column0);

                        if (value1 != null) {
                            comboBoxTOPainelOrcamento.getEditor().setItem(value1.toString());
                            dialog.dispose();
                        }
                        if (value2 != null) {
                            jLabelTipoOrcamento.setText(String.format(" Tipo de Orçamento (%s)", value2));
                            dialog.dispose();
                        }
                    }
                }
            }
        });
    }

}
