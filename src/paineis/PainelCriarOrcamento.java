package paineis;

import static application.ApplicationFrame.tabbedPaneCustom1;
import paineisAbas.PainelTabelaCriarOrcDef;
import logicaRegrasOrcamento.CalculoOrcamento;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PainelCriarOrcamento extends javax.swing.JPanel {

    public static List<PainelTabelaCriarOrcDef> listaPaineis;
    private int proximoNumeroAba = 2;
    PainelTabelaCriarOrcDef teste = new PainelTabelaCriarOrcDef();

    public PainelCriarOrcamento() {
        initComponents();
        teste.preencherColunaZero();
        addRemovePainel();
        showDataHora();
        addKeyEventDispatcher();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloOrcc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDataOrc = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonSelectClient = new javax.swing.JButton();
        BotaoGerarPreco = new javax.swing.JButton();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabelNomeCliente = new javax.swing.JLabel();
        jButtonSalvarOrc = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jButtonAdicionarItem = new javax.swing.JButton();
        jButtonRemoverItem = new javax.swing.JButton();
        jTabbedPaneOrc = new javax.swing.JTabbedPane();
        jPanelTAB = new javax.swing.JPanel();
        jLabelPrecoTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelHoraOrc = new javax.swing.JLabel();
        jLabelPrecoDeVenda = new javax.swing.JLabel();
        jLabelTipoDoPreco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCodigoClien00 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabelTituloOrcc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelTituloOrcc.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloOrcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloOrcc.setText("Título do Orçamento");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data de Cadastro:");

        jLabelDataOrc.setFont(new java.awt.Font("Albertus MT", 0, 12)); // NOI18N
        jLabelDataOrc.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDataOrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDataOrc.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 255)));

        jButtonSelectClient.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSelectClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/icons8-pasta-do-usuário-20.png"))); // NOI18N
        jButtonSelectClient.setBorder(null);
        jButtonSelectClient.setPreferredSize(new java.awt.Dimension(30, 32));
        jButtonSelectClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectClientActionPerformed(evt);
            }
        });

        BotaoGerarPreco.setBackground(new java.awt.Color(204, 204, 204));
        BotaoGerarPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotaoGerarPreco.setForeground(new java.awt.Color(0, 0, 0));
        BotaoGerarPreco.setText("Gerar Preço (F1)");
        BotaoGerarPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        BotaoGerarPreco.setBorderPainted(false);
        BotaoGerarPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoGerarPrecoMouseClicked(evt);
            }
        });

        jLabelPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreco.setToolTipText("");
        jLabelPreco.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 4, new java.awt.Color(0, 0, 0)));
        jLabelPreco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextFieldNomeCliente.setFocusable(false);
        jTextFieldNomeCliente.setPreferredSize(new java.awt.Dimension(290, 30));

        jLabelNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeCliente.setText("Nome do Cliente");

        jButtonSalvarOrc.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSalvarOrc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSalvarOrc.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalvarOrc.setText("Salvar Orçamento");
        jButtonSalvarOrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarOrcActionPerformed(evt);
            }
        });

        jButtonLimparCampos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonLimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimparCampos.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLimparCampos.setText("Limpar Campos");
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        jButtonAdicionarItem.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdicionarItem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAdicionarItem.setText("Adicionar Item");
        jButtonAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarItemActionPerformed(evt);
            }
        });

        jButtonRemoverItem.setBackground(new java.awt.Color(204, 204, 204));
        jButtonRemoverItem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRemoverItem.setText("Remover Item");
        jButtonRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverItemActionPerformed(evt);
            }
        });

        jTabbedPaneOrc.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneOrcStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelTABLayout = new javax.swing.GroupLayout(jPanelTAB);
        jPanelTAB.setLayout(jPanelTABLayout);
        jPanelTABLayout.setHorizontalGroup(
            jPanelTABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1276, Short.MAX_VALUE)
        );
        jPanelTABLayout.setVerticalGroup(
            jPanelTABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jTabbedPaneOrc.addTab("Tab DEF", jPanelTAB);

        jLabelPrecoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrecoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecoTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preço Total:");

        jLabelHoraOrc.setFont(new java.awt.Font("Albertus MT", 0, 12)); // NOI18N
        jLabelHoraOrc.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHoraOrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHoraOrc.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 255)));

        jLabelPrecoDeVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrecoDeVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecoDeVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabelTipoDoPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTipoDoPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipoDoPreco.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo do Preço:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Preço de Venda:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Código:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCodigoClien00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigoClien00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneOrc)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotaoGerarPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(jButtonSalvarOrc)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecoDeVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCodigoClien00, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSelectClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTituloOrcc, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDataOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelHoraOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTipoDoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTituloOrcc)
                            .addComponent(jLabelNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jButtonSelectClient, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCodigoClien00, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHoraOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTipoDoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvarOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoGerarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        atualizarLimparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void BotaoGerarPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerarPrecoMouseClicked
        CalculoOrcamento.calculaTudoMaquinaImpressoras();
    }//GEN-LAST:event_BotaoGerarPrecoMouseClicked

    private void jButtonAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarItemActionPerformed
        adicionarAba();
    }//GEN-LAST:event_jButtonAdicionarItemActionPerformed

    private void jButtonRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverItemActionPerformed
        removerAbaSelecionada();
    }//GEN-LAST:event_jButtonRemoverItemActionPerformed

    private void jButtonSalvarOrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarOrcActionPerformed
        //MetodoDeSalvarOrc
    }//GEN-LAST:event_jButtonSalvarOrcActionPerformed

    private void jButtonSelectClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectClientActionPerformed
        ShowListClientes();
    }//GEN-LAST:event_jButtonSelectClientActionPerformed

    private void jTabbedPaneOrcStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneOrcStateChanged
        jLabelPreco.setText("");
        if (listaPaineis != null) {
            atualizarTranferenciaToOrc();
        }
    }//GEN-LAST:event_jTabbedPaneOrcStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BotaoGerarPreco;
    private static javax.swing.JButton jButtonAdicionarItem;
    private static javax.swing.JButton jButtonLimparCampos;
    private static javax.swing.JButton jButtonRemoverItem;
    private static javax.swing.JButton jButtonSalvarOrc;
    private static javax.swing.JButton jButtonSelectClient;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabelDataOrc;
    public static javax.swing.JLabel jLabelHoraOrc;
    private static javax.swing.JLabel jLabelNomeCliente;
    public static javax.swing.JLabel jLabelPreco;
    public javax.swing.JLabel jLabelPrecoDeVenda;
    public javax.swing.JLabel jLabelPrecoTotal;
    public javax.swing.JLabel jLabelTipoDoPreco;
    private static javax.swing.JLabel jLabelTituloOrcc;
    public javax.swing.JPanel jPanelTAB;
    public static javax.swing.JTabbedPane jTabbedPaneOrc;
    private static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextFieldNomeCliente;
    public static javax.swing.JLabel labelCodigoClien00;
    // End of variables declaration//GEN-END:variables

    public void adicionarAba() {
        PainelTabelaCriarOrcDef novoPainel = new PainelTabelaCriarOrcDef();
        listaPaineis.add(novoPainel);
        jTabbedPaneOrc.addTab("Tab " + proximoNumeroAba, novoPainel);
        jTabbedPaneOrc.setSelectedIndex(jTabbedPaneOrc.getTabCount() - 1);
        proximoNumeroAba++;

    }

    public void removerAbaSelecionada() {
        int confirm = JOptionPane.showConfirmDialog(this, "Deseja Remover o item Selecionado ?", "Excluir Item", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int abaSelecionada = jTabbedPaneOrc.getSelectedIndex();
            int numAbas = jTabbedPaneOrc.getTabCount();
            if (abaSelecionada > 0 && numAbas > 1) {
                jTabbedPaneOrc.remove(abaSelecionada);
                listaPaineis.remove(abaSelecionada);
            }
        }
    }

    public void atualizarLimparCampos() {
        int abaSelecionada = jTabbedPaneOrc.getSelectedIndex();
        if (abaSelecionada >= 0 && abaSelecionada < listaPaineis.size()) {
            PainelTabelaCriarOrcDef painelSelecionado = listaPaineis.get(abaSelecionada);
            painelSelecionado.limparCamposTabelaDEF();
            painelSelecionado.refreshComboBox();

        }
    }

    public void atualizarTranferenciaToOrc() {
        int abaSelecionada = jTabbedPaneOrc.getSelectedIndex();
        if (abaSelecionada >= 0 && abaSelecionada < listaPaineis.size()) {
            PainelTabelaCriarOrcDef painelSelecionado = listaPaineis.get(abaSelecionada);
            JDialog dialog = new JDialog();
            painelSelecionado.editorColunaMaterial(painelSelecionado);
            painelSelecionado.mouseTableMaterial(dialog);
            painelSelecionado.mouseTableMaquinas(dialog);
        }
    }

    public void setNomeCliente(String nomeCliente) {
        jTextFieldNomeCliente.setText(nomeCliente);
    }

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jLabelHoraOrc.setText(String.format("%1$tH:%1$tM %1$Tp", now));
        }
    }

    private void addKeyEventDispatcher() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                int selectedIndex = tabbedPaneCustom1.getSelectedIndex();

                if (selectedIndex != -1 && e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_F1) {
                    String selectedTabTitle = tabbedPaneCustom1.getTitleAt(selectedIndex);

                    if (selectedTabTitle.equals("Orçamento")) {
                        BotaoGerarPreco.requestFocusInWindow();
                        CalculoOrcamento.calculaTudoMaquinaImpressoras();
                        return true; // Impede que o evento seja enviado a outros componentes
                    }
                }
                return false; // Deixe outros eventos de teclado serem processados normalmente
            }
        });
    }

    public void ShowListClientes() {

        PainelListaDeClientes customPanelClientes = new paineis.PainelListaDeClientes();

        JDialog dialog = new JDialog();
        dialog.setTitle("Lista de Clientes");
        customPanelClientes.jButtonAlterarClientes.setVisible(false);
        customPanelClientes.jButtonAlterarClientes.setEnabled(false);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(customPanelClientes);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        PainelListaDeClientes.passarClienteParaOrc(dialog);
        dialog.setVisible(true);

        jTextFieldNomeCliente.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                dialog.dispose();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                dialog.dispose();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                dialog.dispose();
            }
        });
    }

    private void showDataHora() {
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jLabelDataOrc.setText(formato.format(dataSistema));

        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

    private void addRemovePainel() {
        listaPaineis = new ArrayList<>();

        teste.preencherColunaZero();

        listaPaineis.add(teste);

        jTabbedPaneOrc.addTab("Tab 1", teste);

        int index = jTabbedPaneOrc.indexOfTab("Tab DEF");
        if (index != -1) {
            jTabbedPaneOrc.remove(index);
        }
    }

}
