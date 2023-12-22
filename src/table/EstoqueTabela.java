package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Estoque;

public class EstoqueTabela extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_DESCRICAO_ESTOQUE = 1;
    private static final int COL_TIPO_MATERIAL = 2;
    private static final int COL_TIPO_SUBSTRATO = 3;
    private static final int COL_QUANTIDADE_ESTOQUE = 4;
    private static final int COL_UNIDADE_USO = 5;
    private static final int COL_QUANTIDADE_EMPENHO = 6;
    private static final int COL_ESTOQUE_EMPENHO = 7;

    private List<Estoque> valores;

    public EstoqueTabela(List<Estoque> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estoque estoque = valores.get(rowIndex);
        if (columnIndex == COL_ID) {
            return estoque.getId_estoque();
        } else if (columnIndex == COL_DESCRICAO_ESTOQUE) {
            return estoque.getDescricao_estoque();
        } else if (columnIndex == COL_TIPO_MATERIAL) {
            return estoque.getTipo_material();
        } else if (columnIndex == COL_TIPO_SUBSTRATO) {
            return estoque.getTipo_substrato();
        } else if (columnIndex == COL_QUANTIDADE_ESTOQUE) {
            return estoque.getQuantidade_estoque();
        } else if (columnIndex == COL_UNIDADE_USO) {
            return estoque.getUnidade_uso();
        } else if (columnIndex == COL_QUANTIDADE_EMPENHO) {
            return estoque.getQuantidade_empenho();
        } else if (columnIndex == COL_ESTOQUE_EMPENHO) {
            return estoque.getEstoque_empenho();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String coluna = "";
        switch (column) {
            case COL_ID:
                coluna = "Código";
                break;
            case COL_DESCRICAO_ESTOQUE:
                coluna = "Descrição";
                break;
            case COL_TIPO_MATERIAL:
                coluna = "Tipo do Material";
                break;
            case COL_TIPO_SUBSTRATO:
                coluna = "Tipo do Substrato";
                break;
            case COL_QUANTIDADE_ESTOQUE:
                coluna = "Qt no Estoque";
                break;
            case COL_UNIDADE_USO:
                coluna = "Und de Uso";
                break;
            case COL_QUANTIDADE_EMPENHO:
                coluna = "Quantidade-Empenho";
                break;
            case COL_ESTOQUE_EMPENHO:
                coluna = "Estoque-Empenho";
                break;

            default:
                throw new IllegalArgumentException("Coluna Inválida");

        }

        return coluna;

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Long.class;
        } else if (columnIndex == COL_DESCRICAO_ESTOQUE) {
            return String.class;
        } else if (columnIndex == COL_TIPO_MATERIAL) {
            return String.class;
        } else if (columnIndex == COL_TIPO_SUBSTRATO) {
            return String.class;
        } else if (columnIndex == COL_QUANTIDADE_ESTOQUE) {
            return String.class;
        } else if (columnIndex == COL_UNIDADE_USO) {
            return String.class;
        } else if (columnIndex == COL_QUANTIDADE_EMPENHO) {
            return String.class;
        } else if (columnIndex == COL_ESTOQUE_EMPENHO) {
            return String.class;
        }
        return null;

    }

    public Estoque get(int row) {
        return valores.get(row);
    }

}
