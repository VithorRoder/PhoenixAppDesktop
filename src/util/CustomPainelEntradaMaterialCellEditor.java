package util;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import paineis.PainelEntradaDeMaterial;

public class CustomPainelEntradaMaterialCellEditor extends DefaultCellEditor implements TableCellEditor {

    private final paineis.PainelListaEstoqueDialog customPanel;
    private final paineis.PainelEntradaDeMaterial entradaMat;

    public CustomPainelEntradaMaterialCellEditor(javax.swing.event.TableModelListener tableModelListener, PainelEntradaDeMaterial entradaMat) {
        super(new JTextField());

        customPanel = new paineis.PainelListaEstoqueDialog();
        this.entradaMat = entradaMat;
        JDialog dialog = new JDialog();
        entradaMat.passarEstoqueToEntMat(dialog);

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
        entradaMat.passarEstoqueToEntMat(dialog);
        dialog.setVisible(true);

        return null;
    }
}
