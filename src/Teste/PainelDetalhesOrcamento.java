package Teste;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

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
        Object[][] data = new Object[10][8]; // 10 linhas, 8 colunas

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
                if (row == 0 && column == 0) {
                    table.setToolTipText("Material para Impresão");
                    ToolTipManager.sharedInstance().setInitialDelay(0);
                    ToolTipManager.sharedInstance().mouseMoved(e);
                } else if (row == 0 && column == 2) {
                    table.setToolTipText("Arte Final. Valor, N° Horas ou Código");
                    ToolTipManager.sharedInstance().setInitialDelay(0);
                    ToolTipManager.sharedInstance().mouseMoved(e);
                } else {
                    table.setToolTipText(null);
                }
            }
        });

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellEditor(customEditor);
        }

        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (column % 2 == 0) {
                    setBorder(null);
                    setBackground(new Color(210, 210, 240));
                    setForeground(Color.BLACK);
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
