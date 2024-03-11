package paineis;

import Teste.PainelOrcamento;
import static Teste.PainelOrcamento.comboBoxTOPainelOrcamento;
import controller.TiposOrcamentosController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import model.TiposOrcamentos;
import table.TiposOrcamentosTabela;
import table.TiposOrcamentosTabelaRenderer;

public class PainelTipoDeOrcamento extends javax.swing.JPanel {

    private List<TiposOrcamentos> tiposOrcList;

    public PainelTipoDeOrcamento() {
        initComponents();
        refreshTable();
        mouseTable();

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
    private javax.swing.JTable TabelaTiposOrcamentos;
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

    private void passarParaComboBox() {
        int selectedRow = TabelaTiposOrcamentos.getSelectedRow();
        if (selectedRow != -1) {
            Object value = TabelaTiposOrcamentos.getValueAt(selectedRow, 1);
            comboBoxTOPainelOrcamento.setSelectedItem(value);
            PainelOrcamento.dialog2.dispose();
        }
    }

    private void mouseTable() {
        TabelaTiposOrcamentos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    passarParaComboBox();
                }
            }
        });
    }

}
