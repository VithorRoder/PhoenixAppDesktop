package paineis;

import controller.LoginController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class PainelPrincipalLogin extends javax.swing.JPanel {

    public LoginController controller;

    public PainelPrincipalLogin() {
        initComponents();

        PainelBemVindo panelBemVindo = new PainelBemVindo();
        controller = new LoginController(this, panelBemVindo);

        jPanelCamponentes.setPreferredSize(new Dimension(getWidth(), getHeight()));

        jPanelCamponentes.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        jPanelCamponentes.setAlignmentY(JComponent.CENTER_ALIGNMENT);

        jLabelPhoenix.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        jLabelPhoenix.setAlignmentY(JComponent.CENTER_ALIGNMENT);

        jFormattedTextField1usuariologin.setOpaque(false);
        jFormattedTextField1usuariologin.setBackground(new Color(255, 255, 255, 100));

        jPasswordField1senhalogin.setOpaque(false);
        jPasswordField1senhalogin.setBackground(new Color(255, 255, 255, 100));

        clickEntrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCamponentes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1usuariologin = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1senhalogin = new javax.swing.JPasswordField();
        jButtonEntrarUsuario = new javax.swing.JButton();
        jButtonCadastroView = new javax.swing.JButton();
        jLabelPhoenix = new javax.swing.JLabel();

        setBackground(new java.awt.Color(122, 134, 146));
        setLayout(new javax.swing.OverlayLayout(this));

        jPanelCamponentes.setMaximumSize(new java.awt.Dimension(591, 591));
        jPanelCamponentes.setOpaque(false);
        jPanelCamponentes.setPreferredSize(new java.awt.Dimension(591, 591));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuário ");

        jFormattedTextField1usuariologin.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1usuariologin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 90, 90), 2, true));
        jFormattedTextField1usuariologin.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextField1usuariologin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1usuariologin.setCaretColor(new java.awt.Color(0, 0, 0));
        jFormattedTextField1usuariologin.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jFormattedTextField1usuariologin.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jFormattedTextField1usuariologin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha");

        jPasswordField1senhalogin.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1senhalogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPasswordField1senhalogin.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1senhalogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1senhalogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 90, 90), 2, true));
        jPasswordField1senhalogin.setCaretColor(new java.awt.Color(0, 0, 0));

        jButtonEntrarUsuario.setBackground(new java.awt.Color(180, 180, 180));
        jButtonEntrarUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jButtonEntrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEntrarUsuario.setText("Entrar");
        jButtonEntrarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 15, 0, 15));
        jButtonEntrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEntrarUsuario.setMargin(new java.awt.Insets(2, 14, 2, 144));
        jButtonEntrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarUsuarioActionPerformed(evt);
            }
        });

        jButtonCadastroView.setBackground(new java.awt.Color(180, 180, 180));
        jButtonCadastroView.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButtonCadastroView.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastroView.setText("Cadastrar");
        jButtonCadastroView.setBorder(null);
        jButtonCadastroView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCadastroView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCamponentesLayout = new javax.swing.GroupLayout(jPanelCamponentes);
        jPanelCamponentes.setLayout(jPanelCamponentesLayout);
        jPanelCamponentesLayout.setHorizontalGroup(
            jPanelCamponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamponentesLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanelCamponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextField1usuariologin)
                    .addComponent(jPasswordField1senhalogin)
                    .addComponent(jButtonEntrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastroView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(180, 180, 180))
        );
        jPanelCamponentesLayout.setVerticalGroup(
            jPanelCamponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamponentesLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1usuariologin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1senhalogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButtonEntrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButtonCadastroView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        add(jPanelCamponentes);

        jLabelPhoenix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N
        add(jLabelPhoenix);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarUsuarioActionPerformed
        autenticar();
    }//GEN-LAST:event_jButtonEntrarUsuarioActionPerformed

    private void jButtonCadastroViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroViewActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelCadastroDeUsuario(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonCadastroViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroView;
    private javax.swing.JButton jButtonEntrarUsuario;
    private javax.swing.JFormattedTextField jFormattedTextField1usuariologin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPhoenix;
    private javax.swing.JPanel jPanelCamponentes;
    private javax.swing.JPasswordField jPasswordField1senhalogin;
    // End of variables declaration//GEN-END:variables

    private void autenticar() {
        try {
            controller.autenticar();
        } catch (SQLException ex) {
            Logger.getLogger(PainelPrincipalLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clickEntrar() {
        jFormattedTextField1usuariologin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    autenticar();
                }
            }
        });

        jPasswordField1senhalogin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    autenticar();
                }
            }
        });
    }

    public JFormattedTextField getjFormattedTextField1usuariologin() {
        return jFormattedTextField1usuariologin;
    }

    public void setjFormattedTextField1usuariologin(JFormattedTextField jFormattedTextField1usuariologin) {
        this.jFormattedTextField1usuariologin = jFormattedTextField1usuariologin;
    }

    public JPasswordField getjPasswordField1senhalogin() {
        return jPasswordField1senhalogin;
    }

    public void setjPasswordField1senhalogin(JPasswordField jPasswordField1senhalogin) {
        this.jPasswordField1senhalogin = jPasswordField1senhalogin;
    }

}
