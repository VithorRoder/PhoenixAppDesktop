package tiposOrcamento;

import java.math.BigDecimal;
import javax.swing.JComboBox;

public final class Banner {

    painelOrcamento.PainelOrcamentoItem painel;

    public Banner(painelOrcamento.PainelOrcamentoItem painel) {
        this.painel = painel;
        verificar();
    }

    public void verificar() {
        if (painel == null) {
            return;
        }
        String textoQuantidade = painel.getTextFieldQuantidade().getText().trim();
        JComboBox<String> comboBox = painel.getComboBoxTOPainelOrcamento();

        if (isNumeroValido(textoQuantidade)
                && "Banner".equals(comboBox.getSelectedItem())
                && Integer.parseInt(textoQuantidade) == 1) {
            painel.getJformatedTextFieldPrecoVenda().setValue(BigDecimal.ONE);
        }
    }

    private boolean isNumeroValido(String texto) {
        return texto != null && texto.matches("\\d+");
    }
}
