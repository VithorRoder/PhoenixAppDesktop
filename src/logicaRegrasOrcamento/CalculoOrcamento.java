package logicaRegrasOrcamento;

import static logicaRegrasOrcamento.MaquinasImpressoras.CoresMaquina;
import static logicaRegrasOrcamento.MaquinasImpressoras.FormatoMinMax;
import static logicaRegrasOrcamento.MaquinasImpressoras.GramaturaMinMax;
import static logicaRegrasOrcamento.MaquinasImpressoras.InsumoUtilizado;
import static logicaRegrasOrcamento.MaquinasImpressoras.TipoMaquina;
import static logicaRegrasOrcamento.SubstratosAcabamentos.Tipo;
import static logicaRegrasOrcamento.SubstratosAcabamentos.tipoValor;
import static logicaRegrasOrcamento.SubstratosAcabamentos.valor;
import static paineis.PainelCriarOrcamento.jLabelPreco;
import java.text.DecimalFormat;

public class CalculoOrcamento {

    public static void calculaTudoMaquinaImpressoras() {

        double precoTipoMaquina = TipoMaquina();
        double precoCoresMaquina = CoresMaquina();
        double precoFormatoMinMax = FormatoMinMax();
        double precoGramaturaMinMax = GramaturaMinMax();
        double precoInsumoUtilizado = InsumoUtilizado();
        double precoTipoSA = Tipo();
        double precoValorSA = valor();
        double precoTipoValor = tipoValor();

        double precoTotal = precoTipoMaquina
                + precoCoresMaquina
                + precoFormatoMinMax
                + precoGramaturaMinMax
                + precoInsumoUtilizado
                + precoTipoSA
                + precoValorSA
                + precoTipoValor;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String precoFormatado = decimalFormat.format(precoTotal);

        try {
            jLabelPreco.setText("R$ " + precoFormatado);
            jLabelPreco.repaint();
        } catch (Exception e) {
          System.out.println("Vai da nn pae");
        }
        

    }

}
