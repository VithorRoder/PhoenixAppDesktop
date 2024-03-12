package paineis;

import Teste.PainelOrcamento;
import static Teste.PainelOrcamento.comboBoxClientes;
import controller.ClientesController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import model.Clientes;
import table.ClientesTabela;
import table.ClientesTabelaRenderer;

public class PainelListaDeClientesDialog extends javax.swing.JPanel {

    private List<Clientes> clientesList;

    public PainelListaDeClientesDialog() {
        initComponents();
        refreshTable();
        mouseTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaDeClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        TabelaListaDeClientes.setAutoCreateRowSorter(true);
        TabelaListaDeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaListaDeClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaListaDeClientes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaListaDeClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        clientesList = new ClientesController().findClientes();
        if (clientesList != null) {
            TabelaListaDeClientes.setModel(new ClientesTabela(clientesList));
            TabelaListaDeClientes.setDefaultRenderer(Object.class, new ClientesTabelaRenderer());

        }
    }

    private void passarParaComboBox() {
        int selectedRow = TabelaListaDeClientes.getSelectedRow();
        if (selectedRow != -1) {
            Object value = TabelaListaDeClientes.getValueAt(selectedRow, 1);
            comboBoxClientes.setSelectedItem(value);
            PainelOrcamento.dialogClientes.dispose();
        }
    }

    private void mouseTable() {
        TabelaListaDeClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    passarParaComboBox();
                }
            }
        });
    }

}
