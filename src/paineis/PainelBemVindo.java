package paineis;

import controller.Controladorjmenubar;
import controller.LoginController;
import java.awt.Container;
import javax.swing.JLabel;

public class PainelBemVindo extends javax.swing.JPanel {

    public LoginController controller;

    public PainelBemVindo() {
        initComponents();

        setController(controller);

        LabelUsuario.setText(Controladorjmenubar.nomeUsuarioAutenticado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonRedondoPainelBemVindoOrc = new util.JButtonRedondoPainelBemVindo();
        jButtonRedondoPainelBemVindoForn = new util.JButtonRedondoPainelBemVindo();
        jButtonRedondoPainelBemVindoCliente = new util.JButtonRedondoPainelBemVindo();
        jButtonRedondoPainelBemVindoEstoque = new util.JButtonRedondoPainelBemVindo();
        LabelUsuario = new javax.swing.JLabel();
        LabelBemVindo = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setBackground(new java.awt.Color(122, 134, 146));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(122, 134, 146));

        jButtonRedondoPainelBemVindoOrc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRedondoPainelBemVindoOrc.setText("Criar Orçamento");
        jButtonRedondoPainelBemVindoOrc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButtonRedondoPainelBemVindoOrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoPainelBemVindoOrcActionPerformed(evt);
            }
        });

        jButtonRedondoPainelBemVindoForn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRedondoPainelBemVindoForn.setText("Cadastrar Fornecedor");
        jButtonRedondoPainelBemVindoForn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButtonRedondoPainelBemVindoForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoPainelBemVindoFornActionPerformed(evt);
            }
        });

        jButtonRedondoPainelBemVindoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRedondoPainelBemVindoCliente.setText("Cadastrar Cliente");
        jButtonRedondoPainelBemVindoCliente.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButtonRedondoPainelBemVindoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoPainelBemVindoClienteActionPerformed(evt);
            }
        });

        jButtonRedondoPainelBemVindoEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRedondoPainelBemVindoEstoque.setText("Entrada de Material");
        jButtonRedondoPainelBemVindoEstoque.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButtonRedondoPainelBemVindoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoPainelBemVindoEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRedondoPainelBemVindoOrc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRedondoPainelBemVindoForn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRedondoPainelBemVindoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRedondoPainelBemVindoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonRedondoPainelBemVindoOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonRedondoPainelBemVindoForn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonRedondoPainelBemVindoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonRedondoPainelBemVindoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 33)); // NOI18N
        LabelUsuario.setForeground(java.awt.Color.white);
        LabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUsuario.setText("\"Nome do Usuário\"");
        LabelUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelBemVindo.setFont(new java.awt.Font("Bahnschrift", 1, 45)); // NOI18N
        LabelBemVindo.setForeground(java.awt.Color.white);
        LabelBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBemVindo.setText("Bem Vindo !");
        LabelBemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonSair.setBackground(new java.awt.Color(180, 180, 180));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSair.setText("Sair");
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelPrincipalLogin());
        container.revalidate();
        container.repaint();
        logoff();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonRedondoPainelBemVindoOrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoPainelBemVindoOrcActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelCriarOrcamento());
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonRedondoPainelBemVindoOrcActionPerformed

    private void jButtonRedondoPainelBemVindoFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoPainelBemVindoFornActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelCriarCadastroFornecedores());
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonRedondoPainelBemVindoFornActionPerformed

    private void jButtonRedondoPainelBemVindoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoPainelBemVindoClienteActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelCriarCadastroClientes());
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonRedondoPainelBemVindoClienteActionPerformed

    private void jButtonRedondoPainelBemVindoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoPainelBemVindoEstoqueActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelEntradaDeMaterial());
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonRedondoPainelBemVindoEstoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBemVindo;
    private javax.swing.JLabel LabelUsuario;
    private util.JButtonRedondoPainelBemVindo jButtonRedondoPainelBemVindoCliente;
    private util.JButtonRedondoPainelBemVindo jButtonRedondoPainelBemVindoEstoque;
    private util.JButtonRedondoPainelBemVindo jButtonRedondoPainelBemVindoForn;
    private util.JButtonRedondoPainelBemVindo jButtonRedondoPainelBemVindoOrc;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public JLabel getLabelUsuario() {
        return LabelUsuario;
    }

    public void setLabelUsuario(JLabel LabelUsuario) {
        this.LabelUsuario = LabelUsuario;
    }

    private void logoff() {
        controller.fazerLogout();
    }

    public final void setController(LoginController controller) {
        this.controller = controller;
    }

}
