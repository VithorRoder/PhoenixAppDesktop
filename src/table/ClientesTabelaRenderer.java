package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ClientesTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jTableClientes, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(jTableClientes, value, isSelected, hasFocus, row, column);

        jTableClientes.getColumnModel().getColumn(0).setMaxWidth(60);
        jTableClientes.getColumnModel().getColumn(0).setMinWidth(50);

        jTableClientes.getColumnModel().getColumn(1).setMaxWidth(290);
        jTableClientes.getColumnModel().getColumn(1).setMinWidth(200);

        jTableClientes.getColumnModel().getColumn(2).setMaxWidth(400);
        jTableClientes.getColumnModel().getColumn(2).setMinWidth(200);

        jTableClientes.getColumnModel().getColumn(3).setMaxWidth(350);
        jTableClientes.getColumnModel().getColumn(3).setMinWidth(200);

        jTableClientes.getColumnModel().getColumn(4).setMaxWidth(320);
        jTableClientes.getColumnModel().getColumn(4).setMinWidth(200);

        return this;
    }

}
