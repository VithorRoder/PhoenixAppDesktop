package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FornecedoresTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable tableFornecedores, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(tableFornecedores, value, isSelected, hasFocus, row, column);

        tableFornecedores.getColumnModel().getColumn(0).setMaxWidth(90);
        tableFornecedores.getColumnModel().getColumn(0).setMinWidth(80);

        tableFornecedores.getColumnModel().getColumn(1).setMaxWidth(650);
        tableFornecedores.getColumnModel().getColumn(1).setMinWidth(450);

        tableFornecedores.getColumnModel().getColumn(2).setMaxWidth(200);
        tableFornecedores.getColumnModel().getColumn(2).setMinWidth(200);

        tableFornecedores.getColumnModel().getColumn(3).setMaxWidth(350);
        tableFornecedores.getColumnModel().getColumn(3).setMinWidth(200);

        tableFornecedores.getColumnModel().getColumn(4).setMaxWidth(250);
        tableFornecedores.getColumnModel().getColumn(4).setMinWidth(250);

        tableFornecedores.getColumnModel().getColumn(5).setMaxWidth(350);
        tableFornecedores.getColumnModel().getColumn(5).setMinWidth(300);

        return this;

    }

}
