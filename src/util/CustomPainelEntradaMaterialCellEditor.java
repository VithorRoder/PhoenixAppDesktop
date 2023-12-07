package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

public class CustomPainelEntradaMaterialCellEditor extends DefaultCellEditor implements TableCellEditor {

    // private static final int CLICK_COUNT_TO_START = 2;
    private final JButton button;
    private final paineis.PainelListaEstoque customPanel;

    public CustomPainelEntradaMaterialCellEditor(javax.swing.event.TableModelListener tableModelListener) {
        super(new JTextField());
        //setClickCountToStart(CLICK_COUNT_TO_START);

        button = new JButton();
        button.setBackground(Color.white);
        button.setFont(button.getFont().deriveFont(Font.PLAIN));
        button.setBorder(null);

        customPanel = new paineis.PainelListaEstoque();
        JDialog dialog = new JDialog();
        customPanel.configurarDoubleClick(dialog);

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

        button.setText("Estoque");

        JDialog dialog = new JDialog();
        dialog.setTitle("Lista de Estoque");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(customPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(button);
        dialog.setModal(true);
        customPanel.configurarDoubleClick(dialog);
        dialog.setVisible(true);

        return null;
    }
}
