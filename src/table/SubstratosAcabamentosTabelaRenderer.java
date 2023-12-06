package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class SubstratosAcabamentosTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable tableSubstratosAcabamentos, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(tableSubstratosAcabamentos, value, isSelected, hasFocus, row, column);

        tableSubstratosAcabamentos.getColumnModel().getColumn(0).setMaxWidth(60);
        tableSubstratosAcabamentos.getColumnModel().getColumn(0).setMinWidth(50);

        tableSubstratosAcabamentos.getColumnModel().getColumn(1).setMaxWidth(590);
        tableSubstratosAcabamentos.getColumnModel().getColumn(1).setMinWidth(200);

        tableSubstratosAcabamentos.getColumnModel().getColumn(2).setMaxWidth(400);
        tableSubstratosAcabamentos.getColumnModel().getColumn(2).setMinWidth(200);

        tableSubstratosAcabamentos.getColumnModel().getColumn(3).setMaxWidth(350);
        tableSubstratosAcabamentos.getColumnModel().getColumn(3).setMinWidth(200);

        tableSubstratosAcabamentos.getColumnModel().getColumn(4).setMaxWidth(350);
        tableSubstratosAcabamentos.getColumnModel().getColumn(4).setMinWidth(200);

        return this;

    }

}
