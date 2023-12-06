package model;

public class SubstratosAcabamentos {

    private Long idSubstratos;
    private String descricaoSubstratos;
    private String tipoSubstratos;
    private String valorSubstratos;
    private String tipoValorSubstratos;

    public Long getIdSubstratos() {
        return idSubstratos;
    }

    public void setIdSubstratos(Long idSubstratos) {
        this.idSubstratos = idSubstratos;
    }

    public String getDescricaoSubstratos() {
        return descricaoSubstratos;
    }

    public void setDescricaoSubstratos(String descricaoSubstratos) {
        this.descricaoSubstratos = descricaoSubstratos;
    }

    public String getTipoSubstratos() {
        return tipoSubstratos;
    }

    public void setTipoSubstratos(String tipoSubstratos) {
        this.tipoSubstratos = tipoSubstratos;
    }

    public String getValorSubstratos() {
        return valorSubstratos;
    }

    public void setValorSubstratos(String valorSubstratos) {
        this.valorSubstratos = valorSubstratos;
    }

    public String getTipoValorSubstratos() {
        return tipoValorSubstratos;
    }

    public void setTipoValorSubstratos(String tipoValorSubstratos) {
        this.tipoValorSubstratos = tipoValorSubstratos;
    }

    @Override
    public String toString() {
        return "SubstratosAcabamentos{" + "idSubstratos=" + idSubstratos + ", descricaoSubstratos=" + descricaoSubstratos + ", tipoSubstratos=" + tipoSubstratos + ", valorSubstratos=" + valorSubstratos + ", tipoValorSubstratos=" + tipoValorSubstratos + '}';
    }

}
