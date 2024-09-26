package paineis;

import Teste.ComboBoxCellEditorEntradaMat;
import application.ApplicationFrame;
import com.google.gson.Gson;
import controller.EntradaMaterialController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import model.EntradaMaterial;
import static paineis.PainelListaEstoqueDialog.TableListaEstoqueDialog;

public class PainelEntradaDeMaterial extends javax.swing.JPanel {

    private int linhaSelecionada = -1;

    public PainelEntradaDeMaterial() {
        initComponents();
        editorCedulas();
        if (jLabelID.getText() == null || jLabelID.getText().isEmpty()) {
            dataHoraLocal();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldFornecedor = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldNNF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataENF = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextFieldObservacoes = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jformatedTextFieldPreco1 = new util.JformatedTextFieldPreco();
        labelCodigoForn02 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEntradaMat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonRedondoCriarForncecedoresCancelar2 = new util.JButtonRedondoCriarForncecedores();
        jButtonRedondoCriarForncecedoresDeletar = new util.JButtonRedondoCriarForncecedores();
        jButtonRedondoCriarForncecedoresSalvar = new util.JButtonRedondoCriarForncecedores();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data de Cadastro");

        labelHora.setForeground(new java.awt.Color(0, 0, 0));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelData.setForeground(new java.awt.Color(0, 0, 0));
        labelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Código:");

        jLabelID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fornecedor");

        textFieldFornecedor.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nro° NF");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Data Emissão NF");

        jFormattedTextFieldNNF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldNNF.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        jFormattedTextFieldDataENF.setColumns(3);
        try {
            jFormattedTextFieldDataENF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total NF");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Observações");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/icons8-pasta-do-usuário-20.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(22, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelCodigoForn02.setForeground(new java.awt.Color(51, 51, 51));
        labelCodigoForn02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigoForn02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("Limpar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(labelCodigoForn02, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldObservacoes))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldNNF, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldDataENF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jformatedTextFieldPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textFieldFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCodigoForn02, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(labelData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldNNF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldDataENF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jformatedTextFieldPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        TableEntradaMat.setBackground(new java.awt.Color(242, 241, 237));
        TableEntradaMat.setForeground(new java.awt.Color(51, 51, 51));
        TableEntradaMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", null, null, null, null, null, null, null, null, null},
                {"02", "", null, null, null, null, null, null, null, null},
                {"03", null, null, null, null, null, null, null, null, null},
                {"04", null, null, null, null, null, null, null, null, null},
                {"05", null, null, null, null, null, null, null, null, null},
                {"06", null, null, null, null, null, null, null, null, null},
                {"07", null, null, null, null, null, null, null, null, null},
                {"08", null, null, null, null, null, null, null, null, null},
                {"09", null, null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null, null, null},
                {"21", null, null, null, null, null, null, null, null, null},
                {"22", null, null, null, null, null, null, null, null, null},
                {"23", null, null, null, null, null, null, null, null, null},
                {"24", null, null, null, null, null, null, null, null, null},
                {"25", null, null, null, null, null, null, null, null, null},
                {"26", null, null, null, null, null, null, null, null, null},
                {"27", null, null, null, null, null, null, null, null, null},
                {"28", null, null, null, null, null, null, null, null, null},
                {"29", null, null, null, null, null, null, null, null, null},
                {"30", null, null, null, null, null, null, null, null, null},
                {"31", null, null, null, null, null, null, null, null, null},
                {"32", null, null, null, null, null, null, null, null, null},
                {"33", null, null, null, null, null, null, null, null, null},
                {"34", null, null, null, null, null, null, null, null, null},
                {"35", null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Estoque", "Descrição", "Quantidade", "Unidade", "Qt / Un", "Qt Entrada", "Largura", "Pr. Unitário", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableEntradaMat.setGridColor(new java.awt.Color(153, 153, 153));
        TableEntradaMat.setRowHeight(27);
        TableEntradaMat.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TableEntradaMat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableEntradaMat.setShowGrid(true);
        TableEntradaMat.getTableHeader().setReorderingAllowed(false);
        TableEntradaMat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TableEntradaMatFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(TableEntradaMat);
        if (TableEntradaMat.getColumnModel().getColumnCount() > 0) {
            TableEntradaMat.getColumnModel().getColumn(0).setMinWidth(25);
            TableEntradaMat.getColumnModel().getColumn(0).setPreferredWidth(25);
            TableEntradaMat.getColumnModel().getColumn(0).setMaxWidth(30);
            TableEntradaMat.getColumnModel().getColumn(1).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(1).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(1).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(2).setMinWidth(350);
            TableEntradaMat.getColumnModel().getColumn(2).setPreferredWidth(400);
            TableEntradaMat.getColumnModel().getColumn(2).setMaxWidth(420);
            TableEntradaMat.getColumnModel().getColumn(3).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(3).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(3).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(4).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(4).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(4).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(5).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(5).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(5).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(6).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(6).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(6).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(7).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(7).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(7).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(8).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(8).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(8).setMaxWidth(110);
            TableEntradaMat.getColumnModel().getColumn(9).setMinWidth(110);
            TableEntradaMat.getColumnModel().getColumn(9).setPreferredWidth(110);
            TableEntradaMat.getColumnModel().getColumn(9).setMaxWidth(110);
        }

        jPanel3.setOpaque(false);

        jButtonRedondoCriarForncecedoresCancelar2.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresCancelar2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/cancelarAzul.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresCancelar2.setText("Cancelar");
        jButtonRedondoCriarForncecedoresCancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresCancelar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarForncecedoresCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarForncecedoresCancelar2ActionPerformed(evt);
            }
        });

        jButtonRedondoCriarForncecedoresDeletar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Deletar.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresDeletar.setText("Remover");
        jButtonRedondoCriarForncecedoresDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarForncecedoresDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarForncecedoresDeletarActionPerformed(evt);
            }
        });

        jButtonRedondoCriarForncecedoresSalvar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/salve.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresSalvar.setText("Salvar");
        jButtonRedondoCriarForncecedoresSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarForncecedoresSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarForncecedoresSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonRedondoCriarForncecedoresSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(jButtonRedondoCriarForncecedoresCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(jButtonRedondoCriarForncecedoresDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRedondoCriarForncecedoresSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondoCriarForncecedoresCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondoCriarForncecedoresDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableEntradaMatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableEntradaMatFocusLost
        //cancelarCursorTabela();
    }//GEN-LAST:event_TableEntradaMatFocusLost

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        TableEntradaMat.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showListFornecedores();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRedondoCriarForncecedoresSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarForncecedoresSalvarActionPerformed
        saveUpdateEntradaMaterial();
    }//GEN-LAST:event_jButtonRedondoCriarForncecedoresSalvarActionPerformed

    private void jButtonRedondoCriarForncecedoresCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarForncecedoresCancelar2ActionPerformed
        cancelarEntradaMaterial();
    }//GEN-LAST:event_jButtonRedondoCriarForncecedoresCancelar2ActionPerformed

    private void jButtonRedondoCriarForncecedoresDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarForncecedoresDeletarActionPerformed
        removerEntradaMaterial();
    }//GEN-LAST:event_jButtonRedondoCriarForncecedoresDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TableEntradaMat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresCancelar2;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresDeletar;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresSalvar;
    public static javax.swing.JFormattedTextField jFormattedTextFieldDataENF;
    public static javax.swing.JFormattedTextField jFormattedTextFieldNNF;
    public static javax.swing.JFormattedTextField jFormattedTextFieldObservacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static util.JformatedTextFieldPreco jformatedTextFieldPreco1;
    public static javax.swing.JLabel labelCodigoForn02;
    public static javax.swing.JLabel labelData;
    public static javax.swing.JLabel labelHora;
    public static javax.swing.JFormattedTextField textFieldFornecedor;
    // End of variables declaration//GEN-END:variables

    public final void editorCedulas() {

        TableEntradaMat.setCellSelectionEnabled(true);
        TableEntradaMat.getColumnModel().getColumn(1).setCellEditor(new ComboBoxCellEditorEntradaMat());

        // altera a cor quando a celula é selecionada
        TableEntradaMat.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (isSelected && hasFocus) {
                    Color lightBlue = new Color(0, 0, 180, 80);
                    component.setBackground(lightBlue);
                } else {
                    component.setBackground(table.getBackground());
                }
                return component;
            }
        });

        // Altera a cor quando a celula está sendo editada
        TableCellEditor customEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                JTextField editorComponent = (JTextField) super.getTableCellEditorComponent(table, value, isSelected, row, column);

                Color corDeFundo = new Color(0, 0, 180, 80);
                Border mesmaCorDeFundo = BorderFactory.createLineBorder(corDeFundo, 2);
                editorComponent.setBorder(mesmaCorDeFundo);
                editorComponent.setBackground(corDeFundo);

                return editorComponent;
            }
        };

        TableEntradaMat.setDefaultEditor(Object.class, customEditor);

        // Colunas para alterar a cor de fundo
        int[] columnsToColor = {2, 4, 6, 9};
        DefaultTableCellRenderer blackBackgroundRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, false, false, row, column);

                component.setBackground(new Color(180, 180, 180));
                component.setForeground(Color.WHITE);

                return component;
            }
        };

        for (int columnIndex : columnsToColor) {
            TableEntradaMat.getColumnModel().getColumn(columnIndex).setCellRenderer(blackBackgroundRenderer);
        }

        // Desativar a seleção de coluna 
        int[] columnNotSelectable = {0};
        for (int columnIndex : columnNotSelectable) {
            TableEntradaMat.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component component = super.getTableCellRendererComponent(table, value, false, false, row, column);
                    return component;
                }
            });
        }

        TableEntradaMat.getColumnModel().getColumn(0).setMaxWidth(30);
        TableEntradaMat.getColumnModel().getColumn(0).setMinWidth(25);
        TableEntradaMat.getColumnModel().getColumn(0).setPreferredWidth(25);

        TableEntradaMat.getColumnModel().getColumn(1).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(1).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(1).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(2).setMaxWidth(420);
        TableEntradaMat.getColumnModel().getColumn(2).setMinWidth(350);
        TableEntradaMat.getColumnModel().getColumn(2).setPreferredWidth(420);

        TableEntradaMat.getColumnModel().getColumn(3).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(3).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(3).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(4).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(4).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(4).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(5).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(5).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(5).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(6).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(6).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(6).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(7).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(7).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(7).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(8).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(8).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(8).setPreferredWidth(110);

        TableEntradaMat.getColumnModel().getColumn(9).setMaxWidth(110);
        TableEntradaMat.getColumnModel().getColumn(9).setMinWidth(110);
        TableEntradaMat.getColumnModel().getColumn(9).setPreferredWidth(110);

    }

    public static void showListFornecedores() {
        PainelListaDeFornecedores customPanelFornecedores = new paineis.PainelListaDeFornecedores();

        JDialog dialog = new JDialog();
        dialog.setTitle("Lista de Fornecedores");
        customPanelFornecedores.jButtonAlterarFornecedores.setVisible(false);
        customPanelFornecedores.jButtonAlterarFornecedores.setEnabled(false);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(customPanelFornecedores);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        PainelListaDeFornecedores.passarFornecedorParaEntradaMat(dialog);
        dialog.setVisible(true);

        textFieldFornecedor.getDocument().addDocumentListener(new DocumentListener() {
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

    private void dataHoraLocal() {
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        labelData.setText(formato.format(dataSistema));
        Timer timer = new Timer(1000, new hora());
        timer.start();

    }

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (jLabelID.getText() == null || jLabelID.getText().isEmpty()) {
                Calendar now = Calendar.getInstance();
                labelHora.setText(String.format("%1$tH:%1$tM %1$Tp", now));
            }
        }
    }

    public void LimparCampos() {

        TableEntradaMat.clearSelection();

        int rowCount = TableEntradaMat.getRowCount();
        int colCount = TableEntradaMat.getColumnCount();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                TableEntradaMat.setValueAt(null, i, j);
            }
        }
        int selectedRow = TableEntradaMat.getSelectedRow();
        if (selectedRow != -1) {
            for (int i = 0; i < TableEntradaMat.getColumnCount(); i++) {
                TableEntradaMat.setValueAt(null, i, i);
            }
        }

    }

    public void cancelarCursorTabela() {

        if (TableEntradaMat.isEditing()) {
            int[] editableColumns = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int selectedColumn = TableEntradaMat.getEditingColumn();
            if (selectedColumn >= 1 && Arrays.stream(editableColumns).anyMatch(c -> c == selectedColumn)) {
                TableCellEditor cellEditor = TableEntradaMat.getCellEditor();
                if (cellEditor != null) {
                    cellEditor.stopCellEditing();
                }
            }
        }
    }

    public void passarEstoqueToEntMat(JDialog dialog) {
        TableEntradaMat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    linhaSelecionada = TableEntradaMat.getSelectedRow();
                }
            }
        });

        TableListaEstoqueDialog.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selectedRowMat = TableListaEstoqueDialog.getSelectedRow();
                    Object valorColuna1 = TableListaEstoqueDialog.getValueAt(selectedRowMat, 0);
                    Object valorColuna2 = TableListaEstoqueDialog.getValueAt(selectedRowMat, 1);

                    String valor01 = valorColuna1.toString();
                    String valor02 = valorColuna2.toString();

                    if (linhaSelecionada != -1) {
                        // Obtém a linha selecionada previamente na TableEntradaMat
                        int linhaEntradaMat = linhaSelecionada;

                        TableEntradaMat.setValueAt(valor01, linhaEntradaMat, 1);
                        TableEntradaMat.setValueAt(valor02, linhaEntradaMat, 2);
                        dialog.dispose();
                    }
                }
            }
        });
    }

    public void removerEntradaMaterial() {
        // Ler o ID do campo labelCodigoClientes
        Long idEntradaMaterial = null;
        String idTexto = jLabelID.getText();
        if (!idTexto.isEmpty()) {
            try {
                idEntradaMaterial = Long.parseLong(idTexto);
            } catch (NumberFormatException e) {

            }
        }

        String[] options = {" Sim ", " Não "};
        int confirm01 = JOptionPane.showOptionDialog(this,
                "Confirmar exclusão?",
                "Excluir Cadastro de Fornecedor",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (confirm01 == JOptionPane.YES_OPTION) {
            if (idEntradaMaterial != null) {
                new EntradaMaterialController().excluirEntradaMaterial(idEntradaMaterial);
                JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
                ApplicationFrame.tabbedPaneCustom1.remove(this);
                ApplicationFrame.showPainelListaEntradaMaterial();
            } else {
                JOptionPane.showMessageDialog(this, "Código da entrada de Material é Nulo !", "Código Vazio", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void cancelarEntradaMaterial() {

        String[] options = {" Sim ", " Não "};
        int confirm02 = JOptionPane.showOptionDialog(this,
                "Confirmar exclusão?",
                "Excluir Cadastro de Fornecedor",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (confirm02 == JOptionPane.YES_OPTION) {
            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaEntradaMaterial();
        }
    }

    public void saveUpdateEntradaMaterial() {

        EntradaMaterial entradaMaterial = new EntradaMaterial();
        String tabelaJson = convertTableDataToJson();

        if (labelData.getText().length() > 0
                && labelHora.getText().length() > 0
                && labelCodigoForn02.getText().length() > 0
                && textFieldFornecedor.getText().length() > 0
                && jFormattedTextFieldNNF.getText().length() > 0
                && jFormattedTextFieldDataENF.getText().length() > 0
                && jformatedTextFieldPreco1.getText().length() > 0) {

            entradaMaterial.setDataCadastroEntrada(labelData.getText());
            entradaMaterial.setHoraEntrada(labelHora.getText());
            entradaMaterial.setIdFornecedorEntrada(labelCodigoForn02.getText());
            entradaMaterial.setNomeFornecedorEntrada(textFieldFornecedor.getText());
            entradaMaterial.setNumeroNf(jFormattedTextFieldNNF.getText());
            entradaMaterial.setDataEmissaoNf(jFormattedTextFieldDataENF.getText());
            entradaMaterial.setTotalNf(jformatedTextFieldPreco1.getText());
            entradaMaterial.setObservacoesEntrada(jFormattedTextFieldObservacoes.getText());
            entradaMaterial.setTableEntradaJson(tabelaJson);
        } else {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!", "Código Vazio", JOptionPane.ERROR_MESSAGE);
            return;

        }

        // Ler o ID do campo labelCodigoFornecedores
        Long idEntradaMaterial = null;
        String idTexto = jLabelID.getText();
        if (!idTexto.isEmpty()) {
            try {
                idEntradaMaterial = Long.parseLong(idTexto);
            } catch (NumberFormatException e) {

            }
        }
        int result = 0;

        if (idEntradaMaterial == null) {
            result = new EntradaMaterialController().addEntradaMaterial(entradaMaterial);
            JOptionPane.showMessageDialog(this, result == 1 ? "Valor inserido com sucesso!" : "Falha ao inserir valor!");

            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaEntradaMaterial();
        } else {
            entradaMaterial.setIdEntradaMat(idEntradaMaterial);
            result = new EntradaMaterialController().alterarEntradaMaterial(entradaMaterial);
            JOptionPane.showMessageDialog(this, result == 1 ? "Valor Alterado Com Sucesso!" : "Falha ao alterar valor!");
            idEntradaMaterial = null;

            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaEntradaMaterial();
        }
    }

    public String convertTableDataToJson() {
        int rowCount = TableEntradaMat.getRowCount();
        int colCount = TableEntradaMat.getColumnCount();

        List<List<Object>> data = new ArrayList<>();

        // Iterar sobre as linhas e colunas da tabela
        for (int i = 0; i < rowCount; i++) {
            List<Object> row = new ArrayList<>();
            for (int j = 0; j < colCount; j++) {
                Object cellValue = TableEntradaMat.getValueAt(i, j);
                row.add(cellValue);
            }
            data.add(row);
        }

        // Converte para JSON usando Gson
        Gson gson = new Gson();
        String jsonData = gson.toJson(data);
        return jsonData;
    }
}
