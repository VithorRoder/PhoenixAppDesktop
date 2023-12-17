package testeFrame;

import application.ProgramFrame;
import controller.Controladorjmenubar;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
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
import paineis.PainelListadeOrcamento;
import paineis.PainelOrdemDeServico;
import paineis.PainelSubstratosAcabamentos;
import paineis.PainelTipoDeOrcamento;
import tabbedPaneRaven.ButtonTabComponent;
import tabbedPaneRaven.TabbedPaneCustom;

/**
 *
 * @author VithorRoder
 */
public class ApplicationFrame extends javax.swing.JFrame {

    private static final int MAX_GLOBAL_PANEL_TABS = 1;
    private static final int MAX_GLOBAL_TABS = 8;
    public LoginController2 controller2;
    public ProgramFrame newjframe;
    private final PainelPrincipalLogin2 painelPrincipalLogin2;

    public ApplicationFrame() {
        initComponents();
        updateButtonTab();
        addSelectedTabComponent();

        this.painelPrincipalLogin2 = new PainelPrincipalLogin2(this);
        this.controller2 = new LoginController2(painelPrincipalLogin2, this);

        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/png/iconePhoenix.png"));
        setIconImage(icon);
        setTitle("Phoenix Gráfica");
        setExtendedState(ProgramFrame.MAXIMIZED_BOTH);

        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelPrincipalLogin2(this), "PainelPrincipal2");
        card.show(getContentPane(), "PainelPrincipal2");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneCustom1 = new tabbedPaneRaven.TabbedPaneCustom();
        jMenuBar1 = new javax.swing.JMenuBar();
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

        jMenuCadastroDeFornecedores.setBackground(new java.awt.Color(51, 51, 51));
        jMenuCadastroDeFornecedores.setBorder(null);
        jMenuCadastroDeFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        jMenuCadastroDeFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/agreement.png"))); // NOI18N
        jMenuCadastroDeFornecedores.setText("Fornecedores");
        jMenuCadastroDeFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuCadastroDeFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCadastroDeFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuCadastroDeFornecedores.setMargin(new java.awt.Insets(0, 17, 0, 17));
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
        jMenuClientes.setMargin(new java.awt.Insets(0, 23, 0, 23));
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
        jMenuOrcamento.setMargin(new java.awt.Insets(0, 18, 0, 18));
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
        jMenuOrdemServico.setMargin(new java.awt.Insets(0, 15, 0, 15));
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
        jMenuMaquinasImpressoras.setMargin(new java.awt.Insets(0, 15, 0, 15));
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
        jMenuMateriaisInsumos.setMargin(new java.awt.Insets(0, 15, 0, 15));
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
        jMenuSubstratosAcabamentos.setMargin(new java.awt.Insets(0, 15, 0, 15));
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
        jMenuEstoque.setMargin(new java.awt.Insets(0, 19, 0, 19));
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
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCriarCadastroDeFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarCadastroDeFornecedoresMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelCriarFornecedores();
    }//GEN-LAST:event_jMenuCriarCadastroDeFornecedoresMouseClicked

    private void jMenuListaDeFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaDeFornecedoresMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelListaFornecedores();
    }//GEN-LAST:event_jMenuListaDeFornecedoresMouseClicked

    private void jMenuCadastroDeFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastroDeFornecedoresMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuCadastroDeFornecedoresMouseClicked

    private void jMenuCriarCadClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarCadClientesMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelCriarCadastroClientes();
    }//GEN-LAST:event_jMenuCriarCadClientesMouseClicked

    private void jMenuListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaClientesMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelListaDeClientes();
    }//GEN-LAST:event_jMenuListaClientesMouseClicked

    private void jMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClientesMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuClientesMouseClicked

    private void jMenuCriarOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelCriarOrcamento();
    }//GEN-LAST:event_jMenuCriarOrcamentoMouseClicked

    private void jMenuListaOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelListaDeOrcamento();
    }//GEN-LAST:event_jMenuListaOrcamentoMouseClicked

    private void jMenuTipoOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTipoOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelTipoDeOrcamento();
    }//GEN-LAST:event_jMenuTipoOrcamentoMouseClicked

    private void jMenuOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOrcamentoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jMenuOrcamentoMouseClicked

    private void jMenuOrdemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOrdemServicoMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelOrdemDeServico();
    }//GEN-LAST:event_jMenuOrdemServicoMouseClicked

    private void jMenuMaquinasImpressorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMaquinasImpressorasMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelMaquinasImpressoras();
    }//GEN-LAST:event_jMenuMaquinasImpressorasMouseClicked

    private void jMenuMateriaisInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMateriaisInsumosMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelMateriaisInsumos();
    }//GEN-LAST:event_jMenuMateriaisInsumosMouseClicked

    private void jMenuSubstratosAcabamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSubstratosAcabamentosMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelSubstratosAcabamentos();
    }//GEN-LAST:event_jMenuSubstratosAcabamentosMouseClicked

    private void jMenuEntradaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEntradaMaterialMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelEntradaDeMaterial();
    }//GEN-LAST:event_jMenuEntradaMaterialMouseClicked

    private void jMenuListaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaEstoqueMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelListaEstoque();
    }//GEN-LAST:event_jMenuListaEstoqueMouseClicked

    private void jMenuListaEntradaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListaEntradaMaterialMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

            return;
        }
        showPainelListaEntradaMaterial();
    }//GEN-LAST:event_jMenuListaEntradaMaterialMouseClicked

    private void jMenuEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEstoqueMouseClicked
        if (!Controladorjmenubar.usuarioAutenticado) {

            JOptionPane.showMessageDialog(null, "Você precisa fazer login antes de acessar esta opção", "Erro de autenticação", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jMenuEstoqueMouseClicked

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

        ApplicationFrame frame = new ApplicationFrame();
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
    public static javax.swing.JMenu jMenuSubstratosAcabamentos;
    public static javax.swing.JMenu jMenuTipoOrcamento;
    public static tabbedPaneRaven.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables

    public TabbedPaneCustom getTabbedPaneCustom1() {
        return tabbedPaneCustom1;
    }

    private void addSelectedTabComponent() {
        int selectedTabIndex = tabbedPaneCustom1.getSelectedIndex();
        if (selectedTabIndex != -1) {
            ButtonTabComponent selectedTabComponent = (ButtonTabComponent) tabbedPaneCustom1.getTabComponentAt(selectedTabIndex);
            if (selectedTabComponent == null) {
                ButtonTabComponent buttonTabComponent = new ButtonTabComponent(tabbedPaneCustom1);
                tabbedPaneCustom1.setTabComponentAt(selectedTabIndex, buttonTabComponent);
            }
        }
    }

    private void updateButtonTab() {
        tabbedPaneCustom1.addChangeListener(e -> {
            int selectedTabIndex = tabbedPaneCustom1.getSelectedIndex();

            // Remover o ButtonTabComponent da aba anteriormente selecionada, se houver
            for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
                if (i != selectedTabIndex) {
                    ButtonTabComponent tabComponent = (ButtonTabComponent) tabbedPaneCustom1.getTabComponentAt(i);
                    if (tabComponent != null) {
                        tabbedPaneCustom1.setTabComponentAt(i, null);
                    }
                }
            }

            // Adicionar o ButtonTabComponent à aba selecionada
            if (selectedTabIndex != -1) {
                ButtonTabComponent selectedTabComponent = (ButtonTabComponent) tabbedPaneCustom1.getTabComponentAt(selectedTabIndex);
                if (selectedTabComponent == null) {
                    ButtonTabComponent buttonTabComponent = new ButtonTabComponent(tabbedPaneCustom1);
                    tabbedPaneCustom1.setTabComponentAt(selectedTabIndex, buttonTabComponent);
                }
            }
        });
    }

    public static void showPainelCriarOrcamento() {

        int quantidadeAbasPainelCriarOrcamento = 0;

        // Conta a quantidade de abas do Painel Criar Orçamento abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelCriarOrcamento) {
                quantidadeAbasPainelCriarOrcamento++;
            }
        }

        // Verifica se o limite de abas do Painel Criar Orçamento foi atingido
        if (quantidadeAbasPainelCriarOrcamento < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelCriarOrcamento para cada aba
                PainelCriarOrcamento novoPainelOrc = new PainelCriarOrcamento();
                tabbedPaneCustom1.addTab("Orçamento", null, novoPainelOrc, "Orçamento");
                tabbedPaneCustom1.setSelectedComponent(novoPainelOrc);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Panel Orçamento atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelOrdemDeServico() {

        int quantidadeAbasPainelOrdemDeServico = 0;

        // Conta a quantidade de abas do Painel Orem de Serviço abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelOrdemDeServico) {
                quantidadeAbasPainelOrdemDeServico++;
            }
        }

        // Verifica se o limite de abas do Painel Ordem De Serviço foi atingido
        if (quantidadeAbasPainelOrdemDeServico < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelOrdemDeServico para cada aba
                PainelOrdemDeServico novoPainelOs = new PainelOrdemDeServico();
                tabbedPaneCustom1.addTab("Ordem de Serviço", null, novoPainelOs, "Ordem de Serviço");
                tabbedPaneCustom1.setSelectedComponent(novoPainelOs);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Ordem de Serviço atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelListaFornecedores() {

        int quantidadeAbasPainelListaDeFornecedores = 0;

        // Conta a quantidade de abas do Painel Lista de Fornecedores abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListaDeFornecedores) {
                quantidadeAbasPainelListaDeFornecedores++;
            }
        }

        // Verifica se o limite de abas do Painel Lista de Fornecedores foi atingido
        if (quantidadeAbasPainelListaDeFornecedores < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelListaDeFornececedores para cada aba
                PainelListaDeFornecedores novoPainelListaFornecedores = new PainelListaDeFornecedores();
                tabbedPaneCustom1.addTab("Fornecedores", null, novoPainelListaFornecedores, "Lista de Fornecedores");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListaFornecedores);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista de Fornecedores.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelCriarFornecedores() {

        int quantidadeAbasPainelCadastroDeFornecedores = 0;

        // Conta a quantidade de abas do Painel Cadastro de Fornecedores abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelCriarCadastroFornecedores) {
                quantidadeAbasPainelCadastroDeFornecedores++;
            }
        }

        // Verifica se o limite de abas do Painel Cadastro de Fornecedores foi atingido
        if (quantidadeAbasPainelCadastroDeFornecedores < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelCriarCadastroDeFornececedores para cada aba
                PainelCriarCadastroFornecedores novoPainelCadastroFornecedores = new PainelCriarCadastroFornecedores();
                tabbedPaneCustom1.addTab("Cadastro de Fornecedores", null, novoPainelCadastroFornecedores, "Cadastro de Fornecedores");
                tabbedPaneCustom1.setSelectedComponent(novoPainelCadastroFornecedores);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Cadastro de Fornecedores.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelTipoDeOrcamento() {

        int quantidadeAbasPainelTipoDeOrcamento = 0;

        // Conta a quantidade de abas do Painel Tipos de Orçamento abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelTipoDeOrcamento) {
                quantidadeAbasPainelTipoDeOrcamento++;
            }
        }

        // Verifica se o limite de abas do Painel Tipos de Orçamentos foi atingido
        if (quantidadeAbasPainelTipoDeOrcamento < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelTiposDeOrcamento para cada aba
                PainelTipoDeOrcamento novoPainelTipoDeOrcamento = new PainelTipoDeOrcamento();
                tabbedPaneCustom1.addTab("Tipos de Orçamento", null, novoPainelTipoDeOrcamento, "Tipos de Orçamentos");
                tabbedPaneCustom1.setSelectedComponent(novoPainelTipoDeOrcamento);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Tipos de Orçamento.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelCriarCadastroClientes() {

        int quantidadeAbasPainelCriarCadastroClientes = 0;

        // Conta a quantidade de abas do Painel Cadastro de Clientes abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelCriarCadastroClientes) {
                quantidadeAbasPainelCriarCadastroClientes++;
            }
        }

        // Verifica se o limite de abas do Painel Tipos de Orçamentos foi atingido
        if (quantidadeAbasPainelCriarCadastroClientes < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelCriarCadastroClientes para cada aba
                PainelCriarCadastroClientes novoPainelCriarCadastroClientes = new PainelCriarCadastroClientes();
                tabbedPaneCustom1.addTab("Cadastro de Cliente", null, novoPainelCriarCadastroClientes, "Cadastro de Clientes");
                tabbedPaneCustom1.setSelectedComponent(novoPainelCriarCadastroClientes);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Criar Cadastro de Clientes.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelListaDeClientes() {

        int quantidadeAbasPainelListaDeClientes = 0;

        // Conta a quantidade de abas do Painel Lista de Clientes abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListaDeClientes) {
                quantidadeAbasPainelListaDeClientes++;
            }
        }

        // Verifica se o limite de abas do Painel Tipos de Orçamentos foi atingido
        if (quantidadeAbasPainelListaDeClientes < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelTiposDeOrcamento para cada aba
                PainelListaDeClientes novoPainelListaDeClientes = new PainelListaDeClientes();
                tabbedPaneCustom1.addTab("Lista de Clientes", null, novoPainelListaDeClientes, "Lista de Clientes");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListaDeClientes);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista de Clientes.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelListaDeOrcamento() {

        int quantidadeAbasPainelListaDeOrcamento = 0;

        // Conta a quantidade de abas do Painel Lista de Orçamentos abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListadeOrcamento) {
                quantidadeAbasPainelListaDeOrcamento++;
            }
        }

        // Verifica se o limite de abas do Painel Lista de Orçamentos foi atingido
        if (quantidadeAbasPainelListaDeOrcamento < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelListaDeOrcamento para cada aba
                PainelListadeOrcamento novoPainelListadeOrcamento = new PainelListadeOrcamento();
                tabbedPaneCustom1.addTab("Lista de Orçamentos", null, novoPainelListadeOrcamento, "Lista de Orçamentos");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListadeOrcamento);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista de Orçamentos.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelMaquinasImpressoras() {

        int quantidadeAbasPainelMaquinasImpressoras = 0;

        // Conta a quantidade de abas do Painel Máquinas e Impressoras abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListaDeMaquinas) {
                quantidadeAbasPainelMaquinasImpressoras++;
            }
        }

        // Verifica se o limite de abas do Painel Lista Máquinas e Impressoras foi atingido
        if (quantidadeAbasPainelMaquinasImpressoras < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelListaDeMaquinas para cada aba
                PainelListaDeMaquinas novoPainelListaDeMaquinas = new PainelListaDeMaquinas();
                tabbedPaneCustom1.addTab("Máquinas e Impresssoras", null, novoPainelListaDeMaquinas, "Máquinas e Impresssoras");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListaDeMaquinas);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista de Máquinas.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelMateriaisInsumos() {

        int quantidadeAbasPainelMateriaisInsumos = 0;

        // Conta a quantidade de abas do Painel Materiais e Insumos abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListaDeMateriais) {
                quantidadeAbasPainelMateriaisInsumos++;
            }
        }

        // Verifica se o limite de abas do Painel Lista Materiais e Insumos foi atingido
        if (quantidadeAbasPainelMateriaisInsumos < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelListaDeMateriais para cada aba
                PainelListaDeMateriais novoPainelListaDeMateriais = new PainelListaDeMateriais();
                tabbedPaneCustom1.addTab("Materiais e Insumos", null, novoPainelListaDeMateriais, "Materiais e Insumos");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListaDeMateriais);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista de Materiais.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelSubstratosAcabamentos() {

        int quantidadeAbasPainelSubstratosAcabamentos = 0;

        // Conta a quantidade de abas do Painel Substratos e Acabamentos abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelSubstratosAcabamentos) {
                quantidadeAbasPainelSubstratosAcabamentos++;
            }
        }

        // Verifica se o limite de abas do Painel Substratos e Acabamentos foi atingido
        if (quantidadeAbasPainelSubstratosAcabamentos < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelSubstratosAcabamentos para cada aba
                PainelSubstratosAcabamentos novoPainelSubstratosAcabamentos = new PainelSubstratosAcabamentos();
                tabbedPaneCustom1.addTab("Substratos e Acabamentos", null, novoPainelSubstratosAcabamentos, "Substratos e Acabamentos");
                tabbedPaneCustom1.setSelectedComponent(novoPainelSubstratosAcabamentos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Substratos e Acabamentos.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelEntradaDeMaterial() {

        int quantidadeAbasPainelEntradaDeMaterial = 0;

        // Conta a quantidade de abas do Painel Entrada de Material abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelEntradaDeMaterial) {
                quantidadeAbasPainelEntradaDeMaterial++;
            }
        }

        // Verifica se o limite de abas do Painel Entrada de Material foi atingido
        if (quantidadeAbasPainelEntradaDeMaterial < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelSubstratosAcabamentos para cada aba
                PainelEntradaDeMaterial novoPainelEntradaDeMaterial = new PainelEntradaDeMaterial();
                tabbedPaneCustom1.addTab("Entrada de Material", null, novoPainelEntradaDeMaterial, "Entrada de Material");
                tabbedPaneCustom1.setSelectedComponent(novoPainelEntradaDeMaterial);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Entrada De Material.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelListaEstoque() {

        int quantidadeAbasPainelListaDeEstoque = 0;

        // Conta a quantidade de abas do Painel Lista de Estoque abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListaEstoque) {
                quantidadeAbasPainelListaDeEstoque++;
            }
        }

        // Verifica se o limite de abas do Painel Lista de Estoque foi atingido
        if (quantidadeAbasPainelListaDeEstoque < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelListaEstoque para cada aba
                PainelListaEstoque novoPainelListaDeEstoque = new PainelListaEstoque();
                tabbedPaneCustom1.addTab("Estoque", null, novoPainelListaDeEstoque, "Estoque");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListaDeEstoque);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista de Estoque.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void showPainelListaEntradaMaterial() {

        int quantidadeAbasPainelListaEntMaterial = 0;

        // Conta a quantidade de abas do Painel Entrada de Material abertas
        for (int i = 0; i < tabbedPaneCustom1.getTabCount(); i++) {
            if (tabbedPaneCustom1.getComponentAt(i) instanceof PainelListaEntradaDeMaterial) {
                quantidadeAbasPainelListaEntMaterial++;
            }
        }

        // Verifica se o limite de abas do Painel Lista Entrada de Material foi atingido
        if (quantidadeAbasPainelListaEntMaterial < MAX_GLOBAL_PANEL_TABS) {
            int totalAbas = tabbedPaneCustom1.getTabCount();

            // Verifica se o limite global de abas foi atingido
            if (totalAbas >= MAX_GLOBAL_TABS) {
                JOptionPane.showMessageDialog(null, "Limite máximo de abas atingido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Cria uma nova instância de PainelSubstratosAcabamentos para cada aba
                PainelListaEntradaDeMaterial novoPainelListaEntradaDeMaterial = new PainelListaEntradaDeMaterial();
                tabbedPaneCustom1.addTab("Lista Ent. Material", null, novoPainelListaEntradaDeMaterial, "Lista Ent. Material");
                tabbedPaneCustom1.setSelectedComponent(novoPainelListaEntradaDeMaterial);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Limite de abas do Painel Lista Ent. De Material.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

//            ApplicationFrame.tabbedPaneCustom1.remove(this);
//            ApplicationFrame.showPainelListaFornecedores();
}
