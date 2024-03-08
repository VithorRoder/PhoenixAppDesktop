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
import paineis.PainelListaDeMaquinas;

public class ComboBoxCellEditorDetalhes extends AbstractCellEditor implements TableCellEditor {

    private JPanel panel2;
    private final JTextField textField;
    private final JButton button;
    private String currentText;

    public ComboBoxCellEditorDetalhes() {

        textField = new JTextField();
        textField.setBorder(BorderFactory.createLoweredBevelBorder());
        textField.setBackground(new Color(255, 218, 185));

        button = new JButton();
        button.setPreferredSize(new Dimension(21, 19));
        button.setBackground(new Color(255, 218, 185));
        button.setBorder(BorderFactory.createLoweredBevelBorder());
        ImageIcon icon = new ImageIcon(getClass().getResource("/png/icons8-triangle-8pxMod.png"));
        button.setIcon(icon);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();
                PainelListaDeMaquinas painel = new PainelListaDeMaquinas();
                dialog.setTitle("Lista de Máquinas");
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
        if (row == 0 || row == 5) {
            ((PlainDocument) textField.getDocument()).setDocumentFilter(new UppercaseDocumentFilter(true));
        } else {
            ((PlainDocument) textField.getDocument()).setDocumentFilter(new UppercaseDocumentFilter(false));
        }
        if (row == 0 || row == 5 || row == 6) {
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
        } else {
            currentText = (value == null) ? "" : value.toString();
            if (isSelected == true) {
                textField.setText(currentText);
                return textField;
            }
        }
        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return textField.getText();
    }

    class UppercaseDocumentFilter extends DocumentFilter {

        private final boolean uppercaseOnlyRow0;

        public UppercaseDocumentFilter(boolean uppercaseOnlyRow0) {
            this.uppercaseOnlyRow0 = uppercaseOnlyRow0;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if (!uppercaseOnlyRow0) {
                super.insertString(fb, offset, text, attr);
            } else {
                fb.insertString(offset, text.toUpperCase(), attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (!uppercaseOnlyRow0) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                fb.replace(offset, length, text.toUpperCase(), attrs);
            }
        }
    }
}
