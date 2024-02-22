package Teste;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class CustomCellEditorFont extends DefaultCellEditor {

    public CustomCellEditorFont(Font font, Color fontColor) {
        super(new JTextField());
        JTextField textField = (JTextField) getComponent();
        textField.setFont(font);
        textField.setForeground(fontColor);
        textField.setBackground(new Color(255, 218, 185));
        textField.setBorder(BorderFactory.createLoweredBevelBorder());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Component editorComponent = super.getTableCellEditorComponent(table, value, isSelected, row, column);
        return editorComponent;
    }

    private static class CustomLineBorder extends AbstractBorder {

        private Color color;
        private float thickness;

        public CustomLineBorder(Color color, float thickness) {
            this.color = color;
            this.thickness = thickness;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(thickness));
            g2d.drawRect(x, y, width - 1, height - 1);
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets((int) thickness, (int) thickness, (int) thickness, (int) thickness);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = (int) thickness;
            insets.top = (int) thickness;
            insets.right = (int) thickness;
            insets.bottom = (int) thickness;
            return insets;
        }
    }
}
