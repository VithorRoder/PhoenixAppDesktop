package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Clientes;

public class ClientesTabela extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME_CLIENTE = 1;
    private static final int COL_ENDERECO = 2;
    private static final int COL_TELEFONE = 3;
    private static final int COL_EMAIL = 4;

    private List<Clientes> valores;

    public ClientesTabela(List<Clientes> valores) {
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
        Clientes clientes = valores.get(rowIndex);
        if (columnIndex == COL_ID) {
            return clientes.getIdCliente();
        } else if (columnIndex == COL_NOME_CLIENTE) {
            return clientes.getNomeFantasiaClientes();
        } else if (columnIndex == COL_ENDERECO) {
            return clientes.getEnderecoClientes();
        } else if (columnIndex == COL_TELEFONE) {
            return clientes.getCelularClientes();
        } else if (columnIndex == COL_EMAIL) {
            return clientes.getEmailClientes();
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
            case COL_NOME_CLIENTE:
                coluna = "Nome do Cliente";
                break;
            case COL_ENDERECO:
                coluna = "Endereço";
                break;
            case COL_TELEFONE:
                coluna = "Telefone";
                break;
            case COL_EMAIL:
                coluna = "Email";
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
        } else if (columnIndex == COL_NOME_CLIENTE) {
            return String.class;
        } else if (columnIndex == COL_ENDERECO) {
            return String.class;
        } else if (columnIndex == COL_TELEFONE) {
            return String.class;
        } else if (columnIndex == COL_EMAIL) {
            return String.class;
        }
        return null;
    }

    public Clientes get(int row) {
        return valores.get(row);
    }

}
