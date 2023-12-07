package paineis;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static paineis.PainelEntradaDeMaterial.TableEntradaMat;

public class PainelListaEstoque extends javax.swing.JPanel {

    public int ultimaLinhaClicadaListaEstoque = -1;
    public int ultimaLinhaClicadaEntradaMat = -1;

    public PainelListaEstoque() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableListaEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        TableListaEstoque.setAutoCreateRowSorter(true);
        TableListaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Valeu", "demiss", "evois", "sub", "15", "10", "5", "15-10"},
                {"4", "5", "6", "4", "7", "8", "9", "8"},
                {"7", "5", "4", "75", "5", "7", "5", "7"},
                {"7", "5", "7", "5", "7", "5", "7", "5"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Tipo Material", "Tipo Substrato", "Qtd. Estoque", "Un. Uso", "Qtd. Emprenho", "Estoque - Emprenho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableListaEstoque);
        if (TableListaEstoque.getColumnModel().getColumnCount() > 0) {
            TableListaEstoque.getColumnModel().getColumn(0).setMinWidth(60);
            TableListaEstoque.getColumnModel().getColumn(0).setPreferredWidth(60);
            TableListaEstoque.getColumnModel().getColumn(0).setMaxWidth(60);
            TableListaEstoque.getColumnModel().getColumn(1).setMinWidth(80);
            TableListaEstoque.getColumnModel().getColumn(1).setPreferredWidth(360);
            TableListaEstoque.getColumnModel().getColumn(1).setMaxWidth(500);
            TableListaEstoque.getColumnModel().getColumn(2).setMinWidth(110);
            TableListaEstoque.getColumnModel().getColumn(2).setPreferredWidth(120);
            TableListaEstoque.getColumnModel().getColumn(2).setMaxWidth(150);
            TableListaEstoque.getColumnModel().getColumn(3).setMinWidth(80);
            TableListaEstoque.getColumnModel().getColumn(3).setPreferredWidth(120);
            TableListaEstoque.getColumnModel().getColumn(3).setMaxWidth(150);
            TableListaEstoque.getColumnModel().getColumn(4).setPreferredWidth(100);
            TableListaEstoque.getColumnModel().getColumn(5).setPreferredWidth(100);
            TableListaEstoque.getColumnModel().getColumn(6).setPreferredWidth(100);
            TableListaEstoque.getColumnModel().getColumn(7).setMinWidth(80);
            TableListaEstoque.getColumnModel().getColumn(7).setPreferredWidth(120);
            TableListaEstoque.getColumnModel().getColumn(7).setMaxWidth(150);
        }

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TableListaEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public final void transferirValoresParaTabelaEntradaMat(int linhaSelecionadaEstoque) {
        DefaultTableModel modeloTabelaListaEstoque = (DefaultTableModel) TableListaEstoque.getModel();
        DefaultTableModel modeloTabelaEntradaMat = (DefaultTableModel) PainelEntradaDeMaterial.TableEntradaMat.getModel();

        if (ultimaLinhaClicadaListaEstoque >= 0 && ultimaLinhaClicadaListaEstoque < modeloTabelaListaEstoque.getRowCount()) {
            if (ultimaLinhaClicadaEntradaMat >= 0 && ultimaLinhaClicadaEntradaMat < modeloTabelaEntradaMat.getRowCount()) {
                Object valorColuna1 = modeloTabelaListaEstoque.getValueAt(ultimaLinhaClicadaListaEstoque, 1);
                Object valorColuna2 = modeloTabelaListaEstoque.getValueAt(ultimaLinhaClicadaListaEstoque, 2);

                modeloTabelaEntradaMat.setValueAt(valorColuna1, ultimaLinhaClicadaEntradaMat, 1);
                modeloTabelaEntradaMat.setValueAt(valorColuna2, ultimaLinhaClicadaEntradaMat, 2);

            }
        }
    }

    public final void configurarDoubleClick(JDialog dialog) {
        TableEntradaMat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    JTable target = (JTable) e.getSource();
                    ultimaLinhaClicadaEntradaMat = target.getSelectedRow();
                }
            }
        });

        TableListaEstoque.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    ultimaLinhaClicadaListaEstoque = target.getSelectedRow();
                    transferirValoresParaTabelaEntradaMat(ultimaLinhaClicadaListaEstoque);
                    dialog.dispose();
                }
            }
        });
    }
}
