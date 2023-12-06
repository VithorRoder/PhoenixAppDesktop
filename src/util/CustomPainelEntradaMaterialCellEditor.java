package util;

import paineis.PainelEntradaDeMaterial;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellEditor;

public class CustomPainelEntradaMaterialCellEditor extends DefaultCellEditor implements TableCellEditor {

    private static final int CLICK_COUNT_TO_START = 2;
    private final JButton button;
    private final paineis.PainelListaEstoque customPanel;

    public CustomPainelEntradaMaterialCellEditor() {
        super(new JTextField());
        setClickCountToStart(CLICK_COUNT_TO_START);

        button = new JButton();
        button.setBackground(Color.white);
        button.setFont(button.getFont().deriveFont(Font.PLAIN));
        button.setBorder(null);

        customPanel = new paineis.PainelListaEstoque();
    }

    @Override
    public Object getCellEditorValue() {
        return customPanel;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

        button.setText("Estoque");

        JFrame frame = new JFrame("Lista de Estoque");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(customPanel);
        frame.pack();
        frame.setLocationRelativeTo(button);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);

        PainelEntradaDeMaterial.TableEntradaMat.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                frame.dispose(); // Fecha o frame se houver alteração na tabela
            }
        });

        return null;
    }
}
