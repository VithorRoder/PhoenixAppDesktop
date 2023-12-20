package paineis;

import controller.Controladorjmenubar;
import controller.LoginController;
import javax.swing.JOptionPane;

public class PainelJmenuBar extends javax.swing.JPanel {

    public LoginController controller;

    public PainelJmenuBar(LoginController controller) {
        initComponents();
        this.controller = controller;
        setController(this.controller);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUs = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        botaoLogoff = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setOpaque(false);

        labelUs.setBackground(new java.awt.Color(0, 0, 0));
        labelUs.setFont(new java.awt.Font("Square721 BT", 0, 16)); // NOI18N
        labelUs.setForeground(new java.awt.Color(255, 255, 255));
        labelUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUs.setText("Usuário:");

        labelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        labelUsuario.setFont(new java.awt.Font("Square721 BT", 1, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoLogoff.setText("Logout");
        botaoLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(botaoLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelUs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botaoLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoffActionPerformed
        acaoBotaoLogout();
    }//GEN-LAST:event_botaoLogoffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoLogoff;
    public static javax.swing.JLabel labelUs;
    public static javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables

    private void loggof() {
        controller.fazerLogout();
    }

    public final void setController(LoginController controller) {
        this.controller = controller;
    }

    public void acaoBotaoLogout() {
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja Sair ?", "Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION && Controladorjmenubar.usuarioAutenticado != false) {
            loggof();
        }
    }

}
