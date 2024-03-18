package model;

public class MateriaisInsumos {

    private Long idInsumos;
    private String nomeInsumos;
    private String tipoInsumos;
    private String gramaturaInsumos;
    private String preco;
    private String tipoPreco;
    private String codinome;

    public Long getIdInsumos() {
        return idInsumos;
    }

    public void setIdInsumos(Long idInsumos) {
        this.idInsumos = idInsumos;
    }

    public String getNomeInsumos() {
        return nomeInsumos;
    }

    public void setNomeInsumos(String nomeInsumos) {
        this.nomeInsumos = nomeInsumos;
    }

    public String getTipoInsumos() {
        return tipoInsumos;
    }

    public void setTipoInsumos(String tipoInsumos) {
        this.tipoInsumos = tipoInsumos;
    }

    public String getGramaturaInsumos() {
        return gramaturaInsumos;
    }

    public void setGramaturaInsumos(String gramaturaInsumos) {
        this.gramaturaInsumos = gramaturaInsumos;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTipoPreco() {
        return tipoPreco;
    }

    public void setTipoPreco(String tipoPreco) {
        this.tipoPreco = tipoPreco;
    }

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    @Override
    public String toString() {
        return "MateriaisInsumos{" + "idInsumos=" + idInsumos + ", nomeInsumos=" + nomeInsumos + ", tipoInsumos=" + tipoInsumos + ", gramaturaInsumos=" + gramaturaInsumos + ", preco=" + preco + ", tipoPreco=" + tipoPreco + ", codinome=" + codinome + '}';
    }

}
