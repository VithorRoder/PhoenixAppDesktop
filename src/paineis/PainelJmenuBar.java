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

        jLabel1 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        botaoLogoff = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuário");
        add(jLabel1);

        labelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(labelUsuario);

        botaoLogoff.setText("0");
        botaoLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoffActionPerformed(evt);
            }
        });
        add(botaoLogoff);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoffActionPerformed
        if (Controladorjmenubar.usuarioAutenticado != false) {
            loggof();
        } else {
            JOptionPane.showMessageDialog(null, "Você ainda Não Fez Login !", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoLogoffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoLogoff;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables

    private void loggof() {
        controller.fazerLogout();
    }

    public final void setController(LoginController controller) {
        this.controller = controller;
    }

}
