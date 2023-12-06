package util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class JButtonRedondoCriarForncecedores extends JButton {

    private final Color originalColor = new Color(160, 160, 160);

    public JButtonRedondoCriarForncecedores() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0, 0, 5));
        setBackground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Adicionar ouvinte de eventos de mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(getBackground().darker());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(originalColor);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {

        int widht = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (getModel().isPressed()) {
            g2.setColor(getBackground().darker());
        } else if (getModel().isRollover()) {
            g2.setColor(getBackground().brighter());
        } else {
            g2.setColor(getBackground());
        }
        g2.drawRoundRect(0, 0, widht - 1, height - 1, height, height);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, widht - 1, height - 1, height, height);
        g2.setColor(getForeground());
        super.paintComponent(g);
    }

}
