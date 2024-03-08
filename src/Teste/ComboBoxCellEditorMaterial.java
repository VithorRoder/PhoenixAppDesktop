package Teste;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableCellEditor;
import paineis.PainelListaDeMateriaisDialog;

public class ComboBoxCellEditorMaterial extends AbstractCellEditor implements TableCellEditor {

    private JPanel panel;
    private final JTextField textField;
    private final JButton button;
    private String currentText;

    public ComboBoxCellEditorMaterial() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(null);

        textField = new JTextField();
        ((PlainDocument) textField.getDocument()).setDocumentFilter(new UppercaseDocumentFilter());
        textField.setBorder(BorderFactory.createLoweredBevelBorder());
        textField.setBackground(new Color(255, 218, 185));
        panel.add(textField, BorderLayout.CENTER);

        button = new JButton();
        button.setPreferredSize(new Dimension(21, 19));
        button.setBackground(new Color(255, 218, 185));
        button.setBorder(BorderFactory.createLoweredBevelBorder());
        ImageIcon icon = new ImageIcon(getClass().getResource("/png/icons8-triangle-8pxMod.png"));
        button.setIcon(icon);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        panel.add(button, BorderLayout.EAST);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();
                PainelListaDeMateriaisDialog painel = new PainelListaDeMateriaisDialog();
                dialog.setTitle("Lista de Material");
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.getContentPane().add(painel);
                dialog.pack();
                dialog.setLocationRelativeTo(null);
                dialog.setModal(true);
                dialog.setVisible(true);
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        currentText = (value == null) ? "" : value.toString();
        if (isSelected == true) {
            textField.setText(currentText);
            return panel;
        }
        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return textField.getText();
    }

    class UppercaseDocumentFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            fb.insertString(offset, text.toUpperCase(), attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            fb.replace(offset, length, text.toUpperCase(), attrs);
        }
    }
}
