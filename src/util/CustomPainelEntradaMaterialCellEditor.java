package util;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

public class CustomPainelEntradaMaterialCellEditor extends DefaultCellEditor implements TableCellEditor {

    private final paineis.PainelListaEstoque customPanel;

    public CustomPainelEntradaMaterialCellEditor(javax.swing.event.TableModelListener tableModelListener) {
        super(new JTextField());

        customPanel = new paineis.PainelListaEstoque();
        JDialog dialog = new JDialog();
        customPanel.configurarDoubleClick(dialog);

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

        JDialog dialog = new JDialog();
        dialog.setTitle("Lista de Estoque");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(customPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        customPanel.configurarDoubleClick(dialog);
        dialog.setVisible(true);

        return null;
    }
}
