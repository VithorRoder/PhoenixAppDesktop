package util;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import paineis.PainelListaDeMaquinas;
import paineisAbas.PainelTabelaCriarOrcDef;

public class CustomCellEditorMaquinas extends DefaultCellEditor implements TableCellEditor {

    private final PainelListaDeMaquinas customPainel;
    private final PainelTabelaCriarOrcDef painelTabelaCriarOrcDef;

    public CustomCellEditorMaquinas(javax.swing.event.TableModelListener tableModelListener, PainelTabelaCriarOrcDef painelTabelaCriarOrcDef) {
        super(new JTextField());

        customPainel = new PainelListaDeMaquinas();
        this.painelTabelaCriarOrcDef = painelTabelaCriarOrcDef;
        JDialog dialog = new JDialog();
        painelTabelaCriarOrcDef.mouseTableMaquinas(dialog);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

        JDialog dialog = new JDialog();
        dialog.setTitle("Máquinas e Impressoras");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(customPainel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        painelTabelaCriarOrcDef.mouseTableMaquinas(dialog);
        dialog.setVisible(true);

        return null;
    }

}
