package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.MaquinasImpressoras;

public class MaquinasImpressorasTabela extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME_MAQ = 1;
    private static final int COL_DESCRICAO_MAQ = 2;
    private static final int COL_TIPO_MAQ = 3;
    private static final int COL_CORES_MAQ = 4;
    private static final int COL_FORMATO_MIN_MAX_MAQ = 5;
    private static final int COL_GRAMATURA_MIN_MAX_MAQ = 6;
    private static final int COL_INSUMO_UTILIZADO = 7;
    private static final int COL_CODINOME = 8;

    private List<MaquinasImpressoras> valores;

    public MaquinasImpressorasTabela(List<MaquinasImpressoras> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MaquinasImpressoras maquinasImpressoras = valores.get(rowIndex);
        if (columnIndex == COL_ID) {
            return maquinasImpressoras.getIdMaq();
        } else if (columnIndex == COL_NOME_MAQ) {
            return maquinasImpressoras.getNomeMaq();
        } else if (columnIndex == COL_DESCRICAO_MAQ) {
            return maquinasImpressoras.getDescricaoMaq();
        } else if (columnIndex == COL_TIPO_MAQ) {
            return maquinasImpressoras.getTipoMaq();
        } else if (columnIndex == COL_CORES_MAQ) {
            return maquinasImpressoras.getCoresMaq();
        } else if (columnIndex == COL_FORMATO_MIN_MAX_MAQ) {
            return maquinasImpressoras.getFormatoMinMaxMaq();
        } else if (columnIndex == COL_GRAMATURA_MIN_MAX_MAQ) {
            return maquinasImpressoras.getGramaturaMinMaxMaq();
        } else if (columnIndex == COL_INSUMO_UTILIZADO) {
            return maquinasImpressoras.getInsumoMaq();
        } else if (columnIndex == COL_CODINOME) {
            return maquinasImpressoras.getCodinome();
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
            case COL_NOME_MAQ:
                coluna = "Nome/Modelo Máquina";
                break;
            case COL_DESCRICAO_MAQ:
                coluna = "Descrição";
                break;
            case COL_TIPO_MAQ:
                coluna = "Tipo de Máquina";
                break;
            case COL_CORES_MAQ:
                coluna = "Cores";
                break;
            case COL_FORMATO_MIN_MAX_MAQ:
                coluna = "Formato Min/Max";
                break;
            case COL_GRAMATURA_MIN_MAX_MAQ:
                coluna = "Gramatura Min/Max";
                break;
            case COL_INSUMO_UTILIZADO:
                coluna = "Insumo Utilizado";
                break;
            case COL_CODINOME:
                coluna = "COD";
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
        } else if (columnIndex == COL_NOME_MAQ) {
            return String.class;
        } else if (columnIndex == COL_DESCRICAO_MAQ) {
            return String.class;
        } else if (columnIndex == COL_TIPO_MAQ) {
            return String.class;
        } else if (columnIndex == COL_CORES_MAQ) {
            return String.class;
        } else if (columnIndex == COL_FORMATO_MIN_MAX_MAQ) {
            return String.class;
        } else if (columnIndex == COL_GRAMATURA_MIN_MAX_MAQ) {
            return String.class;
        } else if (columnIndex == COL_INSUMO_UTILIZADO) {
            return String.class;
        } else if (columnIndex == COL_CODINOME) {
            return String.class;
        }
        return null;

    }

    public MaquinasImpressoras get(int row) {
        return valores.get(row);
    }

}
