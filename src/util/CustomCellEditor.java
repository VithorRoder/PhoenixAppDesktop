package util;

import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;

public class CustomCellEditor extends DefaultCellEditor {

    public CustomCellEditor(int limite) {
        super(new JTextField());
        JTextField textField = (JTextField) getComponent();
        textField.setDocument(new ValidadorLimite(limite));
        setClickCountToStart(1);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Component component = super.getTableCellEditorComponent(table, value, isSelected, row, column);

        JTextField editorComponent = (JTextField) component;
        Color corDeFundo = new Color(0, 0, 180, 80);
        Border mesmaCorDeFundo = BorderFactory.createLineBorder(corDeFundo, 2);
        editorComponent.setBorder(mesmaCorDeFundo);
        editorComponent.setBackground(corDeFundo);

        return editorComponent;
    }
}
