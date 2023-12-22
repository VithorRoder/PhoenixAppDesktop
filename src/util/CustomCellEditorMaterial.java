package util;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import paineis.PainelListaDeMateriaisDialog;
import paineisAbas.PainelTabelaCriarOrcDef;

public class CustomCellEditorMaterial extends DefaultCellEditor implements TableCellEditor {

    private final PainelListaDeMateriaisDialog customPainel;
    private final PainelTabelaCriarOrcDef painelTabelaCriarOrcDef;

    public CustomCellEditorMaterial(javax.swing.event.TableModelListener tableModelListener, PainelTabelaCriarOrcDef painelTabelaCriarOrcDef) {
        super(new JTextField());

        customPainel = new PainelListaDeMateriaisDialog();
        this.painelTabelaCriarOrcDef = painelTabelaCriarOrcDef;
        JDialog dialog = new JDialog();
        painelTabelaCriarOrcDef.mouseTableMaterial(dialog);

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

        JDialog dialog = new JDialog();
        dialog.setTitle("Material e Insumos");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(customPainel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        painelTabelaCriarOrcDef.mouseTableMaterial(dialog);
        dialog.setVisible(true);

        return null;
    }

}
