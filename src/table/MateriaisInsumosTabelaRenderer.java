package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MateriaisInsumosTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jTableMateriaisInsumos, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(jTableMateriaisInsumos, value, isSelected, hasFocus, row, column);

        jTableMateriaisInsumos.getColumnModel().getColumn(0).setMaxWidth(60);
        jTableMateriaisInsumos.getColumnModel().getColumn(0).setMinWidth(50);

        jTableMateriaisInsumos.getColumnModel().getColumn(1).setMaxWidth(590);
        jTableMateriaisInsumos.getColumnModel().getColumn(1).setMinWidth(200);

        jTableMateriaisInsumos.getColumnModel().getColumn(2).setMaxWidth(400);
        jTableMateriaisInsumos.getColumnModel().getColumn(2).setMinWidth(200);

        jTableMateriaisInsumos.getColumnModel().getColumn(3).setMaxWidth(350);
        jTableMateriaisInsumos.getColumnModel().getColumn(3).setMinWidth(200);

        jTableMateriaisInsumos.getColumnModel().getColumn(4).setMaxWidth(350);
        jTableMateriaisInsumos.getColumnModel().getColumn(4).setMinWidth(200);

        jTableMateriaisInsumos.getColumnModel().getColumn(5).setMaxWidth(350);
        jTableMateriaisInsumos.getColumnModel().getColumn(5).setMinWidth(200);
        
        return this;

    }

}
