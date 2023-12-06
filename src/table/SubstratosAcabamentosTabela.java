package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.SubstratosAcabamentos;

public class SubstratosAcabamentosTabela extends AbstractTableModel {

    private static final int COL_ID_SUBSTRATOS = 0;
    private static final int COL_DESCRICAO_SUBSTRATOS = 1;
    private static final int COL_TIPO_SUBSTRATOS = 2;
    private static final int COL_VALOR = 3;
    private static final int COL_TIPO_VALOR = 4;

    private List<SubstratosAcabamentos> valores;

    public SubstratosAcabamentosTabela(List<SubstratosAcabamentos> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SubstratosAcabamentos substratosAcabamentos = valores.get(rowIndex);
        if (columnIndex == COL_ID_SUBSTRATOS) {
            return substratosAcabamentos.getIdSubstratos();
        } else if (columnIndex == COL_DESCRICAO_SUBSTRATOS) {
            return substratosAcabamentos.getDescricaoSubstratos();
        } else if (columnIndex == COL_TIPO_SUBSTRATOS) {
            return substratosAcabamentos.getTipoSubstratos();
        } else if (columnIndex == COL_VALOR) {
            return substratosAcabamentos.getValorSubstratos();
        } else if (columnIndex == COL_TIPO_VALOR) {
            return substratosAcabamentos.getTipoValorSubstratos();
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID_SUBSTRATOS) {
            return Long.class;
        } else if (columnIndex == COL_DESCRICAO_SUBSTRATOS) {
            return String.class;
        } else if (columnIndex == COL_TIPO_SUBSTRATOS) {
            return String.class;
        } else if (columnIndex == COL_VALOR) {
            return String.class;
        } else if (columnIndex == COL_TIPO_VALOR) {
            return String.class;
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String coluna = "";
        switch (column) {
            case COL_ID_SUBSTRATOS:
                coluna = "Código";
                break;
            case COL_DESCRICAO_SUBSTRATOS:
                coluna = "Nome Substrato/Acabamentos";
                break;
            case COL_TIPO_SUBSTRATOS:
                coluna = "Tipo do Substrato/Acabamento";
                break;
            case COL_VALOR:
                coluna = "Valor";
                break;
            case COL_TIPO_VALOR:
                coluna = "Tipo do Valor";
                break;

            default:
                throw new IllegalArgumentException("Coluna Inválida");

        }

        return coluna;

    }

    public SubstratosAcabamentos get(int row) {
        return valores.get(row);
    }
}
