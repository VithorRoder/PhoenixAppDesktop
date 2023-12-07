package paineis;

import util.CustomPainelEntradaMaterialCellEditor;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;

public class PainelEntradaDeMaterial extends javax.swing.JPanel {

    public PainelEntradaDeMaterial() {
        initComponents();
        editorCedulas();
        dataHoraLocal();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldFornecedor = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataENF = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jformatedTextFieldPreco1 = new util.JformatedTextFieldPreco();
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

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fornecedor");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nro° NF");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Data Emissão NF");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField2.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldFornecedor)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFormattedTextField5)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldDataENF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jformatedTextFieldPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(labelData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFormattedTextFieldDataENF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jformatedTextFieldPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            TableEntradaMat.getColumnModel().getColumn(0).setMinWidth(30);
            TableEntradaMat.getColumnModel().getColumn(0).setPreferredWidth(25);
            TableEntradaMat.getColumnModel().getColumn(0).setMaxWidth(25);
            TableEntradaMat.getColumnModel().getColumn(2).setMinWidth(300);
            TableEntradaMat.getColumnModel().getColumn(2).setPreferredWidth(300);
            TableEntradaMat.getColumnModel().getColumn(2).setMaxWidth(350);
        }

        jPanel3.setOpaque(false);

        jButtonRedondoCriarForncecedoresCancelar2.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresCancelar2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/cancelarAzul.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresCancelar2.setText("Cancelar");
        jButtonRedondoCriarForncecedoresCancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresCancelar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButtonRedondoCriarForncecedoresDeletar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Deletar.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresDeletar.setText("Remover");
        jButtonRedondoCriarForncecedoresDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButtonRedondoCriarForncecedoresSalvar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/salve.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresSalvar.setText("Salvar");
        jButtonRedondoCriarForncecedoresSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonRedondoCriarForncecedoresSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342)
                .addComponent(jButtonRedondoCriarForncecedoresCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRedondoCriarForncecedoresDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1303, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        TableEntradaMat.clearSelection();
    }//GEN-LAST:event_TableEntradaMatFocusLost

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        TableEntradaMat.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showListFornecedores();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TableEntradaMat;
    private javax.swing.JButton jButton1;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresCancelar2;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresDeletar;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataENF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private util.JformatedTextFieldPreco jformatedTextFieldPreco1;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelHora;
    public static javax.swing.JFormattedTextField textFieldFornecedor;
    // End of variables declaration//GEN-END:variables

    private void editorCedulas() {

        TableEntradaMat.getColumnModel().getColumn(1).setCellEditor(new CustomPainelEntradaMaterialCellEditor(null));

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

    }

    public static void showListFornecedores() {
        PainelListaDeFornecedores customPanelFornecedores = new paineis.PainelListaDeFornecedores();

        JDialog dialog = new JDialog();
        dialog.setTitle("Lista de Fornecedores");
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
            Calendar now = Calendar.getInstance();
            labelHora.setText(String.format("%1$tH:%1$tM %1$Tp", now));
        }
    }

}
