package painelOrcamento;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import paineis.PainelTipoDeOrcamento;
import static painelOrcamento.PainelOrcamento.comboBoxClientes;
import util.JformatedTextFieldPreco;

public class PainelOrcamentoItem extends javax.swing.JPanel {

    private final PainelOrcamento painelOrcamento;
    LimitadorCaractersCellTable cell = new LimitadorCaractersCellTable();

    public PainelOrcamentoItem(PainelOrcamento painelOrcamento) {
        this.painelOrcamento = painelOrcamento;
        initComponents();
        jTabbedPaneDetalhes.remove(painelDetalhes01);
        jTabbedPaneDetalhes.add(new PainelDetalhesOrcamento(), "01");
        editorCelulaOrcamentoTabelaMedidas();
        tabelaOrcPrincipal.setCellSelectionEnabled(true);
        tabelaOrcPrincipal.getColumnModel().getColumn(6).setCellEditor(new ComboBoxCellEditorMaterial());
        editorCelulaOrcamentoTabelaCalculosExtras();
        editorCelulaOrcamentoTabelaAcabamentos();
        editorCelulaOrcamentoTabelaParametros();
        editorCelulaOrcamentoCalculos();
        numeracaoTabelaCalculos();
        atualizarLabelClientes();
        atualizarLabelTiposDeOrc();
        tabelaOrcPrincipal.getColumnModel().getColumn(5).setCellEditor(cell);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        painelDetalhesOrcamento1 = new painelOrcamento.PainelDetalhesOrcamento();
        jPanel7 = new javax.swing.JPanel();
        jButtonPrecoOrc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        painelVendaOrcamento1 = new painelOrcamento.PainelVendaOrcamento();
        jformatedTextFieldPrecoVenda = new util.JformatedTextFieldPreco();
        jformatedTextFieldPrecoUnitario = new util.JformatedTextFieldPreco();
        comboBoxTOPainelOrcamento = new javax.swing.JComboBox<>();
        jTextField23 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setMinWidth(24);
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setPreferredWidth(24);
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setMaxWidth(24);
            tabelaOrcPrincipal.getColumnModel().getColumn(1).setMinWidth(100);
            tabelaOrcPrincipal.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabelaOrcPrincipal.getColumnModel().getColumn(1).setMaxWidth(150);
            tabelaOrcPrincipal.getColumnModel().getColumn(2).setMinWidth(40);
            tabelaOrcPrincipal.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaOrcPrincipal.getColumnModel().getColumn(2).setMaxWidth(120);
            tabelaOrcPrincipal.getColumnModel().getColumn(6).setMinWidth(100);
            tabelaOrcPrincipal.getColumnModel().getColumn(6).setPreferredWidth(120);
            tabelaOrcPrincipal.getColumnModel().getColumn(6).setMaxWidth(150);
            tabelaOrcPrincipal.getColumnModel().getColumn(7).setMinWidth(80);
            tabelaOrcPrincipal.getColumnModel().getColumn(7).setPreferredWidth(100);
            tabelaOrcPrincipal.getColumnModel().getColumn(7).setMaxWidth(150);
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
            tabelaAcabamentos.getColumnModel().getColumn(0).setMinWidth(24);
            tabelaAcabamentos.getColumnModel().getColumn(0).setPreferredWidth(24);
            tabelaAcabamentos.getColumnModel().getColumn(0).setMaxWidth(24);
            tabelaAcabamentos.getColumnModel().getColumn(1).setMinWidth(120);
            tabelaAcabamentos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaAcabamentos.getColumnModel().getColumn(1).setMaxWidth(180);
            tabelaAcabamentos.getColumnModel().getColumn(2).setMinWidth(30);
            tabelaAcabamentos.getColumnModel().getColumn(2).setPreferredWidth(95);
            tabelaAcabamentos.getColumnModel().getColumn(2).setMaxWidth(100);
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
        if (tabelaParametros.getColumnModel().getColumnCount() > 0) {
            tabelaParametros.getColumnModel().getColumn(0).setMinWidth(100);
            tabelaParametros.getColumnModel().getColumn(0).setPreferredWidth(145);
            tabelaParametros.getColumnModel().getColumn(0).setMaxWidth(180);
        }

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
            tabelaCalculosExtras.getColumnModel().getColumn(1).setMinWidth(25);
            tabelaCalculosExtras.getColumnModel().getColumn(1).setPreferredWidth(25);
            tabelaCalculosExtras.getColumnModel().getColumn(1).setMaxWidth(25);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
            tabelaCalculos.getColumnModel().getColumn(0).setMinWidth(24);
            tabelaCalculos.getColumnModel().getColumn(0).setPreferredWidth(24);
            tabelaCalculos.getColumnModel().getColumn(0).setMaxWidth(24);
            tabelaCalculos.getColumnModel().getColumn(1).setMinWidth(20);
            tabelaCalculos.getColumnModel().getColumn(1).setPreferredWidth(28);
            tabelaCalculos.getColumnModel().getColumn(1).setMaxWidth(50);
            tabelaCalculos.getColumnModel().getColumn(2).setMinWidth(80);
            tabelaCalculos.getColumnModel().getColumn(2).setPreferredWidth(190);
            tabelaCalculos.getColumnModel().getColumn(2).setMaxWidth(250);
            tabelaCalculos.getColumnModel().getColumn(3).setMinWidth(100);
            tabelaCalculos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaCalculos.getColumnModel().getColumn(3).setMaxWidth(100);
            tabelaCalculos.getColumnModel().getColumn(4).setMinWidth(20);
            tabelaCalculos.getColumnModel().getColumn(4).setPreferredWidth(60);
            tabelaCalculos.getColumnModel().getColumn(4).setMaxWidth(80);
            tabelaCalculos.getColumnModel().getColumn(5).setMinWidth(70);
            tabelaCalculos.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabelaCalculos.getColumnModel().getColumn(5).setMaxWidth(150);
            tabelaCalculos.getColumnModel().getColumn(6).setMinWidth(50);
            tabelaCalculos.getColumnModel().getColumn(6).setPreferredWidth(90);
            tabelaCalculos.getColumnModel().getColumn(6).setMaxWidth(150);
            tabelaCalculos.getColumnModel().getColumn(7).setMinWidth(25);
            tabelaCalculos.getColumnModel().getColumn(7).setPreferredWidth(25);
            tabelaCalculos.getColumnModel().getColumn(7).setMaxWidth(25);
            tabelaCalculos.getColumnModel().getColumn(8).setMinWidth(50);
            tabelaCalculos.getColumnModel().getColumn(8).setPreferredWidth(50);
            tabelaCalculos.getColumnModel().getColumn(8).setMaxWidth(50);
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jButtonPrecoOrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPrecoOrcMouseClicked(evt);
            }
        });

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
                        .addGap(0, 396, Short.MAX_VALUE))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1725, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelItemOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelItemOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaOrcPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaOrcPrincipalFocusLost
        tabelaOrcPrincipal.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaOrcPrincipalFocusLost

    private void tabelaAcabamentosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaAcabamentosFocusLost
        tabelaAcabamentos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaAcabamentosFocusLost

    private void tabelaParametrosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaParametrosFocusLost
        tabelaParametros.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaParametrosFocusLost

    private void tabelaCalculosExtrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaCalculosExtrasFocusLost
        tabelaCalculosExtras.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaCalculosExtrasFocusLost

    private void tabelaCalculosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaCalculosFocusLost
        tabelaCalculos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }//GEN-LAST:event_tabelaCalculosFocusLost

    private void jButtonPrecoOrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrecoOrcMouseClicked
        //Metodo para gerar o preço do item do orçamento.
    }//GEN-LAST:event_jButtonPrecoOrcMouseClicked

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

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
        TextFieldQuantidade.requestFocus();
    }//GEN-LAST:event_jTextField23MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcabamentoMontagem;
    private javax.swing.JTextField TextFieldQuantidade;
    private javax.swing.JComboBox<String> comboBoxTOPainelOrcamento;
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
    private javax.swing.JLabel jLabelTipoOrcamento;
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
    private javax.swing.JTextField jTextField1;
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
    private util.JformatedTextFieldPreco jformatedTextFieldPrecoUnitario;
    private util.JformatedTextFieldPreco jformatedTextFieldPrecoVenda;
    private javax.swing.JPanel painelDetalhes01;
    private painelOrcamento.PainelDetalhesOrcamento painelDetalhesOrcamento1;
    private javax.swing.JPanel painelItemOrcamento;
    private javax.swing.JPanel painelMontagem;
    private painelOrcamento.PainelVendaOrcamento painelVendaOrcamento1;
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
                painelOrcamento.getjLabelClienteOrcamento().setText("Clientes ()");
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

    // Getters and Setters
    public LimitadorCaractersCellTable getCell() {
        return cell;
    }

    public void setCell(LimitadorCaractersCellTable cell) {
        this.cell = cell;
    }

    public JPanel getPainelAcabamentoMontagem() {
        return PainelAcabamentoMontagem;
    }

    public void setPainelAcabamentoMontagem(JPanel PainelAcabamentoMontagem) {
        this.PainelAcabamentoMontagem = PainelAcabamentoMontagem;
    }

    public JTextField getTextFieldQuantidade() {
        return TextFieldQuantidade;
    }

    public void setTextFieldQuantidade(JTextField TextFieldQuantidade) {
        this.TextFieldQuantidade = TextFieldQuantidade;
    }

    public JComboBox<String> getComboBoxTOPainelOrcamento() {
        return comboBoxTOPainelOrcamento;
    }

    public void setComboBoxTOPainelOrcamento(JComboBox<String> comboBoxTOPainelOrcamento) {
        this.comboBoxTOPainelOrcamento = comboBoxTOPainelOrcamento;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton10() {
        return jButton10;
    }

    public void setjButton10(JButton jButton10) {
        this.jButton10 = jButton10;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public void setjButton9(JButton jButton9) {
        this.jButton9 = jButton9;
    }

    public JButton getjButtonPrecoOrc() {
        return jButtonPrecoOrc;
    }

    public void setjButtonPrecoOrc(JButton jButtonPrecoOrc) {
        this.jButtonPrecoOrc = jButtonPrecoOrc;
    }

    public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.jCheckBox1 = jCheckBox1;
    }

    public JCheckBox getjCheckBox10() {
        return jCheckBox10;
    }

    public void setjCheckBox10(JCheckBox jCheckBox10) {
        this.jCheckBox10 = jCheckBox10;
    }

    public JCheckBox getjCheckBox11() {
        return jCheckBox11;
    }

    public void setjCheckBox11(JCheckBox jCheckBox11) {
        this.jCheckBox11 = jCheckBox11;
    }

    public JCheckBox getjCheckBox12() {
        return jCheckBox12;
    }

    public void setjCheckBox12(JCheckBox jCheckBox12) {
        this.jCheckBox12 = jCheckBox12;
    }

    public JCheckBox getjCheckBox2() {
        return jCheckBox2;
    }

    public void setjCheckBox2(JCheckBox jCheckBox2) {
        this.jCheckBox2 = jCheckBox2;
    }

    public JCheckBox getjCheckBox3() {
        return jCheckBox3;
    }

    public void setjCheckBox3(JCheckBox jCheckBox3) {
        this.jCheckBox3 = jCheckBox3;
    }

    public JCheckBox getjCheckBox4() {
        return jCheckBox4;
    }

    public void setjCheckBox4(JCheckBox jCheckBox4) {
        this.jCheckBox4 = jCheckBox4;
    }

    public JCheckBox getjCheckBox5() {
        return jCheckBox5;
    }

    public void setjCheckBox5(JCheckBox jCheckBox5) {
        this.jCheckBox5 = jCheckBox5;
    }

    public JCheckBox getjCheckBox6() {
        return jCheckBox6;
    }

    public void setjCheckBox6(JCheckBox jCheckBox6) {
        this.jCheckBox6 = jCheckBox6;
    }

    public JCheckBox getjCheckBox7() {
        return jCheckBox7;
    }

    public void setjCheckBox7(JCheckBox jCheckBox7) {
        this.jCheckBox7 = jCheckBox7;
    }

    public JCheckBox getjCheckBox8() {
        return jCheckBox8;
    }

    public void setjCheckBox8(JCheckBox jCheckBox8) {
        this.jCheckBox8 = jCheckBox8;
    }

    public JCheckBox getjCheckBox9() {
        return jCheckBox9;
    }

    public void setjCheckBox9(JCheckBox jCheckBox9) {
        this.jCheckBox9 = jCheckBox9;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabelTipoOrcamento() {
        return jLabelTipoOrcamento;
    }

    public void setjLabelTipoOrcamento(JLabel jLabelTipoOrcamento) {
        this.jLabelTipoOrcamento = jLabelTipoOrcamento;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public JTabbedPane getjTabbedPaneDetalhes() {
        return jTabbedPaneDetalhes;
    }

    public void setjTabbedPaneDetalhes(JTabbedPane jTabbedPaneDetalhes) {
        this.jTabbedPaneDetalhes = jTabbedPaneDetalhes;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextField18() {
        return jTextField18;
    }

    public void setjTextField18(JTextField jTextField18) {
        this.jTextField18 = jTextField18;
    }

    public JTextField getjTextField19() {
        return jTextField19;
    }

    public void setjTextField19(JTextField jTextField19) {
        this.jTextField19 = jTextField19;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public JTextField getjTextField20() {
        return jTextField20;
    }

    public void setjTextField20(JTextField jTextField20) {
        this.jTextField20 = jTextField20;
    }

    public JTextField getjTextField21() {
        return jTextField21;
    }

    public void setjTextField21(JTextField jTextField21) {
        this.jTextField21 = jTextField21;
    }

    public JTextField getjTextField22() {
        return jTextField22;
    }

    public void setjTextField22(JTextField jTextField22) {
        this.jTextField22 = jTextField22;
    }

    public JTextField getjTextField23() {
        return jTextField23;
    }

    public void setjTextField23(JTextField jTextField23) {
        this.jTextField23 = jTextField23;
    }

    public JTextField getjTextField24() {
        return jTextField24;
    }

    public void setjTextField24(JTextField jTextField24) {
        this.jTextField24 = jTextField24;
    }

    public JTextField getjTextField25() {
        return jTextField25;
    }

    public void setjTextField25(JTextField jTextField25) {
        this.jTextField25 = jTextField25;
    }

    public JTextField getjTextField26() {
        return jTextField26;
    }

    public void setjTextField26(JTextField jTextField26) {
        this.jTextField26 = jTextField26;
    }

    public JTextField getjTextField27() {
        return jTextField27;
    }

    public void setjTextField27(JTextField jTextField27) {
        this.jTextField27 = jTextField27;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    public JformatedTextFieldPreco getJformatedTextFieldPrecoUnitario() {
        return jformatedTextFieldPrecoUnitario;
    }

    public void setJformatedTextFieldPrecoUnitario(JformatedTextFieldPreco jformatedTextFieldPrecoUnitario) {
        this.jformatedTextFieldPrecoUnitario = jformatedTextFieldPrecoUnitario;
    }

    public JformatedTextFieldPreco getJformatedTextFieldPrecoVenda() {
        return jformatedTextFieldPrecoVenda;
    }

    public void setJformatedTextFieldPrecoVenda(JformatedTextFieldPreco jformatedTextFieldPrecoVenda) {
        this.jformatedTextFieldPrecoVenda = jformatedTextFieldPrecoVenda;
    }

    public JPanel getPainelDetalhes01() {
        return painelDetalhes01;
    }

    public void setPainelDetalhes01(JPanel painelDetalhes01) {
        this.painelDetalhes01 = painelDetalhes01;
    }

    public PainelDetalhesOrcamento getPainelDetalhesOrcamento1() {
        return painelDetalhesOrcamento1;
    }

    public void setPainelDetalhesOrcamento1(PainelDetalhesOrcamento painelDetalhesOrcamento1) {
        this.painelDetalhesOrcamento1 = painelDetalhesOrcamento1;
    }

    public JPanel getPainelItemOrcamento() {
        return painelItemOrcamento;
    }

    public void setPainelItemOrcamento(JPanel painelItemOrcamento) {
        this.painelItemOrcamento = painelItemOrcamento;
    }

    public JPanel getPainelMontagem() {
        return painelMontagem;
    }

    public void setPainelMontagem(JPanel painelMontagem) {
        this.painelMontagem = painelMontagem;
    }

    public PainelVendaOrcamento getPainelVendaOrcamento1() {
        return painelVendaOrcamento1;
    }

    public void setPainelVendaOrcamento1(PainelVendaOrcamento painelVendaOrcamento1) {
        this.painelVendaOrcamento1 = painelVendaOrcamento1;
    }

    public JTable getTabelaAcabamentos() {
        return tabelaAcabamentos;
    }

    public void setTabelaAcabamentos(JTable tabelaAcabamentos) {
        this.tabelaAcabamentos = tabelaAcabamentos;
    }

    public JTable getTabelaCalculos() {
        return tabelaCalculos;
    }

    public void setTabelaCalculos(JTable tabelaCalculos) {
        this.tabelaCalculos = tabelaCalculos;
    }

    public JTable getTabelaCalculosExtras() {
        return tabelaCalculosExtras;
    }

    public void setTabelaCalculosExtras(JTable tabelaCalculosExtras) {
        this.tabelaCalculosExtras = tabelaCalculosExtras;
    }

    public JTable getTabelaOrcPrincipal() {
        return tabelaOrcPrincipal;
    }

    public void setTabelaOrcPrincipal(JTable tabelaOrcPrincipal) {
        this.tabelaOrcPrincipal = tabelaOrcPrincipal;
    }

    public JTable getTabelaParametros() {
        return tabelaParametros;
    }

    public void setTabelaParametros(JTable tabelaParametros) {
        this.tabelaParametros = tabelaParametros;
    }
    // End of Getters and Setters
}
