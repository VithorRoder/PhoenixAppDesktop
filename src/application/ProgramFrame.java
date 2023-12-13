package application;

import paineis.PainelListadeOrcamento;
import paineis.PainelCriarCadastroClientes;
import paineis.PainelCriarCadastroFornecedores;
import paineis.PainelCriarOrcamento;
import paineis.PainelEntradaDeMaterial;
import paineis.PainelListaDeClientes;
import paineis.PainelListaDeFornecedores;
import paineis.PainelListaDeMaquinas;
import paineis.PainelListaDeMateriais;
import paineis.PainelListaEntradaDeMaterial;
import paineis.PainelListaEstoque;
import paineis.PainelOrdemDeServico;
import paineis.PainelPrincipalLogin;
import paineis.PainelSubstratosAcabamentos;
import paineis.PainelTipoDeOrcamento;
import paineis.PainelBemVindo;
import controller.Controladorjmenubar;
import controller.LoginController;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author VithorRoder
 */
public class ProgramFrame extends javax.swing.JFrame {

    public LoginController controller;
    public ProgramFrame newjframe;

    public ProgramFrame() {

        initComponents();

        this.controller = new LoginController(new PainelPrincipalLogin(), new PainelBemVindo());

        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/png/iconePhoenix.png"));
        setIconImage(icon);
        setTitle("Phoenix Gráfica");
        setExtendedState(ProgramFrame.MAXIMIZED_BOTH);

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelPrincipalLogin(), "PainelPrincipal");
        card.show(getContentPane(), "PainelPrincipal");
        getContentPane().revalidate();
        getContentPane().repaint();

        jMenuOrcamento.setEnabled(false);
        jMenuListaOrcamento.setEnabled(false);
        jMenuCriarOrcamento.setEnabled(false);
        jMenuOrdemServico.setEnabled(false);
        jMenuClientes.setEnabled(false);
        jMenuMateriaisInsumos.setEnabled(false);
        jMenuMaquinasImpressoras.setEnabled(false);
        jMenuTipoOrcamento.setEnabled(false);
        jMenuSubstratosAcabamentos.setEnabled(false);
        jMenuEstoque.setEnabled(false);
        jMenuEntradaMaterial.setEnabled(false);
        jMenuListaEstoque.setEnabled(false);
        jMenuListaEntradaMaterial.setEnabled(false);
        jMenuCadastroDeFornecedores.setEnabled(false);
        jMenuCriarCadastroDeFornecedores.setEnabled(false);
        jMenuListaDeFornecedores.setEnabled(false);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPaginaInicial = new javax.swing.JMenu();
        jMenuCadastroDeFornecedores = new javax.swing.JMenu();
        jMenuCriarCadastroDeFornecedores = new javax.swing.JMenu();
        jMenuListaDeFornecedores = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenu();
        jMenuCriarCadClientes = new javax.swing.JMenu();
        jMenuListaClientes = new javax.swing.JMenu();
        jMenuOrcamento = new javax.swing.JMenu();
        jMenuCriarOrcamento = new javax.swing.JMenu();
        jMenuListaOrcamento = new javax.swing.JMenu();
        jMenuTipoOrcamento = new javax.swing.JMenu();
        jMenuOrdemServico = new javax.swing.JMenu();
        jMenuMaquinasImpressoras = new javax.swing.JMenu();
        jMenuMateriaisInsumos = new javax.swing.JMenu();
        jMenuSubstratosAcabamentos = new javax.swing.JMenu();
        jMenuEstoque = new javax.swing.JMenu();
        jMenuEntradaMaterial = new javax.swing.JMenu();
        jMenuListaEstoque = new javax.swing.JMenu();
        jMenuListaEntradaMaterial = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(110, 110, 110));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setOpaque(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1173, 60));

        jMenuPaginaInicial.setBorder(null);
        jMenuPaginaInicial.setForeground(new java.awt.Color(255, 255, 255));
        jMenuPaginaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/IconePhoenix2,2mm.png"))); // NOI18N
        jMenuPaginaInicial.setText("Página Inicial");
        jMenuPaginaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuPaginaInicial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuPaginaInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuPaginaInicial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuPaginaInicial.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jMenuPaginaInicial.setPreferredSize(new java.awt.Dimension(110, 40));
        jMenuPaginaInicial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuPaginaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPaginaInicialMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuPaginaInicial);

        jMenuCadastroDeFornecedores.setBackground(new java.awt.Color(51, 51, 51));
        jMenuCadastroDeFornecedores.setBorder(null);
        jMenuCadastroDeFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        jMenuCadastroDeFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/agreement.png"))); // NOI18N
        jMenuCadastroDeFornecedores.setText("Fornecedores");
        jMenuCadastroDeFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuCadastroDeFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCadastroDeFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuCadastroDeFornecedores.setMargin(new java.awt.Insets(0, 15, 0, 15));
        jMenuCadastroDeFornecedores.setMinimumSize(new java.awt.Dimension(73, 60));
        jMenuCadastroDeFornecedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuCadastroDeFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCadastroDeFornecedoresMouseClicked(evt);
            }
        });

        jMenuCriarCadastroDeFornecedores.setForeground(new java.awt.Color(15, 15, 15));
        jMenuCriarCadastroDeFornecedores.setText("Criar Cadastro de Fornecedores");
        jMenuCriarCadastroDeFornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCriarCadastroDeFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCriarCadastroDeFornecedoresMouseClicked(evt);
            }
        });
        jMenuCadastroDeFornecedores.add(jMenuCriarCadastroDeFornecedores);

        jMenuListaDeFornecedores.setForeground(new java.awt.Color(15, 15, 15));
        jMenuListaDeFornecedores.setText("Lista de Fornecedores");
        jMenuListaDeFornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuListaDeFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListaDeFornecedoresMouseClicked(evt);
            }
        });
        jMenuCadastroDeFornecedores.add(jMenuListaDeFornecedores);

        jMenuBar1.add(jMenuCadastroDeFornecedores);

        jMenuClientes.setForeground(new java.awt.Color(255, 255, 255));
        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/people.png"))); // NOI18N
        jMenuClientes.setText("Clientes");
        jMenuClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuClientes.setMargin(new java.awt.Insets(0, 20, 0, 20));
        jMenuClientes.setMaximumSize(new java.awt.Dimension(100, 32767));
        jMenuClientes.setMinimumSize(new java.awt.Dimension(70, 58));
        jMenuClientes.setName(""); // NOI18N
        jMenuClientes.setPreferredSize(new java.awt.Dimension(100, 58));
        jMenuClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuClientesMouseClicked(evt);
            }
        });

        jMenuCriarCadClientes.setForeground(new java.awt.Color(15, 15, 15));
        jMenuCriarCadClientes.setText("Criar Cadastro de Cliente");
        jMenuCriarCadClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCriarCadClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCriarCadClientesMouseClicked(evt);
            }
        });
        jMenuClientes.add(jMenuCriarCadClientes);

        jMenuListaClientes.setForeground(new java.awt.Color(15, 15, 15));
        jMenuListaClientes.setText("Lista de Clientes");
        jMenuListaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListaClientesMouseClicked(evt);
            }
        });
        jMenuClientes.add(jMenuListaClientes);

        jMenuBar1.add(jMenuClientes);

        jMenuOrcamento.setForeground(new java.awt.Color(255, 255, 255));
        jMenuOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/budget.png"))); // NOI18N
        jMenuOrcamento.setText("Orçamentos");
        jMenuOrcamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuOrcamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOrcamento.setMargin(new java.awt.Insets(0, 15, 0, 15));
        jMenuOrcamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuOrcamentoMouseClicked(evt);
            }
        });

        jMenuCriarOrcamento.setForeground(new java.awt.Color(15, 15, 15));
        jMenuCriarOrcamento.setText("Criar Orçamento");
        jMenuCriarOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCriarOrcamento.setIconTextGap(7);
        jMenuCriarOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCriarOrcamentoMouseClicked(evt);
            }
        });
        jMenuOrcamento.add(jMenuCriarOrcamento);

        jMenuListaOrcamento.setForeground(new java.awt.Color(15, 15, 15));
        jMenuListaOrcamento.setText("Lista de Orçamentos");
        jMenuListaOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuListaOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListaOrcamentoMouseClicked(evt);
            }
        });
        jMenuOrcamento.add(jMenuListaOrcamento);

        jMenuTipoOrcamento.setForeground(new java.awt.Color(15, 15, 15));
        jMenuTipoOrcamento.setText("Tipo de Orçamentos");
        jMenuTipoOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuTipoOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuTipoOrcamentoMouseClicked(evt);
            }
        });
        jMenuOrcamento.add(jMenuTipoOrcamento);

        jMenuBar1.add(jMenuOrcamento);

        jMenuOrdemServico.setForeground(new java.awt.Color(255, 255, 255));
        jMenuOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/os_Redonda.png"))); // NOI18N
        jMenuOrdemServico.setText("Ordem de Serviço");
        jMenuOrdemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuOrdemServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuOrdemServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuOrdemServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOrdemServico.setMargin(new java.awt.Insets(0, 12, 0, 12));
        jMenuOrdemServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuOrdemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuOrdemServicoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuOrdemServico);

        jMenuMaquinasImpressoras.setForeground(new java.awt.Color(255, 255, 255));
        jMenuMaquinasImpressoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/printer-machine.png"))); // NOI18N
        jMenuMaquinasImpressoras.setText("Máquinas e Impressoras");
        jMenuMaquinasImpressoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuMaquinasImpressoras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuMaquinasImpressoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuMaquinasImpressoras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuMaquinasImpressoras.setMargin(new java.awt.Insets(0, 12, 0, 12));
        jMenuMaquinasImpressoras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuMaquinasImpressoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMaquinasImpressorasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuMaquinasImpressoras);

        jMenuMateriaisInsumos.setBackground(new java.awt.Color(204, 204, 204));
        jMenuMateriaisInsumos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuMateriaisInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/membrane.png"))); // NOI18N
        jMenuMateriaisInsumos.setText("Materiais e Insumos");
        jMenuMateriaisInsumos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuMateriaisInsumos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuMateriaisInsumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuMateriaisInsumos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuMateriaisInsumos.setMargin(new java.awt.Insets(0, 12, 0, 12));
        jMenuMateriaisInsumos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuMateriaisInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMateriaisInsumosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuMateriaisInsumos);

        jMenuSubstratosAcabamentos.setBackground(new java.awt.Color(204, 204, 204));
        jMenuSubstratosAcabamentos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSubstratosAcabamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/mechanic.png"))); // NOI18N
        jMenuSubstratosAcabamentos.setText("Substratos e Acabamentos");
        jMenuSubstratosAcabamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSubstratosAcabamentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuSubstratosAcabamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSubstratosAcabamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuSubstratosAcabamentos.setMargin(new java.awt.Insets(0, 12, 0, 12));
        jMenuSubstratosAcabamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuSubstratosAcabamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSubstratosAcabamentosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSubstratosAcabamentos);

        jMenuEstoque.setBackground(new java.awt.Color(51, 51, 51));
        jMenuEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jMenuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/productStock.png"))); // NOI18N
        jMenuEstoque.setText("Estoque");
        jMenuEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuEstoque.setMargin(new java.awt.Insets(0, 16, 0, 16));
        jMenuEstoque.setMaximumSize(new java.awt.Dimension(90, 32767));
        jMenuEstoque.setMinimumSize(new java.awt.Dimension(70, 58));
        jMenuEstoque.setPreferredSize(new java.awt.Dimension(90, 58));
        jMenuEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEstoqueMouseClicked(evt);
            }
        });

        jMenuEntradaMaterial.setForeground(new java.awt.Color(15, 15, 15));
        jMenuEntradaMaterial.setText("Entrada de Material");
        jMenuEntradaMaterial.setContentAreaFilled(false);
        jMenuEntradaMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuEntradaMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEntradaMaterialMouseClicked(evt);
            }
        });
        jMenuEstoque.add(jMenuEntradaMaterial);

        jMenuListaEstoque.setForeground(new java.awt.Color(15, 15, 15));
        jMenuListaEstoque.setText("Lista de Estoque");
        jMenuListaEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuListaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListaEstoqueMouseClicked(evt);
            }
        });
        jMenuEstoque.add(jMenuListaEstoque);

        jMenuListaEntradaMaterial.setForeground(new java.awt.Color(15, 15, 15));
        jMenuListaEntradaMaterial.setText("Lista Ent. Material");
        jMenuListaEntradaMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuListaEntradaMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListaEntradaMaterialMouseClicked(evt);
            }
        });
        jMenuEstoque.add(jMenuListaEntradaMaterial);

        jMenuBar1.add(jMenuEstoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPaginaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPaginaInicialMouseClicked
        mostrapainel();
    }//GEN-LAST:event_jMenuPaginaInicialMouseClicked

    private void jMenuCriarOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelCriarOrcamento(), "PainelCriarOrcamento(");
        card.show(getContentPane(), "PainelCriarOrcamento(");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuCriarOrcamentoMouseClicked

    private void jMenuListaOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListadeOrcamento(), "ListadeOrcamento");
        card.show(getContentPane(), "ListadeOrcamento");
        getContentPane().revalidate();
        getContentPane().repaint();

    }//GEN-LAST:event_jMenuListaOrcamentoMouseClicked

    private void jMenuOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuOrcamentoMouseClicked

    private void jMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClientesMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuClientesMouseClicked

    private void jMenuOrdemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOrdemServicoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelOrdemDeServico(), "PainelOrdemDeServico");
        card.show(getContentPane(), "PainelOrdemDeServico");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuOrdemServicoMouseClicked

    private void jMenuListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaClientesMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListaDeClientes(), "PainelListaDeClientes");
        card.show(getContentPane(), "PainelListaDeClientes");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuListaClientesMouseClicked

    private void jMenuCriarCadClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarCadClientesMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelCriarCadastroClientes(), "PainelCriarCadastroDeCliente");
        card.show(getContentPane(), "PainelCriarCadastroDeCliente");
        getContentPane().revalidate();
        getContentPane().repaint();


    }//GEN-LAST:event_jMenuCriarCadClientesMouseClicked

    private void jMenuMateriaisInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMateriaisInsumosMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListaDeMateriais(), "PainelListaDeMateriais");
        card.show(getContentPane(), "PainelListaDeMateriais");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuMateriaisInsumosMouseClicked

    private void jMenuMaquinasImpressorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMaquinasImpressorasMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListaDeMaquinas(), "PainelListaDeMaquinas");
        card.show(getContentPane(), "PainelListaDeMaquinas");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuMaquinasImpressorasMouseClicked

    private void jMenuTipoOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTipoOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelTipoDeOrcamento(), "PainelTipoDeOrcamento");
        card.show(getContentPane(), "PainelTipoDeOrcamento");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuTipoOrcamentoMouseClicked

    private void jMenuSubstratosAcabamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSubstratosAcabamentosMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelSubstratosAcabamentos(), "PainelSubstratoseAcabamentos");
        card.show(getContentPane(), "PainelSubstratoseAcabamentos");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuSubstratosAcabamentosMouseClicked

    private void jMenuEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEstoqueMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuEstoqueMouseClicked

    private void jMenuListaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaEstoqueMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListaEstoque(), "PainelListaEstoque");
        card.show(getContentPane(), "PainelListaEstoque");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuListaEstoqueMouseClicked

    private void jMenuListaEntradaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaEntradaMaterialMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListaEntradaDeMaterial(), "PainelListaEntradaDeMaterial");
        card.show(getContentPane(), "PainelListaEntradaDeMaterial");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuListaEntradaMaterialMouseClicked

    private void jMenuEntradaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEntradaMaterialMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelEntradaDeMaterial(), "PainelEntradaDeMaterial");
        card.show(getContentPane(), "PainelEntradaDeMaterial");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuEntradaMaterialMouseClicked

    private void jMenuCriarCadastroDeFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarCadastroDeFornecedoresMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelCriarCadastroFornecedores(), "PainelCriarCadastroFornecedores");
        card.show(getContentPane(), "PainelCriarCadastroFornecedores");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuCriarCadastroDeFornecedoresMouseClicked

    private void jMenuListaDeFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaDeFornecedoresMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelListaDeFornecedores(), "PainelListaDeFornecedores");
        card.show(getContentPane(), "PainelListaDeFornecedores");
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_jMenuListaDeFornecedoresMouseClicked

    private void jMenuCadastroDeFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastroDeFornecedoresMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuCadastroDeFornecedoresMouseClicked

    public static void main(String args[]) {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    UIManager.put("MenuBar[Enabled].backgroundPainter", new Color(0, 0, 0));

                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }

        ProgramFrame frame = new ProgramFrame();
        frame.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu jMenuCadastroDeFornecedores;
    public static javax.swing.JMenu jMenuClientes;
    public static javax.swing.JMenu jMenuCriarCadClientes;
    public static javax.swing.JMenu jMenuCriarCadastroDeFornecedores;
    public static javax.swing.JMenu jMenuCriarOrcamento;
    public static javax.swing.JMenu jMenuEntradaMaterial;
    public static javax.swing.JMenu jMenuEstoque;
    public static javax.swing.JMenu jMenuListaClientes;
    public static javax.swing.JMenu jMenuListaDeFornecedores;
    public static javax.swing.JMenu jMenuListaEntradaMaterial;
    public static javax.swing.JMenu jMenuListaEstoque;
    public static javax.swing.JMenu jMenuListaOrcamento;
    public static javax.swing.JMenu jMenuMaquinasImpressoras;
    public static javax.swing.JMenu jMenuMateriaisInsumos;
    public static javax.swing.JMenu jMenuOrcamento;
    public static javax.swing.JMenu jMenuOrdemServico;
    public static javax.swing.JMenu jMenuPaginaInicial;
    public static javax.swing.JMenu jMenuSubstratosAcabamentos;
    public static javax.swing.JMenu jMenuTipoOrcamento;
    // End of variables declaration//GEN-END:variables

    public void mostrapainel() {
        if (Controladorjmenubar.usuarioAutenticado == true) {
            getContentPane().removeAll();
            CardLayout card = new CardLayout();
            getContentPane().setLayout(card);
            PainelBemVindo panelBemVindo = new PainelBemVindo();
            panelBemVindo.setController(controller);
            getContentPane().add(panelBemVindo, "PanelBemVindo");
            card.show(getContentPane(), "PanelBemVindo");
            getContentPane().revalidate();
            getContentPane().repaint();
        } else {
            getContentPane().removeAll();
            CardLayout card = new CardLayout();
            getContentPane().setLayout(card);
            getContentPane().add(new PainelPrincipalLogin(), "PainelPrincipal");
            card.show(getContentPane(), "PainelPrincipal");
            getContentPane().revalidate();
            getContentPane().repaint();
        }
    }

}
