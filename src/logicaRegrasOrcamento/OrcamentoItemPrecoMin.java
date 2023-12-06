package logicaRegrasOrcamento;

public class OrcamentoItemPrecoMin {

    private final String nome;
    private final double precoMinimo;

    public OrcamentoItemPrecoMin(String nome, double precoMinimo) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoMinimo() {
        return precoMinimo;
    }

    @Override
    public String toString() {
        return nome;
    }

}