package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MaquinasImpressorasTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jTableMaquinasImpressoras, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(jTableMaquinasImpressoras, value, isSelected, hasFocus, row, column);

        jTableMaquinasImpressoras.getColumnModel().getColumn(0).setMaxWidth(60);
        jTableMaquinasImpressoras.getColumnModel().getColumn(0).setMinWidth(50);

        jTableMaquinasImpressoras.getColumnModel().getColumn(1).setMaxWidth(290);
        jTableMaquinasImpressoras.getColumnModel().getColumn(1).setMinWidth(200);

        jTableMaquinasImpressoras.getColumnModel().getColumn(2).setMaxWidth(600);
        jTableMaquinasImpressoras.getColumnModel().getColumn(2).setMinWidth(300);

        jTableMaquinasImpressoras.getColumnModel().getColumn(3).setMaxWidth(350);
        jTableMaquinasImpressoras.getColumnModel().getColumn(3).setMinWidth(200);

        jTableMaquinasImpressoras.getColumnModel().getColumn(4).setMaxWidth(100);
        jTableMaquinasImpressoras.getColumnModel().getColumn(4).setMinWidth(100);

        jTableMaquinasImpressoras.getColumnModel().getColumn(5).setMaxWidth(300);
        jTableMaquinasImpressoras.getColumnModel().getColumn(5).setMinWidth(250);

        jTableMaquinasImpressoras.getColumnModel().getColumn(6).setMaxWidth(190);
        jTableMaquinasImpressoras.getColumnModel().getColumn(6).setMinWidth(150);

        jTableMaquinasImpressoras.getColumnModel().getColumn(7).setMaxWidth(320);
        jTableMaquinasImpressoras.getColumnModel().getColumn(7).setMinWidth(250);

        return this;

    }

}
