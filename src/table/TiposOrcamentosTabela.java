package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TiposOrcamentos;

public class TiposOrcamentosTabela extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_DESCRICAO_INTERNA = 1;
    private static final int COL_TIPO_SERVICO = 2;
    private static final int COL_CLASSIFICACAO = 3;
    private static final int COL_VALOR_MIN = 4;
    private static final int COL_TIPO_VALOR_MIN = 5;
    private static final int COL_TIPO_UNITARIO = 6;

    private List<TiposOrcamentos> valores;

    public TiposOrcamentosTabela(List<TiposOrcamentos> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TiposOrcamentos tiposOrcamentos = valores.get(rowIndex);
        if (columnIndex == COL_ID) {
            return tiposOrcamentos.getIdTiposOrc();
        } else if (columnIndex == COL_DESCRICAO_INTERNA) {
            return tiposOrcamentos.getDescricaoTiposOrc();
        } else if (columnIndex == COL_TIPO_SERVICO) {
            return tiposOrcamentos.getTipoServicoTiposOrc();
        } else if (columnIndex == COL_CLASSIFICACAO) {
            return tiposOrcamentos.getClassificacaoTiposOrc();
        } else if (columnIndex == COL_VALOR_MIN) {
            return tiposOrcamentos.getValorMinTiposOrc();
        } else if (columnIndex == COL_TIPO_VALOR_MIN) {
            return tiposOrcamentos.getTipovalorMinTiposOrc();
        } else if (columnIndex == COL_TIPO_UNITARIO) {
            return tiposOrcamentos.getTipoUnitarioTiposOrc();
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
            case COL_DESCRICAO_INTERNA:
                coluna = "Descrição Interna";
                break;
            case COL_TIPO_SERVICO:
                coluna = "Tipo de Serviço";
                break;
            case COL_CLASSIFICACAO:
                coluna = "Classificação";
                break;
            case COL_VALOR_MIN:
                coluna = "Valor Mínimo";
                break;
            case COL_TIPO_VALOR_MIN:
                coluna = "Tipo Valor Min";
                break;
            case COL_TIPO_UNITARIO:
                coluna = "Tipo Unitário";
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
        } else if (columnIndex == COL_DESCRICAO_INTERNA) {
            return String.class;
        } else if (columnIndex == COL_TIPO_SERVICO) {
            return String.class;
        } else if (columnIndex == COL_CLASSIFICACAO) {
            return String.class;
        } else if (columnIndex == COL_VALOR_MIN) {
            return Number.class;
        } else if (columnIndex == COL_TIPO_VALOR_MIN) {
            return String.class;
        } else if (columnIndex == COL_TIPO_UNITARIO) {
            return String.class;
        }
        return null;

    }

    public TiposOrcamentos get(int row) {
        return valores.get(row);
    }

}
