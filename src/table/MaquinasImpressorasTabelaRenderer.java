package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MaquinasImpressorasTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jTableMaquinasImpressoras, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(jTableMaquinasImpressoras, value, isSelected, hasFocus, row, column);

        jTableMaquinasImpressoras.getColumnModel().getColumn(0).setMaxWidth(70);
        jTableMaquinasImpressoras.getColumnModel().getColumn(0).setMinWidth(40);

        jTableMaquinasImpressoras.getColumnModel().getColumn(1).setMaxWidth(220);
        jTableMaquinasImpressoras.getColumnModel().getColumn(1).setMinWidth(150);

        jTableMaquinasImpressoras.getColumnModel().getColumn(2).setMaxWidth(600);
        jTableMaquinasImpressoras.getColumnModel().getColumn(2).setMinWidth(200);

        jTableMaquinasImpressoras.getColumnModel().getColumn(3).setMaxWidth(220);
        jTableMaquinasImpressoras.getColumnModel().getColumn(3).setMinWidth(100);

        jTableMaquinasImpressoras.getColumnModel().getColumn(4).setMaxWidth(150);
        jTableMaquinasImpressoras.getColumnModel().getColumn(4).setMinWidth(100);

        jTableMaquinasImpressoras.getColumnModel().getColumn(5).setMaxWidth(200);
        jTableMaquinasImpressoras.getColumnModel().getColumn(5).setMinWidth(100);

        jTableMaquinasImpressoras.getColumnModel().getColumn(6).setMaxWidth(150);
        jTableMaquinasImpressoras.getColumnModel().getColumn(6).setMinWidth(100);

        jTableMaquinasImpressoras.getColumnModel().getColumn(7).setMaxWidth(150);
        jTableMaquinasImpressoras.getColumnModel().getColumn(7).setMinWidth(100);

        jTableMaquinasImpressoras.getColumnModel().getColumn(8).setMaxWidth(150);
        jTableMaquinasImpressoras.getColumnModel().getColumn(8).setMinWidth(100);

        return this;

    }

}
