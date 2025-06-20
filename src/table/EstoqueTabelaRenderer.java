package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class EstoqueTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable tableEstoque, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(tableEstoque, value, isSelected, hasFocus, row, column);

        tableEstoque.getColumnModel().getColumn(0).setMaxWidth(60);
        tableEstoque.getColumnModel().getColumn(0).setMinWidth(50);

        tableEstoque.getColumnModel().getColumn(1).setMaxWidth(620);
        tableEstoque.getColumnModel().getColumn(1).setMinWidth(400);

        tableEstoque.getColumnModel().getColumn(2).setMaxWidth(200);
        tableEstoque.getColumnModel().getColumn(2).setMinWidth(150);

        tableEstoque.getColumnModel().getColumn(3).setMaxWidth(150);
        tableEstoque.getColumnModel().getColumn(3).setMinWidth(140);

        tableEstoque.getColumnModel().getColumn(4).setMaxWidth(150);
        tableEstoque.getColumnModel().getColumn(4).setMinWidth(130);

        tableEstoque.getColumnModel().getColumn(5).setMaxWidth(120);
        tableEstoque.getColumnModel().getColumn(5).setMinWidth(100);

        tableEstoque.getColumnModel().getColumn(6).setMaxWidth(190);
        tableEstoque.getColumnModel().getColumn(6).setMinWidth(150);

        tableEstoque.getColumnModel().getColumn(7).setMaxWidth(240);
        tableEstoque.getColumnModel().getColumn(7).setMinWidth(220);

        return this;
    }

}
