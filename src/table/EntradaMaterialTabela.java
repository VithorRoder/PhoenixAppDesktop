package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.EntradaMaterial;

public class EntradaMaterialTabela extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_DATA_ENTRADA = 1;
    private static final int COL_NOME_FORNECEDOR = 2;
    private static final int COL_NR_NF = 3;
    private static final int COL_DATA_EMISSAO = 4;
    private static final int COL_TOTAL = 5;

    private List<EntradaMaterial> valores;

    public EntradaMaterialTabela(List<EntradaMaterial> valores) {
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
        EntradaMaterial entradaMaterial = valores.get(rowIndex);

        if (columnIndex == COL_ID) {
            return entradaMaterial.getIdEntradaMat();
        } else if (columnIndex == COL_DATA_ENTRADA) {
            return entradaMaterial.getDataCadastroEntrada();
        } else if (columnIndex == COL_NOME_FORNECEDOR) {
            return entradaMaterial.getNomeFornecedorEntrada();
        } else if (columnIndex == COL_NR_NF) {
            return entradaMaterial.getNumeroNf();
        } else if (columnIndex == COL_DATA_EMISSAO) {
            return entradaMaterial.getDataEmissaoNf();
        } else if (columnIndex == COL_TOTAL) {
            return entradaMaterial.getTotalNf();
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
            case COL_DATA_ENTRADA:
                coluna = "Data de Entrada";
                break;
            case COL_NOME_FORNECEDOR:
                coluna = "Nome Fornecedor";
                break;
            case COL_NR_NF:
                coluna = "Número da NF";
                break;
            case COL_DATA_EMISSAO:
                coluna = "Data de Emissão";
                break;
            case COL_TOTAL:
                coluna = "Total NF";
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
        } else if (columnIndex == COL_DATA_ENTRADA) {
            return String.class;
        } else if (columnIndex == COL_NOME_FORNECEDOR) {
            return String.class;
        } else if (columnIndex == COL_NR_NF) {
            return String.class;
        } else if (columnIndex == COL_DATA_EMISSAO) {
            return String.class;
        } else if (columnIndex == COL_TOTAL) {
            return String.class;
        }
        return null;

    }

    public EntradaMaterial get(int row) {
        return valores.get(row);
    }

}
