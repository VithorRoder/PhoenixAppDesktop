package tabbedPaneRaven;

import painelOrcamento.PainelOrcamento;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonTabComponentOrcamento extends JPanel {

    private final JTabbedPane pane;
    private final PainelOrcamento painelOrcamento;

    public ButtonTabComponentOrcamento(final JTabbedPane pane, PainelOrcamento painelOrcamento) {
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        this.painelOrcamento = painelOrcamento;
        setOpaque(false);

        JLabel label = new JLabel() {
            @Override
            public String getText() {
                int i = pane.indexOfTabComponent(ButtonTabComponentOrcamento.this);
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
            if (pane.getTabCount() > 1) {
                int tome = JOptionPane.showConfirmDialog(null, "Deseja Remover a Aba Selecionada?", "Excluir Aba", JOptionPane.YES_NO_OPTION);
                if (tome == JOptionPane.YES_OPTION) {
                    int i = pane.indexOfTabComponent(ButtonTabComponentOrcamento.this);
                    if (i != -1) {
                        pane.remove(i);
                        painelOrcamento.updateTabTitles(); // Atualiza os títulos das abas
                    }
                }
            } else {
                String[] options = {"Sim", "Não"};
                int ficaQuieto = JOptionPane.showOptionDialog(
                        null,
                        "Não posso excluir o Item 01. DESEJA LIMPAR OS DADOS?",
                        "Aviso",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        options,
                        options[0]);

                if (ficaQuieto == 0) {
                    painelOrcamento.refreshClarPainelOrcamento();
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
