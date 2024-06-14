package tabbedPaneRaven;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonTabComponent extends JPanel {

    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane) {

        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);

        JLabel label = new JLabel() {
            @Override
            public String getText() {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1) {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };

        Font tabFont = new Font("Arial", Font.BOLD, 14);
        label.setFont(tabFont);

        add(label);

        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 13));
        JButton button = new TabButton();
        add(button);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    }

    private class TabButton extends JButton implements ActionListener {

        public TabButton() {
            int size = 20;
            ImageIcon icon = new ImageIcon(getClass().getResource("/png/removeTabbed.png"));
            setIcon(icon);
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Fechar Aba");
            setUI(new BasicButtonUI());
            setContentAreaFilled(false);
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int tome = JOptionPane.showConfirmDialog(null, "Deseja Remover a Aba Selecionada ?", "Excluir Aba", JOptionPane.YES_NO_OPTION);
            if (tome == JOptionPane.YES_OPTION) {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1) {
                    pane.remove(i);
                }
            }
        }

        @Override
        public void updateUI() {
        }

        private final static MouseListener buttonMouseListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Component component = e.getComponent();
                if (component instanceof AbstractButton) {
                    AbstractButton button = (AbstractButton) component;
                    button.setBorderPainted(true);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Component component = e.getComponent();
                if (component instanceof AbstractButton) {
                    AbstractButton button = (AbstractButton) component;
                    button.setBorderPainted(false);
                }
            }
        };

    }
}
