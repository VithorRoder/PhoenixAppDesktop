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
import javax.swing.table.TableCellRenderer;
import paineis.PainelListaDeMaquinas;

public class ComboBoxCellEditorDetalhes extends AbstractCellEditor implements TableCellEditor {

    public static JPanel panel2;
    public static JTextField textField;
    private final JButton button;
    private String currentText;
    public static JDialog dialogSimpleBro = new JDialog();
    PainelListaDeMaquinas painel = new PainelListaDeMaquinas();

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
                dialogSimpleBro.setTitle("Lista de Máquinas");
                dialogSimpleBro.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialogSimpleBro.getContentPane().add(painel);
                dialogSimpleBro.pack();
                dialogSimpleBro.setLocationRelativeTo(null);
                dialogSimpleBro.setModal(true);
                dialogSimpleBro.setVisible(true);
                painel.mouseTableMaquinas(dialogSimpleBro);
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

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }
}
