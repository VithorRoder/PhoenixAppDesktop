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

public class PainelVendaOrcamento extends JPanel {

    private JTable table;
    Font font = new Font("Arial", Font.PLAIN, 12);
    Color fontColor = Color.BLACK;
    CustomCellEditorFont customEditor = new CustomCellEditorFont(font, fontColor);

    public PainelVendaOrcamento() {
        // Configuração do JPanel
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 115));
        setBackground(new Color(255, 255, 255));

        // Dados da tabela
        Object[][] data = new Object[5][8];

        // Cabeçalhos das colunas
        String[] columnNames = {"01", "02", "03", "04", "05", "06", "07", "08"};

        // Modelo da tabela
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {

        };

        // Definir valores específicos para células
        model.setValueAt("CM", 0, 0);
        model.setValueAt("CV", 0, 2);
        model.setValueAt("ISS", 0, 4);
        model.setValueAt("NO", 0, 6);
        model.setValueAt("TJ", 1, 0);
        model.setValueAt("CA", 1, 2);
        model.setValueAt("ICM", 1, 4);
        model.setValueAt("FR", 1, 6);
        model.setValueAt("MU", 2, 0);
        model.setValueAt("CE", 2, 2);
        model.setValueAt("IPI", 2, 4);
        model.setValueAt("TP / AT", 2, 6);
        model.setValueAt("MUre", 3, 0);
        model.setValueAt("CI", 3, 2);
        model.setValueAt("ISV", 3, 4);
        model.setValueAt("PE", 3, 6);
        model.setValueAt("CMcf", 4, 0);
        model.setValueAt("OV", 4, 2);
        model.setValueAt("TM", 4, 4);
        model.setValueAt("PP", 4, 6);

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
                                table.setToolTipText("Correção Mensal custos produção");
                            case 2 ->
                                table.setToolTipText("Comissão do Vendedor");
                            case 4 ->
                                table.setToolTipText("Imposto Sobre Serviços");
                            case 6 ->
                                table.setToolTipText("Dividir produção em Varias OSs");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 1 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Taxa de Juros Mensal");
                            case 2 ->
                                table.setToolTipText("Comissão de Agência");
                            case 4 ->
                                table.setToolTipText("ICMS / Redução base ICMS");
                            case 6 ->
                                table.setToolTipText("Frete");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 2 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Markup a aplicar no cálculo");
                            case 2 ->
                                table.setToolTipText("Comissão Especial");
                            case 4 ->
                                table.setToolTipText("IPI");
                            case 6 ->
                                table.setToolTipText("Tempo Produção estimado / Atraso Médio Cliente");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 3 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Markup real calculado");
                            case 2 ->
                                table.setToolTipText("Comissão Interna");
                            case 4 ->
                                table.setToolTipText("Outros Impostos");
                            case 6 ->
                                table.setToolTipText("Prazo de Entrega");
                            default ->
                                table.setToolTipText(null);
                        }
                    }
                    case 4 -> {
                        switch (column) {
                            case 0 ->
                                table.setToolTipText("Contribuição Marginal em relação ao custo fixo");
                            case 2 ->
                                table.setToolTipText("Over sobre Comissão");
                            case 4 ->
                                table.setToolTipText("Tipo de Mapa");
                            case 6 ->
                                table.setToolTipText("Prazo de Pagamento");
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

        int[] columnWidths = {11, 35, 11, 35, 15, 35, 25, 70};
        for (int i = 0; i < columnWidths.length; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellEditor(customEditor);
        }

        table.setRowHeight(18);

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
                    label.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
                    panel.add(label, BorderLayout.CENTER);

                    return panel;
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

        // Adicionar a tabela ao JPanel
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

}
