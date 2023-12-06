package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Fornecedores;

public class FornecedoresTabela extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME_FANTASIA = 1;
    private static final int COL_TIPO = 2;
    private static final int COL_CNPJ = 3;
    private static final int COL_CELULAR = 4;
    private static final int COL_EMAIL = 5;

    private final List<Fornecedores> valores;

    public FornecedoresTabela(List<Fornecedores> valores) {
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
        Fornecedores fornecedores = valores.get(rowIndex);
        switch (columnIndex) {
            case COL_ID:
                return fornecedores.getIdFornecedores();
            case COL_NOME_FANTASIA:
                return fornecedores.getNomeFantasiaFornecedores();
            case COL_TIPO:
                return fornecedores.getTipoFornecedores();
            case COL_CNPJ:
                return fornecedores.getCnpjFornecedores();
            case COL_CELULAR:
                return fornecedores.getCelularFornecedores();
            case COL_EMAIL:
                return fornecedores.getEmailFornecedores();
            default:
                break;
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Long.class;
        } else if (columnIndex == COL_NOME_FANTASIA) {
            return String.class;
        } else if (columnIndex == COL_TIPO) {
            return String.class;
        } else if (columnIndex == COL_CNPJ) {
            return String.class;
        } else if (columnIndex == COL_CELULAR) {
            return String.class;
        } else if (columnIndex == COL_EMAIL) {
            return String.class;
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
            case COL_NOME_FANTASIA:
                coluna = "Nome Fantasia";
                break;
            case COL_TIPO:
                coluna = "Tipo";
                break;
            case COL_CNPJ:
                coluna = "CNPJ";
                break;
            case COL_CELULAR:
                coluna = "Celular";
                break;
            case COL_EMAIL:
                coluna = "Email";
                break;

            default:
                throw new IllegalArgumentException("Coluna Inválida");

        }

        return coluna;

    }

    public Fornecedores get(int row) {
        return valores.get(row);
    }

}
