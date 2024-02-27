package Teste;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import keeptoo.KGradientPanel;

public class PainelDetalhesOrcamento extends JPanel {
    
    private JTable table;
    Font font = new Font("Arial", Font.PLAIN, 12);
    Color fontColor = Color.BLACK;
    CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);
    ComboBoxCellEditorDetalhes cell = new ComboBoxCellEditorDetalhes();
    
    public PainelDetalhesOrcamento() {
        // Configuração do JPanel
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(569, 169));

        // Dados da tabela
        Object[][] data = new Object[10][8];

        // Cabeçalhos das colunas
        String[] columnNames = {"01", "02", "03", "04", "05", "06", "07", "08"};

        // Modelo da tabela
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Desabilita a edição da célula na linha 0 e coluna 1
                return !(row == 0 && column == 1) && column % 2 != 0;
            }
        };

        // Definir valores específicos para células
        model.setValueAt("Material", 0, 0);
        model.setValueAt("AF", 0, 2);
        model.setValueAt("MI Frente", 0, 4);
        model.setValueAt("NA", 0, 6);
        model.setValueAt("PM", 1, 0);
        model.setValueAt("CTP", 1, 2);
        model.setValueAt("IV Verso", 1, 4);
        model.setValueAt("QC", 1, 6);
        model.setValueAt("FM", 2, 0);
        model.setValueAt("PR", 2, 2);
        model.setValueAt("QU", 2, 4);
        model.setValueAt("TC", 2, 6);
        model.setValueAt("FF", 3, 0);
        model.setValueAt("P2", 3, 2);
        model.setValueAt("IM / QI", 3, 4);
        model.setValueAt("Lâminas", 3, 6);
        model.setValueAt("MO", 4, 0);
        model.setValueAt("NM", 4, 2);
        model.setValueAt("NU / PG", 4, 4);
        model.setValueAt("N°_Impr.", 4, 6);
        model.setValueAt("FC", 5, 0);
        model.setValueAt("FA", 5, 2);
        model.setValueAt("NB / NS", 5, 4);
        model.setValueAt("Acerto", 5, 6);
        model.setValueAt("LI / RE", 6, 0);
        model.setValueAt("LO", 6, 2);
        model.setValueAt("MV", 6, 4);
        model.setValueAt("T. Impr.", 6, 6);
        model.setValueAt("AB", 7, 0);
        model.setValueAt("T1 / PO", 7, 2);
        model.setValueAt("LV", 7, 4);
        model.setValueAt("TOTAL", 7, 6);
        model.setValueAt("SA / LP", 8, 0);
        model.setValueAt("T2 / PO", 8, 2);
        model.setValueAt("VE", 8, 4);
        model.setValueAt("Qtd_Mat.", 8, 6);
        model.setValueAt("Apara", 9, 0);
        model.setValueAt("T3 / PO", 9, 2);
        model.setValueAt("POV", 9, 4);
        model.setValueAt("Peso_Mat.", 9, 6);

        // Criar a tabela sem cabeçalho
        table = new JTable(model);
        table.setTableHeader(null);
        table.setShowGrid(true);
        table.setCellSelectionEnabled(true);
        table.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
            }
        });

        // Adiciona um MouseMotionListener para exibir a dica de ferramenta instantaneamente e seguir o cursor do mouse
        table.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }
            
            @Override
            public void mouseMoved(MouseEvent e) {
                Point point = e.getPoint();
                int row = table.rowAtPoint(point);
                int column = table.columnAtPoint(point);
                
                switch (row) {
                    case 0 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Material para Impressão");
                            case 2 ->
                                table.setToolTipText("Arte Final. Valor, N° Horas ou Código");
                            case 4 ->
                                table.setToolTipText("Máquina Impressora Frente");
                            case 6 ->
                                table.setToolTipText("N° de Acertos");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 1 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Preço do Material");
                            case 2 ->
                                table.setToolTipText("CTP ou Fotolito");
                            case 4 ->
                                table.setToolTipText("Máquina Impressora Verso");
                            case 6 ->
                                table.setToolTipText("Quantidade de Chapa");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 2 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Formato do Material");
                            case 2 ->
                                table.setToolTipText("Prova #1");
                            case 4 ->
                                table.setToolTipText("% Quebra de Produção");
                            case 6 ->
                                table.setToolTipText("Tipo de Chapa");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 3 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Formato Final");
                            case 2 ->
                                table.setToolTipText("Prova #2");
                            case 4 ->
                                table.setToolTipText("Impressão e Qualidade");
                            case 6 ->
                                table.setToolTipText("Lâminas");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 4 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Montagem");
                            case 2 ->
                                table.setToolTipText("N° de Modelos");
                            case 4 ->
                                table.setToolTipText("Numeradores / Págs Iguais");
                            case 6 ->
                                table.setToolTipText("Numeros de Impressões Calculadas");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 5 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Formato de Corte ou Impressão");
                            case 2 ->
                                table.setToolTipText("Faca Utilizada");
                            case 4 ->
                                table.setToolTipText("N° Bobinas Simultâneas / N° Serrilhas");
                            case 6 ->
                                table.setToolTipText("Tempo de Acerto");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 6 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Limpeza / Refile");
                            case 2 ->
                                table.setToolTipText("Lombada");
                            case 4 ->
                                table.setToolTipText("Máquina Impressão Verniz");
                            case 6 ->
                                table.setToolTipText("Tempo de Impressão");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 7 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Abertura");
                            case 2 ->
                                table.setToolTipText("Tinta e % de Opupação de Tinta");
                            case 4 ->
                                table.setToolTipText("Lado Impressão Verniz");
                            case 6 ->
                                table.setToolTipText("Tempo Total Acerto + Impressão");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 8 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Sangria / Lado Pinça");
                            case 2 ->
                                table.setToolTipText("Tinta #2 / PO");
                            case 4 ->
                                table.setToolTipText("Verniz Utilizado");
                            case 6 ->
                                table.setToolTipText("Quantidade de Material Calculado");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 9 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("% Apara Maerial no fto Calculado");
                            case 2 ->
                                table.setToolTipText("Tinta #3 / PO");
                            case 4 ->
                                table.setToolTipText("% Ocupação do Verniz");
                            case 6 ->
                                table.setToolTipText("Peso do Plano");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    default ->
                        table.setToolTipText(null);
                }
                ToolTipManager.sharedInstance().setInitialDelay(0);
                ToolTipManager.sharedInstance().mouseMoved(e);
            }
        });
        
        int[] columnWidths = {20, 50, 20, 50, 25, 50, 30, 50}; // Defina as larguras desejadas para cada coluna
        for (int i = 0; i < columnWidths.length; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        
        table.setRowHeight(16);
        
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellEditor(customEditor);
        }
        
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                if (column % 2 == 0) {
                    KGradientPanel panel = new KGradientPanel();
                    panel.setkStartColor(new Color(200, 200, 240));
                    panel.setkEndColor(new Color(205, 188, 180));
                    panel.setkGradientFocus(87);
                    panel.setBorder(null);
                    panel.setLayout(new BorderLayout());

                    // Adiciona o valor da célula ao painel
                    JLabel label = new JLabel(value.toString());
                    label.setHorizontalAlignment(SwingConstants.LEFT);
                    panel.add(label, BorderLayout.CENTER);
                    
                    return panel;
                } else if (row == 0 && column == 1) {
                    setBorder(null);
                    setBackground(new Color(210, 210, 210));
                    setForeground(Color.BLACK);
                } else {
                    setBackground(new Color(255, 255, 255));
                    setForeground(Color.BLACK);
                    setBorder(null);
                    if (hasFocus) {
                        setBorder(BorderFactory.createLoweredBevelBorder());
                        setBackground(new Color(255, 218, 185));
                        setForeground(Color.BLACK);
                    }
                }
                
                return component;
            }
        });
        
        table.getColumnModel().getColumn(5).setCellEditor(cell);

        // Adicionar a tabela ao JPanel
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
    
}
