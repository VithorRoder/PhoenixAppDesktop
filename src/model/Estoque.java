package model;

public class Estoque {

    private Long id_estoque;
    private String descricao_estoque;
    private String tipo_material;
    private String tipo_substrato;
    private String quantidade_estoque;
    private String unidade_uso;
    private String quantidade_empenho;
    private String estoque_empenho;

    public Long getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(Long id_estoque) {
        this.id_estoque = id_estoque;
    }

    public String getDescricao_estoque() {
        return descricao_estoque;
    }

    public void setDescricao_estoque(String descricao_estoque) {
        this.descricao_estoque = descricao_estoque;
    }

    public String getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }

    public String getTipo_substrato() {
        return tipo_substrato;
    }

    public void setTipo_substrato(String tipo_substrato) {
        this.tipo_substrato = tipo_substrato;
    }

    public String getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(String quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getUnidade_uso() {
        return unidade_uso;
    }

    public void setUnidade_uso(String unidade_uso) {
        this.unidade_uso = unidade_uso;
    }

    public String getQuantidade_empenho() {
        return quantidade_empenho;
    }

    public void setQuantidade_empenho(String quantidade_empenho) {
        this.quantidade_empenho = quantidade_empenho;
    }

    public String getEstoque_empenho() {
        return estoque_empenho;
    }

    public void setEstoque_empenho(String estoque_empenho) {
        this.estoque_empenho = estoque_empenho;
    }

    @Override
    public String toString() {
        String formattedId = String.format("%03d", id_estoque);
        return "Estoque{"
                + "id_estoque=" + formattedId
                + ", descricao_estoque=" + descricao_estoque
                + ", tipo_material=" + tipo_material
                + ", tipo_substrato=" + tipo_substrato
                + ", quantidade_estoque=" + quantidade_estoque
                + ", unidade_uso=" + unidade_uso
                + ", quantidade_empenho=" + quantidade_empenho
                + ", estoque_empenho=" + estoque_empenho
                + '}';
    }

}
