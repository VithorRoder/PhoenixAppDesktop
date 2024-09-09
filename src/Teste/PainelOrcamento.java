package Teste;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import paineis.PainelListaDeClientes;
import paineis.PainelTipoDeOrcamento;
import tabbedPaneRaven.ButtonTabComponentOrcamento;

public class PainelOrcamento extends javax.swing.JPanel {

    public static JDialog dialogClientes = new JDialog();
    public static JDialog dialogTipoOrcamento = new JDialog();
    public static List<PainelOrcamentoItem> listaPaineis = new ArrayList<>();
    private int proximoNumeroAba = 2;

    public PainelOrcamento() {
        initComponents();
        editorCelulaOrcamentoTabelaMedidas();
        jTabbedPaneOrcTotal.removeAll();
        PainelOrcamentoItem primeiroPainel = new PainelOrcamentoItem(this);
        listaPaineis.add(primeiroPainel);
        jTabbedPaneOrcTotal.addTab("01", primeiroPainel);
        tabelaOrcPrincipal.setCellSelectionEnabled(true);
        tabelaOrcPrincipal.getColumnModel().getColumn(6).setCellEditor(new ComboBoxCellEditorMaterial());
        editorCelulaOrcamentoTabelaCalculosExtras();
        editorCelulaOrcamentoTabelaAcabamentos();
        editorCelulaOrcamentoTabelaParametros();
        editorCelulaOrcamentoCalculos();
        numeracaoTabelaCalculos();
        atualizarLabelClientes();
        atualizarLabelTiposDeOrc();
        addCloseButtonOnJTabbedPane();
        updateButtonTab();
        if (jTextField4.getText() == null || jTextField4.getText().isEmpty()) {
            atualizarTimeInclusao();
        }
        clickPainelTabbed();
        updateButtonTab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabelClienteOrcamento = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comboBoxClientes = new javax.swing.JComboBox<>();
        jTabbedPaneOrcTotal = new javax.swing.JTabbedPane();
        painelItemOrcamento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaOrcPrincipal = new javax.swing.JTable();
        TextFieldQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelTipoOrcamento = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PainelAcabamentoMontagem = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAcabamentos = new javax.swing.JTable();
        painelMontagem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaParametros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCalculosExtras = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaCalculos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jTabbedPaneDetalhes = new javax.swing.JTabbedPane();
        painelDetalhes01 = new javax.swing.JPanel();
        painelDetalhesOrcamento1 = new Teste.PainelDetalhesOrcamento();
        jPanel7 = new javax.swing.JPanel();
        jButtonPrecoOrc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        painelVendaOrcamento1 = new Teste.PainelVendaOrcamento();
        jformatedTextFieldPrecoVenda = new util.JformatedTextFieldPreco();
        jformatedTextFieldPrecoUnitario = new util.JformatedTextFieldPreco();
        comboBoxTOPainelOrcamento = new javax.swing.JComboBox<>();
        jTextField23 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(176, 176, 176));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText(" Vendedor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 60, 30));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 210, 28));

        jLabelClienteOrcamento.setText(" Clientes ()");
        jPanel1.add(jLabelClienteOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 210, 28));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 28));

        jLabel8.setText(" Contato");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 30));

        jLabel9.setText(" Agência");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 60, 30));

        jTextField10.setMinimumSize(new java.awt.Dimension(77, 22));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 150, 28));

        jLabel10.setText(" Fone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 6, -1, 20));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 170, 28));

        jLabel11.setText(" Orçamento para");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 100, 30));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 150, 28));

        jLabel12.setText(" Celular/Watsapp");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 100, 30));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 330, 28));

        jLabel13.setText("Email");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 6, 70, -1));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(236, 236, 236));
        jTextField14.setForeground(new java.awt.Color(120, 120, 120));
        jTextField14.setText("14/03/2024-09:32");
        jTextField14.setFocusable(false);
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, 122, 28));

        jLabel14.setText(" Últ. Movimento");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 50, -1, 30));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(236, 236, 236));
        jTextField15.setForeground(new java.awt.Color(120, 120, 120));
        jTextField15.setText("14/03/2024-09:32");
        jTextField15.setFocusable(false);
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 70, 130, 28));

        jLabel15.setText(" Inclusão");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 50, 30));

        comboBoxClientes.setEditable(true);
        comboBoxClientes.setMaximumRowCount(0);
        comboBoxClientes.setBorder(null);
        comboBoxClientes.setKeySelectionManager(null);
        comboBoxClientes.setLightWeightPopupEnabled(false);
        comboBoxClientes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboBoxClientesPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel1.add(comboBoxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 30));

        jTabbedPaneOrcTotal.setBackground(new java.awt.Color(176, 176, 176));

        painelItemOrcamento.setBackground(new java.awt.Color(176, 176, 176));

        tabelaOrcPrincipal.setBackground(new java.awt.Color(245, 245, 245));
        tabelaOrcPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        tabelaOrcPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", null, null, null, null, null, null, null},
                {"02", null, null, null, null, null, null, null},
                {"03", null, null, null, null, null, null, null},
                {"04", null, null, null, null, null, null, null},
                {"05", null, null, null, null, null, null, null},
                {"06", null, null, null, null, null, null, null},
                {"07", null, null, null, null, null, null, null},
                {"08", null, null, null, null, null, null, null},
                {"09", null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Planos(=qtd)", "LxA(cm)", "Mont.", "Págs", "Cor", "Material", "Parâmetros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaOrcPrincipal.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaOrcPrincipal.setRowHeight(21);
        tabelaOrcPrincipal.setSelectionBackground(new java.awt.Color(0, 191, 255));
        tabelaOrcPrincipal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelaOrcPrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaOrcPrincipal.setShowGrid(true);
        tabelaOrcPrincipal.getTableHeader().setReorderingAllowed(false);
        tabelaOrcPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaOrcPrincipalFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaOrcPrincipal);
        if (tabelaOrcPrincipal.getColumnModel().getColumnCount() > 0) {
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setMinWidth(25);
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setMaxWidth(26);
            tabelaOrcPrincipal.getColumnModel().getColumn(3).setMinWidth(40);
            tabelaOrcPrincipal.getColumnModel().getColumn(3).setPreferredWidth(45);
            tabelaOrcPrincipal.getColumnModel().getColumn(3).setMaxWidth(60);
            tabelaOrcPrincipal.getColumnModel().getColumn(4).setMinWidth(40);
            tabelaOrcPrincipal.getColumnModel().getColumn(4).setPreferredWidth(45);
            tabelaOrcPrincipal.getColumnModel().getColumn(4).setMaxWidth(60);
            tabelaOrcPrincipal.getColumnModel().getColumn(5).setMinWidth(40);
            tabelaOrcPrincipal.getColumnModel().getColumn(5).setPreferredWidth(45);
            tabelaOrcPrincipal.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        TextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setText(" Quantidade");

        jLabelTipoOrcamento.setText(" Tipo de Orçamento ()");

        jLabel3.setText(" Título do serviço");

        tabelaAcabamentos.setBackground(new java.awt.Color(245, 245, 245));
        tabelaAcabamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", null, null},
                {"02", null, null},
                {"03", null, null},
                {"04", null, null},
                {"05", null, null},
                {"06", null, null},
                {"07", null, null},
                {"08", null, null},
                {"09", null, null},
                {"10", null, null},
                {"11", null, null},
                {"12", null, null},
                {"13", null, null},
                {"14", null, null},
                {"15", null, null},
                {"16", null, null},
                {"17", null, null},
                {"18", null, null},
                {"19", null, null},
                {"20", null, null}
            },
            new String [] {
                "", "AC=Acabamentos", "Plano(s)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAcabamentos.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaAcabamentos.setRowHeight(21);
        tabelaAcabamentos.setShowGrid(true);
        tabelaAcabamentos.getTableHeader().setReorderingAllowed(false);
        tabelaAcabamentos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaAcabamentosFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaAcabamentos);
        if (tabelaAcabamentos.getColumnModel().getColumnCount() > 0) {
            tabelaAcabamentos.getColumnModel().getColumn(0).setMinWidth(25);
            tabelaAcabamentos.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelaAcabamentos.getColumnModel().getColumn(0).setMaxWidth(30);
            tabelaAcabamentos.getColumnModel().getColumn(2).setMinWidth(60);
            tabelaAcabamentos.getColumnModel().getColumn(2).setPreferredWidth(60);
            tabelaAcabamentos.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        painelMontagem.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelMontagemLayout = new javax.swing.GroupLayout(painelMontagem);
        painelMontagem.setLayout(painelMontagemLayout);
        painelMontagemLayout.setHorizontalGroup(
            painelMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        painelMontagemLayout.setVerticalGroup(
            painelMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        tabelaParametros.setBackground(new java.awt.Color(245, 245, 245));
        tabelaParametros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Parâmetros", "Valor"
            }
        ));
        tabelaParametros.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaParametros.setRowHeight(21);
        tabelaParametros.setShowGrid(true);
        tabelaParametros.getTableHeader().setReorderingAllowed(false);
        tabelaParametros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaParametrosFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaParametros);

        tabelaCalculosExtras.setBackground(new java.awt.Color(245, 245, 245));
        tabelaCalculosExtras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cálculos Extras", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCalculosExtras.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaCalculosExtras.setRowHeight(21);
        tabelaCalculosExtras.setSelectionBackground(new java.awt.Color(255, 218, 185));
        tabelaCalculosExtras.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelaCalculosExtras.setShowGrid(true);
        tabelaCalculosExtras.getTableHeader().setReorderingAllowed(false);
        tabelaCalculosExtras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaCalculosExtrasFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaCalculosExtras);
        if (tabelaCalculosExtras.getColumnModel().getColumnCount() > 0) {
            tabelaCalculosExtras.getColumnModel().getColumn(1).setMinWidth(17);
            tabelaCalculosExtras.getColumnModel().getColumn(1).setPreferredWidth(17);
            tabelaCalculosExtras.getColumnModel().getColumn(1).setMaxWidth(17);
        }

        jPanel9.setBackground(new java.awt.Color(240, 240, 240));

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        jCheckBox3.setText("jCheckBox3");

        jCheckBox4.setText("jCheckBox4");

        jCheckBox5.setText("jCheckBox5");

        jCheckBox6.setText("jCheckBox6");

        jCheckBox7.setText("jCheckBox7");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelAcabamentoMontagemLayout = new javax.swing.GroupLayout(PainelAcabamentoMontagem);
        PainelAcabamentoMontagem.setLayout(PainelAcabamentoMontagemLayout);
        PainelAcabamentoMontagemLayout.setHorizontalGroup(
            PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                        .addComponent(painelMontagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelAcabamentoMontagemLayout.setVerticalGroup(
            PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelMontagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Acabamentos/Montagem", PainelAcabamentoMontagem);

        jPanel4.setBackground(new java.awt.Color(222, 229, 231));

        tabelaCalculos.setBackground(new java.awt.Color(245, 245, 245));
        tabelaCalculos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaCalculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Pl", "Processos calculados", "Quantidade", "Unid", "Pr. Unit.", "Custo", " *", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCalculos.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaCalculos.setRowHeight(18);
        tabelaCalculos.setShowGrid(true);
        tabelaCalculos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaCalculosFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaCalculos);
        if (tabelaCalculos.getColumnModel().getColumnCount() > 0) {
            tabelaCalculos.getColumnModel().getColumn(0).setMinWidth(25);
            tabelaCalculos.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelaCalculos.getColumnModel().getColumn(0).setMaxWidth(26);
            tabelaCalculos.getColumnModel().getColumn(1).setMinWidth(25);
            tabelaCalculos.getColumnModel().getColumn(1).setPreferredWidth(25);
            tabelaCalculos.getColumnModel().getColumn(1).setMaxWidth(25);
            tabelaCalculos.getColumnModel().getColumn(2).setMinWidth(150);
            tabelaCalculos.getColumnModel().getColumn(2).setPreferredWidth(180);
            tabelaCalculos.getColumnModel().getColumn(2).setMaxWidth(250);
            tabelaCalculos.getColumnModel().getColumn(3).setMinWidth(85);
            tabelaCalculos.getColumnModel().getColumn(3).setPreferredWidth(85);
            tabelaCalculos.getColumnModel().getColumn(3).setMaxWidth(85);
            tabelaCalculos.getColumnModel().getColumn(4).setMinWidth(65);
            tabelaCalculos.getColumnModel().getColumn(4).setPreferredWidth(65);
            tabelaCalculos.getColumnModel().getColumn(4).setMaxWidth(5);
            tabelaCalculos.getColumnModel().getColumn(5).setMinWidth(78);
            tabelaCalculos.getColumnModel().getColumn(5).setPreferredWidth(78);
            tabelaCalculos.getColumnModel().getColumn(5).setMaxWidth(78);
            tabelaCalculos.getColumnModel().getColumn(6).setMinWidth(92);
            tabelaCalculos.getColumnModel().getColumn(6).setPreferredWidth(92);
            tabelaCalculos.getColumnModel().getColumn(6).setMaxWidth(92);
            tabelaCalculos.getColumnModel().getColumn(7).setMinWidth(24);
            tabelaCalculos.getColumnModel().getColumn(7).setPreferredWidth(24);
            tabelaCalculos.getColumnModel().getColumn(7).setMaxWidth(24);
            tabelaCalculos.getColumnModel().getColumn(8).setMinWidth(40);
            tabelaCalculos.getColumnModel().getColumn(8).setPreferredWidth(40);
            tabelaCalculos.getColumnModel().getColumn(8).setMaxWidth(40);
        }

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(236, 236, 236));
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0,00");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.setFocusable(false);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 28));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(236, 236, 236));
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.setText("0,00");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField6.setFocusable(false);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 28));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(236, 236, 236));
        jTextField18.setForeground(new java.awt.Color(153, 153, 153));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField18.setText("0,00");
        jTextField18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField18.setFocusable(false);
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, 28));

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(255, 255, 0));
        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField19.setText("0,00");
        jTextField19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField19.setFocusable(false);
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 100, 28));

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(236, 236, 236));
        jTextField20.setForeground(new java.awt.Color(153, 153, 153));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField20.setText("0,00");
        jTextField20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField20.setFocusable(false);
        jPanel3.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 90, 28));

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(236, 236, 236));
        jTextField21.setForeground(new java.awt.Color(153, 153, 153));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField21.setText("0,00");
        jTextField21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField21.setFocusable(false);
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 110, 28));

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(236, 236, 236));
        jTextField22.setForeground(new java.awt.Color(153, 153, 153));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField22.setText("0,00");
        jTextField22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField22.setFocusable(false);
        jPanel3.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, 28));

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel18.setText("Matéria Prima");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 80, -1));

        jLabel19.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel19.setText("  Serviços 3os");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 5, 80, -1));

        jLabel20.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel20.setText("  Produção");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 5, 80, -1));

        jLabel21.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel21.setText("Custo Total");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 5, 70, -1));

        jLabel22.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel22.setText(" Comissões");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 5, 60, -1));

        jLabel23.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel23.setText(" C. Marginal 0%");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 5, 90, -1));

        jLabel24.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel24.setText(" CF atingido 34,7%");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 5, 100, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cálculos", jPanel4);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/IconePhoenix2,2mm.png"))); // NOI18N
        jButton1.setText("Impressora : ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/IconePhoenix2,2mm.png"))); // NOI18N
        jButton3.setText("F2-Imprimir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/IconePhoenix2,2mm.png"))); // NOI18N
        jButton7.setText("Salvar Orç.");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/IconePhoenix2,2mm.png"))); // NOI18N
        jButton8.setText("F4-eMail");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/IconePhoenix2,2mm.png"))); // NOI18N
        jButton9.setText("F6-Visualizar");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/os_Redonda.png"))); // NOI18N
        jButton10.setText("Gerar OS");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel25.setText(" Itens a imprimir");

        jLabel26.setText(" Data do Orçamento");

        jTextField24.setText("13/03/2024");

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(236, 236, 236));
        jTextField25.setForeground(new java.awt.Color(102, 102, 102));
        jTextField25.setText("Qua");
        jTextField25.setFocusable(false);

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(236, 236, 236));
        jTextField26.setForeground(new java.awt.Color(102, 102, 102));
        jTextField26.setText("Vithor");
        jTextField26.setFocusable(false);

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(236, 236, 236));
        jTextField27.setForeground(new java.awt.Color(102, 102, 102));
        jTextField27.setText("Vithor");
        jTextField27.setFocusable(false);

        jLabel27.setText(" Incluído por");

        jLabel28.setText("Últ. mov. por");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel6.setOpaque(false);

        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Imprimir Carta Proposta");

        jCheckBox9.setText("Imprimir pré-cálculo");

        jCheckBox10.setText("Carta Resumida(Só observações)");

        jCheckBox11.setText("Totalizar valor dos itens");

        jCheckBox12.setSelected(true);
        jCheckBox12.setText("Gerar PDF da carta ao gravar (F3)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox11)
                .addGap(12, 12, 12)
                .addComponent(jCheckBox12)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel25)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28))))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Gravar", jPanel5);

        javax.swing.GroupLayout painelDetalhes01Layout = new javax.swing.GroupLayout(painelDetalhes01);
        painelDetalhes01.setLayout(painelDetalhes01Layout);
        painelDetalhes01Layout.setHorizontalGroup(
            painelDetalhes01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDetalhesOrcamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        painelDetalhes01Layout.setVerticalGroup(
            painelDetalhes01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDetalhesOrcamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );

        jTabbedPaneDetalhes.addTab("01", painelDetalhes01);

        jButtonPrecoOrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/budget.png"))); // NOI18N
        jButtonPrecoOrc.setText("F1");
        jButtonPrecoOrc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPrecoOrc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrecoOrc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel16.setText("Preço Venda");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel17.setText("Preço Unitário");

        jformatedTextFieldPrecoVenda.setBorder(null);
        jformatedTextFieldPrecoVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jformatedTextFieldPrecoVenda.setPreferredSize(new java.awt.Dimension(64, 25));

        jformatedTextFieldPrecoUnitario.setBorder(null);
        jformatedTextFieldPrecoUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jformatedTextFieldPrecoUnitario.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButtonPrecoOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jformatedTextFieldPrecoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jformatedTextFieldPrecoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelVendaOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonPrecoOrc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jformatedTextFieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jformatedTextFieldPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(painelVendaOrcamento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        comboBoxTOPainelOrcamento.setEditable(true);
        comboBoxTOPainelOrcamento.setMaximumRowCount(0);
        comboBoxTOPainelOrcamento.setBorder(null);
        comboBoxTOPainelOrcamento.setLightWeightPopupEnabled(false);
        comboBoxTOPainelOrcamento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboBoxTOPainelOrcamentoPopupMenuWillBecomeVisible(evt);
            }
        });

        jTextField23.setEditable(false);
        jTextField23.setForeground(new java.awt.Color(204, 204, 204));
        jTextField23.setText("____");
        jTextField23.setFocusable(false);
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(236, 236, 236));
        jTextField4.setForeground(new java.awt.Color(120, 120, 120));
        jTextField4.setFocusable(false);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(236, 236, 236));
        jTextField5.setForeground(new java.awt.Color(120, 120, 120));
        jTextField5.setFocusable(false);

        jLabel4.setText(" N° Orç + Item");

        jLabel5.setText(" N° OS");

        javax.swing.GroupLayout painelItemOrcamentoLayout = new javax.swing.GroupLayout(painelItemOrcamento);
        painelItemOrcamento.setLayout(painelItemOrcamentoLayout);
        painelItemOrcamentoLayout.setHorizontalGroup(
            painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItemOrcamentoLayout.createSequentialGroup()
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTabbedPaneDetalhes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItemOrcamentoLayout.createSequentialGroup()
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxTOPainelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(491, Short.MAX_VALUE))))
        );
        painelItemOrcamentoLayout.setVerticalGroup(
            painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTipoOrcamento)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxTOPainelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPaneDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );

        jTabbedPaneDetalhes.getAccessibleContext().setAccessibleName("01");

        jTabbedPaneOrcTotal.addTab("01", painelItemOrcamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneOrcTotal)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneOrcTotal)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxClientesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboBoxClientesPopupMenuWillBecomeVisible
        PainelListaDeClientes customPanelClientes = new PainelListaDeClientes();

        JDialog dialogClientes = new JDialog();
        dialogClientes.setTitle("Lista de Clientes");
        customPanelClientes.jButtonAlterarClientes.setVisible(false);
        customPanelClientes.jButtonAlterarClientes.setEnabled(false);
        dialogClientes.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogClientes.getContentPane().add(customPanelClientes);
        dialogClientes.pack();
        dialogClientes.setLocationRelativeTo(null);
        dialogClientes.setModal(true);
        PainelListaDeClientes.passarClienteParaOrc(dialogClientes, jLabelClienteOrcamento);
        dialogClientes.setVisible(true);

        dialogClientes.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                comboBoxClientes.requestFocus();
            }
        });

        comboBoxClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogClientes.dispose();
            }
        });
    }//GEN-LAST:event_comboBoxClientesPopupMenuWillBecomeVisible

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
        TextFieldQuantidade.requestFocus();
    }//GEN-LAST:event_jTextField23MouseClicked

    private void comboBoxTOPainelOrcamentoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboBoxTOPainelOrcamentoPopupMenuWillBecomeVisible
        PainelTipoDeOrcamento customPanelTipoOrcamento = new PainelTipoDeOrcamento();

        JDialog dialogOrc = new JDialog();
        dialogOrc.setTitle("Lista de Clientes");
        dialogOrc.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogOrc.getContentPane().add(customPanelTipoOrcamento);
        dialogOrc.pack();
        dialogOrc.setLocationRelativeTo(null);
        dialogOrc.setModal(true);
        PainelTipoDeOrcamento.passarTipoOrcamentoParaOrc(dialogOrc, comboBoxTOPainelOrcamento, jLabelTipoOrcamento);
        dialogOrc.setVisible(true);

        dialogOrc.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                comboBoxTOPainelOrcamento.requestFocus();
            }
        });

        comboBoxTOPainelOrcamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogOrc.dispose();
            }
        });
    }//GEN-LAST:event_comboBoxTOPainelOrcamentoPopupMenuWillBecomeVisible

    private void tabelaCalculosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaCalculosFocusLost
        tabelaCalculos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaCalculosFocusLost

    private void tabelaCalculosExtrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaCalculosExtrasFocusLost
        tabelaCalculosExtras.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaCalculosExtrasFocusLost

    private void tabelaParametrosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaParametrosFocusLost
        tabelaParametros.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaParametrosFocusLost

    private void tabelaAcabamentosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaAcabamentosFocusLost
        tabelaAcabamentos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaAcabamentosFocusLost

    private void tabelaOrcPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaOrcPrincipalFocusLost
        tabelaOrcPrincipal.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaOrcPrincipalFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcabamentoMontagem;
    private javax.swing.JTextField TextFieldQuantidade;
    public static javax.swing.JComboBox<String> comboBoxClientes;
    public javax.swing.JComboBox<String> comboBoxTOPainelOrcamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonPrecoOrc;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClienteOrcamento;
    public javax.swing.JLabel jLabelTipoOrcamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPaneDetalhes;
    private javax.swing.JTabbedPane jTabbedPaneOrcTotal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private util.JformatedTextFieldPreco jformatedTextFieldPrecoUnitario;
    private util.JformatedTextFieldPreco jformatedTextFieldPrecoVenda;
    private javax.swing.JPanel painelDetalhes01;
    private Teste.PainelDetalhesOrcamento painelDetalhesOrcamento1;
    private javax.swing.JPanel painelItemOrcamento;
    private javax.swing.JPanel painelMontagem;
    private Teste.PainelVendaOrcamento painelVendaOrcamento1;
    private javax.swing.JTable tabelaAcabamentos;
    private javax.swing.JTable tabelaCalculos;
    private javax.swing.JTable tabelaCalculosExtras;
    private javax.swing.JTable tabelaOrcPrincipal;
    private javax.swing.JTable tabelaParametros;
    // End of variables declaration//GEN-END:variables

    private void editorCelulaOrcamentoTabelaMedidas() {

        Font font = new Font("Arial", Font.PLAIN, 12);
        Color fontColor = Color.BLACK;
        CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);
        for (int i = 0; i < tabelaOrcPrincipal.getColumnCount(); i++) {
            tabelaOrcPrincipal.getColumnModel().getColumn(i).setCellEditor(customEditor);
        }

        tabelaOrcPrincipal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (hasFocus) {
                    setBorder(BorderFactory.createLoweredBevelBorder());
                    setBackground(new Color(255, 218, 185));
                    setForeground(Color.BLACK);
                } else {
                    setBackground(new Color(245, 245, 245));
                    setForeground(Color.BLACK);
                }

                return component;
            }
        });

        int[] columnNotSelectable = {0};
        for (int columnIndex : columnNotSelectable) {
            tabelaOrcPrincipal.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component component = super.getTableCellRendererComponent(table, value, false, false, row, column);
                    return component;
                }
            });
        }
    }

    private void editorCelulaOrcamentoTabelaCalculosExtras() {

        Font font = new Font("Arial", Font.PLAIN, 12);
        Color fontColor = Color.BLACK;
        CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);
        tabelaCalculosExtras.getColumnModel().getColumn(0).setCellEditor(customEditor);

        tabelaCalculosExtras.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (hasFocus && column == 0) {
                    setBorder(BorderFactory.createLoweredBevelBorder());
                    setBackground(new Color(255, 218, 185));
                    setForeground(Color.BLACK);
                } else if (column == 0) {
                    setBackground(new Color(245, 245, 245));
                    setForeground(Color.BLACK);
                }
                return component;
            }
        });
    }

    private void editorCelulaOrcamentoTabelaAcabamentos() {

        Font font = new Font("Arial", Font.PLAIN, 12);
        Color fontColor = Color.BLACK;
        CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);
        for (int i = 0; i < tabelaAcabamentos.getColumnCount(); i++) {
            tabelaAcabamentos.getColumnModel().getColumn(i).setCellEditor(customEditor);
        }

        tabelaAcabamentos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (hasFocus) {
                    setBorder(BorderFactory.createLoweredBevelBorder());
                    setBackground(new Color(255, 218, 185));
                    setForeground(Color.BLACK);
                } else {
                    setBackground(new Color(245, 245, 245));
                    setForeground(Color.BLACK);
                }

                return component;
            }
        });

        int[] columnNotSelectable = {0};
        for (int columnIndex : columnNotSelectable) {
            tabelaAcabamentos.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component component = super.getTableCellRendererComponent(table, value, false, false, row, column);
                    return component;
                }
            });
        }
    }

    private void editorCelulaOrcamentoTabelaParametros() {

        Font font = new Font("Arial", Font.PLAIN, 12);
        Color fontColor = Color.BLACK;
        CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);
        tabelaParametros.getColumnModel().getColumn(0).setCellEditor(customEditor);

        tabelaParametros.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (hasFocus) {
                    setBorder(BorderFactory.createLoweredBevelBorder());
                    setBackground(new Color(255, 218, 185));
                    setForeground(Color.BLACK);
                } else {
                    setBackground(new Color(245, 245, 245));
                    setForeground(Color.BLACK);
                }
                return component;
            }
        });
    }

    private void editorCelulaOrcamentoCalculos() {

        Font font = new Font("Arial", Font.PLAIN, 12);
        Color fontColor = Color.BLACK;
        CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);
        for (int i = 0; i < tabelaCalculos.getColumnCount(); i++) {
            tabelaCalculos.getColumnModel().getColumn(i).setCellEditor(customEditor);
        }

        tabelaCalculos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (hasFocus) {
                    setBorder(BorderFactory.createLoweredBevelBorder());
                    setBackground(new Color(255, 218, 185));
                    setForeground(Color.BLACK);
                } else {
                    setBackground(new Color(245, 245, 245));
                    setForeground(Color.BLACK);
                }

                return component;
            }
        });

        int[] columnNotSelectable = {0};
        for (int columnIndex : columnNotSelectable) {
            tabelaCalculos.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component component = super.getTableCellRendererComponent(table, value, false, false, row, column);
                    return component;
                }
            });
        }
    }

    private void numeracaoTabelaCalculos() {
        DefaultTableModel model = (DefaultTableModel) tabelaCalculos.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.setValueAt(String.format("%02d", i + 1), i, 0);
        }
    }

    private void atualizarLabelClientes() {
        ((JTextComponent) comboBoxClientes.getEditor().getEditorComponent()).getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel() {
                jLabelClienteOrcamento.setText(" Clientes ()");
            }
        });
    }

    private void atualizarLabelTiposDeOrc() {
        ((JTextComponent) comboBoxTOPainelOrcamento.getEditor().getEditorComponent()).getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel();
            }

            private void updateLabel() {
                jLabelTipoOrcamento.setText(" Tipo de Orçamento ()");
            }
        });
    }

    private void atualizarTimeInclusao() {
        Date dataSistema = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        String dataFormatada = formatoData.format(dataSistema);
        String horaFormatada = formatoHora.format(dataSistema);
        jTextField14.setText(dataFormatada + " - " + horaFormatada);

        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (jTextField4.getText().isEmpty()) {
                Calendar now = Calendar.getInstance();
                SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                String horaFormatada = formatoHora.format(now.getTime());
                jTextField14.setText(jTextField14.getText().split(" - ")[0] + " - " + horaFormatada);
            }
        }
    }

    private void clickPainelTabbed() {
        jTabbedPaneOrcTotal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int tabIndex = jTabbedPaneOrcTotal.indexAtLocation(e.getX(), e.getY());
                if (tabIndex != -1 && SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
                    int option = JOptionPane.showConfirmDialog(null, "Desejar Adicionar outro Item?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        addAbaItem();
                    }
                }
            }
        });
    }

    private void addCloseButtonOnJTabbedPane() {
        int selectedTabIndex = jTabbedPaneOrcTotal.getSelectedIndex();
        if (selectedTabIndex != -1) {
            ButtonTabComponentOrcamento selectedTabComponent = (ButtonTabComponentOrcamento) jTabbedPaneOrcTotal.getTabComponentAt(selectedTabIndex);
            if (selectedTabComponent == null) {
                ButtonTabComponentOrcamento buttonTabComponentOrcamento = new ButtonTabComponentOrcamento(jTabbedPaneOrcTotal, this);
                jTabbedPaneOrcTotal.setTabComponentAt(selectedTabIndex, buttonTabComponentOrcamento);
            }
        }
    }

    private void updateButtonTab() {
        jTabbedPaneOrcTotal.addChangeListener(e -> {
            int selectedTabIndex = jTabbedPaneOrcTotal.getSelectedIndex();

            // Remover o ButtonTabComponent da aba anteriormente selecionada, se houver
            for (int i = 0; i < jTabbedPaneOrcTotal.getTabCount(); i++) {
                if (i != selectedTabIndex) {
                    ButtonTabComponentOrcamento tabComponentOrcamento = (ButtonTabComponentOrcamento) jTabbedPaneOrcTotal.getTabComponentAt(i);
                    if (tabComponentOrcamento != null) {
                        jTabbedPaneOrcTotal.setTabComponentAt(i, null);
                    }
                }
            }

            // Adicionar o ButtonTabComponent à aba selecionada
            if (selectedTabIndex != -1) {
                ButtonTabComponentOrcamento selectedTabComponent = (ButtonTabComponentOrcamento) jTabbedPaneOrcTotal.getTabComponentAt(selectedTabIndex);
                if (selectedTabComponent == null) {
                    ButtonTabComponentOrcamento buttonTabComponentOrcamento = new ButtonTabComponentOrcamento(jTabbedPaneOrcTotal, this);
                    jTabbedPaneOrcTotal.setTabComponentAt(selectedTabIndex, buttonTabComponentOrcamento);
                }
            }
        });
    }

    public void addAbaItem() {
        PainelOrcamentoItem novoPainel = new PainelOrcamentoItem(this);
        listaPaineis.add(novoPainel);

        // Formata o título da aba corretamente
        String tabTitle;
        if (proximoNumeroAba < 10) {
            tabTitle = "0" + proximoNumeroAba;
        } else {
            tabTitle = String.valueOf(proximoNumeroAba);
        }

        jTabbedPaneOrcTotal.addTab(tabTitle, novoPainel);
        jTabbedPaneOrcTotal.setSelectedIndex(jTabbedPaneOrcTotal.getTabCount() - 1);
        proximoNumeroAba++;
        addCloseButtonOnJTabbedPane();
    }

    public void updateTabTitles() {
        for (int i = 0; i < jTabbedPaneOrcTotal.getTabCount(); i++) {
            int tabNumber = i + 1;
            if (tabNumber < 10) {
                jTabbedPaneOrcTotal.setTitleAt(i, "0" + tabNumber);
            } else {
                jTabbedPaneOrcTotal.setTitleAt(i, String.valueOf(tabNumber));
            }
        }
        proximoNumeroAba = jTabbedPaneOrcTotal.getTabCount() + 1;
    }

    public JLabel getjLabelClienteOrcamento() {
        return jLabelClienteOrcamento;
    }

    public void refreshClarPainelOrcamento() {
        jTabbedPaneOrcTotal.removeAll();
        PainelOrcamentoItem primeiroPainel = new PainelOrcamentoItem(this);
        listaPaineis.add(primeiroPainel);
        jTabbedPaneOrcTotal.addTab("01", primeiroPainel);
    }

}
