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

        botaoLogoff.setBackground(new java.awt.Color(173, 173, 173));
        botaoLogoff.setText("Logout");
        botaoLogoff.setBorder(null);
        botaoLogoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botaoLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
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
        String[] options = {" Sim ", " Não "};
        int confirm = JOptionPane.showOptionDialog(null,
                "Deseja sair do sistema ?",
                "Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (confirm == JOptionPane.YES_OPTION && Controladorjmenubar.usuarioAutenticado != false) {
            loggof();
        }
    }

}
