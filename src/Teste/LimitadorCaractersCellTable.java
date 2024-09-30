package Teste;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;
import javax.swing.table.TableCellEditor;

public class LimitadorCaractersCellTable extends AbstractCellEditor implements TableCellEditor {

    private final JTextField textField;
    private String currentText;

    public LimitadorCaractersCellTable() {
        textField = new JTextField();
        textField.setBorder(BorderFactory.createLoweredBevelBorder());
        textField.setBackground(new Color(255, 218, 185));
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

        ((PlainDocument) textField.getDocument()).setDocumentFilter(new UppercaseDocumentFilter(false));
        currentText = (value == null) ? "" : value.toString();
        if (isSelected == true) {
            textField.setText(currentText);
            return textField;
        }

        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return textField.getText();
    }

    class UppercaseDocumentFilter extends DocumentFilter {

        private final boolean uppercaseOnlyRow0;
        private final int limite = 3;

        public UppercaseDocumentFilter(boolean uppercaseOnlyRow0) {
            this.uppercaseOnlyRow0 = uppercaseOnlyRow0;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if (isWithinLimit(fb, text)) {
                if (uppercaseOnlyRow0) {
                    text = text.toUpperCase();
                }
                super.insertString(fb, offset, text, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (isWithinLimit(fb, text)) {
                if (uppercaseOnlyRow0) {
                    text = text.toUpperCase();
                }
                super.replace(fb, offset, length, text, attrs);
            }
        }

        // Método para verificar se o texto inserido está dentro do limite de 3 caracteres
        private boolean isWithinLimit(FilterBypass fb, String text) throws BadLocationException {
            return (fb.getDocument().getLength() + text.length()) <= limite;
        }
    }
}
