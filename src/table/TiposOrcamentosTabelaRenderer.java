package table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TiposOrcamentosTabelaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jTableTiposOrcamentos, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(jTableTiposOrcamentos, value, isSelected, hasFocus, row, column);

        jTableTiposOrcamentos.getColumnModel().getColumn(0).setMaxWidth(60);
        jTableTiposOrcamentos.getColumnModel().getColumn(0).setMinWidth(50);

        jTableTiposOrcamentos.getColumnModel().getColumn(1).setMaxWidth(290);
        jTableTiposOrcamentos.getColumnModel().getColumn(1).setMinWidth(200);

        jTableTiposOrcamentos.getColumnModel().getColumn(2).setMaxWidth(400);
        jTableTiposOrcamentos.getColumnModel().getColumn(2).setMinWidth(200);

        jTableTiposOrcamentos.getColumnModel().getColumn(3).setMaxWidth(350);
        jTableTiposOrcamentos.getColumnModel().getColumn(3).setMinWidth(200);

        jTableTiposOrcamentos.getColumnModel().getColumn(4).setMaxWidth(320);
        jTableTiposOrcamentos.getColumnModel().getColumn(4).setMinWidth(200);

        jTableTiposOrcamentos.getColumnModel().getColumn(5).setMaxWidth(320);
        jTableTiposOrcamentos.getColumnModel().getColumn(5).setMinWidth(200);

        jTableTiposOrcamentos.getColumnModel().getColumn(6).setMaxWidth(320);
        jTableTiposOrcamentos.getColumnModel().getColumn(6).setMinWidth(200);

        return this;

    }

}
