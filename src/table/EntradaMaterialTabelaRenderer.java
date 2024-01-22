package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class EntradaMaterialTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable tabelaEntradaMaterial, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(tabelaEntradaMaterial, value, isSelected, hasFocus, row, column);

        tabelaEntradaMaterial.getColumnModel().getColumn(0).setMaxWidth(60);
        tabelaEntradaMaterial.getColumnModel().getColumn(0).setMinWidth(50);

        tabelaEntradaMaterial.getColumnModel().getColumn(1).setMaxWidth(290);
        tabelaEntradaMaterial.getColumnModel().getColumn(1).setMinWidth(200);

        tabelaEntradaMaterial.getColumnModel().getColumn(2).setMaxWidth(400);
        tabelaEntradaMaterial.getColumnModel().getColumn(2).setMinWidth(200);

        tabelaEntradaMaterial.getColumnModel().getColumn(3).setMaxWidth(350);
        tabelaEntradaMaterial.getColumnModel().getColumn(3).setMinWidth(200);

        tabelaEntradaMaterial.getColumnModel().getColumn(4).setMaxWidth(320);
        tabelaEntradaMaterial.getColumnModel().getColumn(4).setMinWidth(200);

        tabelaEntradaMaterial.getColumnModel().getColumn(5).setMaxWidth(320);
        tabelaEntradaMaterial.getColumnModel().getColumn(5).setMinWidth(200);

        return this;
    }

}
