package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.MateriaisInsumos;

public class MateriaisInsumosTabela extends AbstractTableModel {

    private static final int COL_ID_INSUMOS = 0;
    private static final int COL_NOME_INSUMOS = 1;
    private static final int COL_TIPO_INSUMOS = 2;
    private static final int COL_GRAMATURA_INSUMOS = 3;
    private static final int COL_PRECO = 4;
    private static final int COL_TIPO_PRECO = 5;

    private List<MateriaisInsumos> valores;

    public MateriaisInsumosTabela(List<MateriaisInsumos> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MateriaisInsumos materiaisInsumos = valores.get(rowIndex);
        if (columnIndex == COL_ID_INSUMOS) {
            return materiaisInsumos.getIdInsumos();
        } else if (columnIndex == COL_NOME_INSUMOS) {
            return materiaisInsumos.getNomeInsumos();
        } else if (columnIndex == COL_TIPO_INSUMOS) {
            return materiaisInsumos.getTipoInsumos();
        } else if (columnIndex == COL_GRAMATURA_INSUMOS) {
            return materiaisInsumos.getGramaturaInsumos();
        } else if (columnIndex == COL_PRECO) {
            return materiaisInsumos.getPreco();
        } else if (columnIndex == COL_TIPO_PRECO) {
            return materiaisInsumos.getTipoPreco();
        }
        return null;

    }

    @Override
    public String getColumnName(int column) {
        String coluna = "";
        switch (column) {
            case COL_ID_INSUMOS:
                coluna = "Código";
                break;
            case COL_NOME_INSUMOS:
                coluna = "Nome Material/Insumo";
                break;
            case COL_TIPO_INSUMOS:
                coluna = "Tipo do Material";
                break;
            case COL_GRAMATURA_INSUMOS:
                coluna = "Gramatura";
                break;
            case COL_PRECO:
                coluna = "Preço";
                break;
            case COL_TIPO_PRECO:
                coluna = "Tipo de Preço";
                break;

            default:
                throw new IllegalArgumentException("Coluna Inválida");

        }

        return coluna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID_INSUMOS) {
            return Long.class;
        } else if (columnIndex == COL_NOME_INSUMOS) {
            return String.class;
        } else if (columnIndex == COL_TIPO_INSUMOS) {
            return String.class;
        } else if (columnIndex == COL_GRAMATURA_INSUMOS) {
            return String.class;
        } else if (columnIndex == COL_PRECO) {
            return String.class;
        } else if (columnIndex == COL_TIPO_PRECO) {
            return String.class;
        }
        return null;

    }

    public MateriaisInsumos get(int row) {
        return valores.get(row);
    }

}
