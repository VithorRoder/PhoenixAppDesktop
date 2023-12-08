package tabbedPaneRaven;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

/**
 * Component to be used as tabComponent; Contains a JLabel to show the text and
 * a JButton to close the tab it belongs to
 */
public class ButtonTabComponent extends JPanel {

    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane) {
        //unset default FlowLayout' gaps
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);

        //make JLabel read titles from JTabbedPane
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

        // Defina a fonte para o texto da aba aqui
        Font tabFont = new Font("Arial", Font.BOLD, 14);
        label.setFont(tabFont);

        add(label);
        //add more space between the label and the button
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 13));
        //tab button
        JButton button = new TabButton();
        add(button);
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    }

    private class TabButton extends JButton implements ActionListener {

        public TabButton() {
            int size = 20;
            ImageIcon icon = new ImageIcon(getClass().getResource("/Pngs/remove.png"));
            setIcon(icon);
            setPreferredSize(new Dimension(size, size));
            setToolTipText("close this tab");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            //No need to be focusable
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Making nice rollover effect
            //we use the same listener for all buttons
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            //Close the proper tab by clicking the button
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

        //we don't want to update UI for this button
        @Override
        public void updateUI() {
        }

        //paint the cross
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            Graphics2D g2 = (Graphics2D) g.create();
//            //shift the image for pressed buttons
//            if (getModel().isPressed()) {
//                g2.translate(1, 1);
//            }
//            g2.setStroke(new BasicStroke(2));
//            g2.setColor(Color.BLACK);
//            if (getModel().isRollover()) {
//                g2.setColor(Color.MAGENTA);
//            }
//            int delta = 10;
//            g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
//            g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
//            g2.dispose();
//        }
//    }
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

////////////////////////////////////////////////  Teste para colocar botão de remover aba da tabbedpane  ////////////////
//    private void addTabRemoverButao() {
//        DadosClientesPainelTab painelDados = new DadosClientesPainelTab();
//        ProducaoClientesPainelTab painelProducao = new ProducaoClientesPainelTab();
//
//        jTabbedPane1.addTab("Dados Gerais", painelDados);
//        jTabbedPane1.addTab("Produção", painelProducao);
//
//        int indexAbaDadosGerais = jTabbedPane1.indexOfTab("Dados Gerais");
//        if (indexAbaDadosGerais != -1) {
//            ButtonTabComponent buttonTabComponent = new ButtonTabComponent(jTabbedPane1);
//            jTabbedPane1.setTabComponentAt(indexAbaDadosGerais, buttonTabComponent);
//        } else {
//            System.out.println("A aba 'Dados Gerais' não foi encontrada.");
//        }
//        int indexAbaProducao = jTabbedPane1.indexOfTab("Produção");
//        if (indexAbaProducao != -1) {
//            ButtonTabComponent buttonTabComponent = new ButtonTabComponent(jTabbedPane1);
//            jTabbedPane1.setTabComponentAt(indexAbaProducao, buttonTabComponent);
//        } else {
//            System.out.println("A aba 'Produção' não foi encontrada.");
//        }
//    }
