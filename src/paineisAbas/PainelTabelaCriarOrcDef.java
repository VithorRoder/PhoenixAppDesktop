package paineisAbas;

import logicaRegrasOrcamento.OrcamentoItemPrecoMin;
import static paineis.PainelCriarOrcamento.jLabelPreco;
import util.CustomCellEditor;
import dao.ConexaoSingleton;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public final class PainelTabelaCriarOrcDef extends javax.swing.JPanel {

    private static final String SQL_FIND_PRECOMIN = "SELECT descricao_interna, valor_min FROM tipo_orcamento ORDER BY descricao_interna";

    public PainelTabelaCriarOrcDef() {
        initComponents();
        preencherColunaZero();
        refreshComboBox();
        editorCelulasColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emptyBorder1 = (javax.swing.border.EmptyBorder)javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1);
        PainelTabelaCriarOrc = new javax.swing.JPanel();
        TipoOrcLabel = new javax.swing.JLabel();
        TipoOrcComboBox = new javax.swing.JComboBox<>();
        QuantidadeTextField = new javax.swing.JTextField();
        QuantidadeLabel = new javax.swing.JLabel();
        ScrollTabelaModOrc = new javax.swing.JScrollPane();
        TabelaCriarOrc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        PainelTabelaCriarOrc.setBackground(new java.awt.Color(180, 180, 180));
        PainelTabelaCriarOrc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        TipoOrcLabel.setForeground(new java.awt.Color(0, 0, 0));
        TipoOrcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipoOrcLabel.setText("Tipo de Orçamento");

        TipoOrcComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TipoOrcComboBox.setMinimumSize(new java.awt.Dimension(72, 18));
        TipoOrcComboBox.setPreferredSize(new java.awt.Dimension(72, 18));
        TipoOrcComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoOrcComboBoxItemStateChanged(evt);
            }
        });

        QuantidadeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QuantidadeTextField.setPreferredSize(new java.awt.Dimension(64, 18));
        QuantidadeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantidadeTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuantidadeTextFieldMousePressed(evt);
            }
        });
        QuantidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeTextFieldActionPerformed(evt);
            }
        });
        QuantidadeTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                QuantidadeTextFieldPropertyChange(evt);
            }
        });

        QuantidadeLabel.setForeground(new java.awt.Color(0, 0, 0));
        QuantidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuantidadeLabel.setText("Quantidade");

        ScrollTabelaModOrc.setBackground(new java.awt.Color(204, 204, 204));
        ScrollTabelaModOrc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ScrollTabelaModOrc.setForeground(new java.awt.Color(204, 204, 204));

        TabelaCriarOrc.setBackground(new java.awt.Color(242, 241, 237));
        TabelaCriarOrc.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        TabelaCriarOrc.setForeground(new java.awt.Color(0, 0, 0));
        TabelaCriarOrc.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Planos(Quantidade)", "Medida(LxA)", "Montagem", "Páginas", "cor", "Material", "Máquina/Impressora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCriarOrc.setGridColor(new java.awt.Color(204, 204, 204));
        TabelaCriarOrc.setName(""); // NOI18N
        TabelaCriarOrc.setRowHeight(22);
        TabelaCriarOrc.setSelectionBackground(new java.awt.Color(255, 153, 255));
        TabelaCriarOrc.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TabelaCriarOrc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaCriarOrc.setShowGrid(true);
        TabelaCriarOrc.getTableHeader().setReorderingAllowed(false);
        TabelaCriarOrc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TabelaCriarOrcFocusLost(evt);
            }
        });
        TabelaCriarOrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCriarOrcMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaCriarOrcMousePressed(evt);
            }
        });
        ScrollTabelaModOrc.setViewportView(TabelaCriarOrc);
        if (TabelaCriarOrc.getColumnModel().getColumnCount() > 0) {
            TabelaCriarOrc.getColumnModel().getColumn(0).setMinWidth(25);
            TabelaCriarOrc.getColumnModel().getColumn(0).setPreferredWidth(25);
            TabelaCriarOrc.getColumnModel().getColumn(0).setMaxWidth(25);
            TabelaCriarOrc.getColumnModel().getColumn(1).setMinWidth(150);
            TabelaCriarOrc.getColumnModel().getColumn(1).setPreferredWidth(150);
            TabelaCriarOrc.getColumnModel().getColumn(1).setMaxWidth(150);
            TabelaCriarOrc.getColumnModel().getColumn(2).setMinWidth(100);
            TabelaCriarOrc.getColumnModel().getColumn(2).setPreferredWidth(100);
            TabelaCriarOrc.getColumnModel().getColumn(2).setMaxWidth(100);
            TabelaCriarOrc.getColumnModel().getColumn(3).setMinWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(3).setPreferredWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(3).setMaxWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(4).setMinWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(4).setPreferredWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(4).setMaxWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(5).setMinWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(5).setPreferredWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(5).setMaxWidth(80);
            TabelaCriarOrc.getColumnModel().getColumn(6).setMinWidth(120);
            TabelaCriarOrc.getColumnModel().getColumn(6).setPreferredWidth(120);
            TabelaCriarOrc.getColumnModel().getColumn(7).setMinWidth(120);
            TabelaCriarOrc.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Titulo do Item");

        jTextField1.setPreferredSize(new java.awt.Dimension(64, 18));

        javax.swing.GroupLayout PainelTabelaCriarOrcLayout = new javax.swing.GroupLayout(PainelTabelaCriarOrc);
        PainelTabelaCriarOrc.setLayout(PainelTabelaCriarOrcLayout);
        PainelTabelaCriarOrcLayout.setHorizontalGroup(
            PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaCriarOrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollTabelaModOrc, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
                    .addGroup(PainelTabelaCriarOrcLayout.createSequentialGroup()
                        .addGroup(PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TipoOrcComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoOrcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelTabelaCriarOrcLayout.createSequentialGroup()
                                .addComponent(QuantidadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelTabelaCriarOrcLayout.createSequentialGroup()
                                .addComponent(QuantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelTabelaCriarOrcLayout.setVerticalGroup(
            PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaCriarOrcLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoOrcLabel)
                    .addComponent(QuantidadeLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelTabelaCriarOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(QuantidadeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(TipoOrcComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(ScrollTabelaModOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabelaCriarOrc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabelaCriarOrc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TipoOrcComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoOrcComboBoxItemStateChanged
        limparCamposTabelaDEF();
        AtualizarTipoOrcComboBox();
    }//GEN-LAST:event_TipoOrcComboBoxItemStateChanged

    private void QuantidadeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantidadeTextFieldMouseClicked
        jLabelPreco.setText("");
    }//GEN-LAST:event_QuantidadeTextFieldMouseClicked

    private void QuantidadeTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantidadeTextFieldMousePressed
        jLabelPreco.setText("");
    }//GEN-LAST:event_QuantidadeTextFieldMousePressed

    private void QuantidadeTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_QuantidadeTextFieldPropertyChange
        jLabelPreco.setText("");
    }//GEN-LAST:event_QuantidadeTextFieldPropertyChange

    private void TabelaCriarOrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCriarOrcMouseClicked
        jLabelPreco.setText("");
    }//GEN-LAST:event_TabelaCriarOrcMouseClicked

    private void TabelaCriarOrcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCriarOrcMousePressed
        jLabelPreco.setText("");
    }//GEN-LAST:event_TabelaCriarOrcMousePressed

    private void QuantidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeTextFieldActionPerformed
        jLabelPreco.setText("");
    }//GEN-LAST:event_QuantidadeTextFieldActionPerformed

    private void TabelaCriarOrcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaCriarOrcFocusLost
        editCelulasTab();
    }//GEN-LAST:event_TabelaCriarOrcFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelTabelaCriarOrc;
    private javax.swing.JLabel QuantidadeLabel;
    private javax.swing.JTextField QuantidadeTextField;
    private javax.swing.JScrollPane ScrollTabelaModOrc;
    private javax.swing.JTable TabelaCriarOrc;
    private javax.swing.JComboBox<String> TipoOrcComboBox;
    private javax.swing.JLabel TipoOrcLabel;
    public static javax.swing.border.EmptyBorder emptyBorder1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("unchecked")
    public void refreshComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
            Connection conn = ConexaoSingleton.getConnection();
            PreparedStatement pstm = null;
            ResultSet rs = null;
            try {
                pstm = conn.prepareStatement(SQL_FIND_PRECOMIN);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    String nome = rs.getString("descricao_interna");
                    double precoMinimo = rs.getDouble("valor_min");
                    OrcamentoItemPrecoMin item = new OrcamentoItemPrecoMin(nome, precoMinimo);
                    model.addElement(item);

                }

                TipoOrcComboBox.setModel(model);
                TipoOrcComboBox.setSelectedItem(null);

            } catch (SQLException e) {

            }
        } catch (SQLException e) {

        }
    }

    public void limparCamposTabelaDEF() {

        TabelaCriarOrc.clearSelection();
        QuantidadeTextField.setText("");
        jLabelPreco.setText("");
        int rowCount = TabelaCriarOrc.getRowCount();
        int colCount = TabelaCriarOrc.getColumnCount();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                TabelaCriarOrc.setValueAt(null, i, j);
            }
        }
        int selectedRow = TabelaCriarOrc.getSelectedRow();
        if (selectedRow != -1) {
            for (int i = 0; i < TabelaCriarOrc.getColumnCount(); i++) {
                TabelaCriarOrc.setValueAt(null, i, i);
            }
        }
    }

    public void editCelulasTab() {
        if (TabelaCriarOrc.isEditing()) {
            int[] editableColumns = {1, 2, 3, 4, 5, 6};
            int selectedColumn = TabelaCriarOrc.getEditingColumn();
            if (selectedColumn >= 0 && Arrays.stream(editableColumns).anyMatch(c -> c == selectedColumn)) {
                TableCellEditor cellEditor = TabelaCriarOrc.getCellEditor();
                if (cellEditor != null) {
                    cellEditor.stopCellEditing();
                }
            }
        }
    }

    public void editorCelulasColor() {
        TabelaCriarOrc.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (isSelected && hasFocus) {
                    Color lightBlue = new Color(0, 0, 180, 80);
                    component.setBackground(lightBlue); // Defina a cor desejada para a célula selecionada
                } else {
                    component.setBackground(table.getBackground());
                }

                return component;
            }
        });

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

        TabelaCriarOrc.setDefaultEditor(Object.class, customEditor);
        LimiteCaracteresCedulaCor();
    }

    public void LimiteCaracteresCedulaCor() {
        int colunaParaLimitar = 5; // Coluna da Tabela
        TableColumnModel columnModel = TabelaCriarOrc.getColumnModel();
        TableColumn coluna = columnModel.getColumn(colunaParaLimitar);
        coluna.setCellEditor(new CustomCellEditor(3)); // limite de caracteres
    }

    public void preencherColunaZero() {
        DefaultTableModel model = (DefaultTableModel) TabelaCriarOrc.getModel();

        // Adicione os valores na coluna 0 da tabela
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(String.format("%02d", i + 1), i, 0);
        }
        // Desativar a seleção de coluna 
        int[] columnNotSelectable = {0};
        for (int columnIndex : columnNotSelectable) {
            TabelaCriarOrc.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component component = super.getTableCellRendererComponent(table, value, false, false, row, column);
                    return component;
                }
            });
        }
    }

    public void AtualizarTipoOrcComboBox() {
        Object selectedItem = TipoOrcComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) TabelaCriarOrc.getModel();

        String selectedValue = (selectedItem instanceof OrcamentoItemPrecoMin) ? selectedItem.toString() : "";

        String Planos = "";
        String Medida = "";
        String Montagem = "";
        String Paginas = "";
        String Cor = "";
        String Material = "";
        String MaquinasImpressoras = "";

        String Planos2 = "";
        String Medida2 = "";
        String Montagem2 = "";
        String Paginas2 = "";
        String Cor2 = "";
        String Material2 = "";
        String MaquinasImpressoras2 = "";

        switch (selectedValue) {
            case "Adesivo Vinil":
                Planos = "";
                Medida = "50x50";
                Montagem = "";
                Paginas = "";
                Cor = "4x0";
                Material = "Adesivo Vinil Branco Brilho - 80g";
                MaquinasImpressoras = "Plotter";
                break;
            case "Panfletos":
                Planos = "";
                Medida = "21x29,7";
                Montagem = "";
                Paginas = "";
                Cor = "4x4";
                Material = "Papel Couchê - 90g";
                MaquinasImpressoras = "Sakurai";
                break;
            case "Apostilas CP Dura":
                Planos = "Capa";
                Planos2 = "Miolo";
                Medida = "22x31";
                Medida2 = "21x29,7";
                Montagem = "";
                Montagem2 = "";
                Paginas = "";
                Paginas2 = "100";
                Cor = "4x0";
                Cor2 = "4x4";
                Material = "Papel Offset - 120g";
                Material2 = "Papel Offset - 90g";
                MaquinasImpressoras = "Kônica";
                MaquinasImpressoras2 = "Comcolor IS";
            default:
                break;
        }

        ///////////  Linha 01  ////////////
        for (int row = 0; row < Math.min(model.getRowCount(), 1); row++) {
            model.setValueAt(Planos, row, 1);
            model.setValueAt(Medida, row, 2);
            model.setValueAt(Montagem, row, 3);
            model.setValueAt(Paginas, row, 4);
            model.setValueAt(Cor, row, 5);
            model.setValueAt(Material, row, 6);
            model.setValueAt(MaquinasImpressoras, row, 7);
        }

        ///////////  Linha 02  ////////////
        for (int row = 1; row < Math.min(model.getRowCount(), 2); row++) {
            model.setValueAt(Planos2, row, 1);
            model.setValueAt(Medida2, row, 2);
            model.setValueAt(Montagem2, row, 3);
            model.setValueAt(Paginas2, row, 4);
            model.setValueAt(Cor2, row, 5);
            model.setValueAt(Material2, row, 6);
            model.setValueAt(MaquinasImpressoras2, row, 7);
        }
        preencherColunaZero();
    }

}
