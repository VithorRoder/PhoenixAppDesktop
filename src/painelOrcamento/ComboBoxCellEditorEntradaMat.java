package painelOrcamento;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import paineis.PainelListaEstoqueDialog;

public class ComboBoxCellEditorEntradaMat extends AbstractCellEditor implements TableCellEditor {

    private JPanel panel2;
    private JTextField textField;
    private JButton button;
    private String currentText;
    private int row;
    private int column;

    public ComboBoxCellEditorEntradaMat() {
        textField = new JTextField();
        textField.setBorder(BorderFactory.createLoweredBevelBorder());
        textField.setBackground(new Color(0, 0, 180, 80));
        textField.setEditable(false);

        button = new JButton();
        button.setPreferredSize(new Dimension(27, 27));
        button.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 180, 80), 3, false));
        ImageIcon icon = new ImageIcon(getClass().getResource("/png/icons8-triangle-9px.png"));
        button.setIcon(icon);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialogOrc = new JDialog();
                PainelListaEstoqueDialog painelListaEstoqueDialog = new PainelListaEstoqueDialog(dialogOrc);
                painelListaEstoqueDialog.setCellEditor(ComboBoxCellEditorEntradaMat.this, row, column);

                dialogOrc.setTitle("Lista de Estoque");
                dialogOrc.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialogOrc.getContentPane().add(painelListaEstoqueDialog);
                dialogOrc.pack();
                dialogOrc.setLocationRelativeTo(null);
                dialogOrc.setModal(true);
                dialogOrc.setVisible(true);
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row;
        this.column = column;

        currentText = (value == null) ? "" : value.toString();
        if (isSelected == true) {
            textField.setText(currentText);
            panel2 = new JPanel();
            panel2.setLayout(new BorderLayout());
            panel2.setBorder(null);
            panel2.add(textField, BorderLayout.CENTER);
            panel2.add(button, BorderLayout.EAST);
            return panel2;

        }
        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return textField.getText();
    }

}
