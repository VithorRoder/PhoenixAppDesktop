package model;

public class TiposOrcamentos {

    private Long idTiposOrc;
    private String descricaoTiposOrc;
    private String tipoServicoTiposOrc;
    private String classificacaoTiposOrc;
    private String valorMinTiposOrc;
    private String tipovalorMinTiposOrc;
    private String tipoUnitarioTiposOrc;

    public Long getIdTiposOrc() {
        return idTiposOrc;
    }

    public void setIdTiposOrc(Long idTiposOrc) {
        this.idTiposOrc = idTiposOrc;
    }

    public String getDescricaoTiposOrc() {
        return descricaoTiposOrc;
    }

    public void setDescricaoTiposOrc(String descricaoTiposOrc) {
        this.descricaoTiposOrc = descricaoTiposOrc;
    }

    public String getTipoServicoTiposOrc() {
        return tipoServicoTiposOrc;
    }

    public void setTipoServicoTiposOrc(String tipoServicoTiposOrc) {
        this.tipoServicoTiposOrc = tipoServicoTiposOrc;
    }

    public String getClassificacaoTiposOrc() {
        return classificacaoTiposOrc;
    }

    public void setClassificacaoTiposOrc(String classificacaoTiposOrc) {
        this.classificacaoTiposOrc = classificacaoTiposOrc;
    }

    public String getValorMinTiposOrc() {
        return valorMinTiposOrc;
    }

    public void setValorMinTiposOrc(String valorMinTiposOrc) {
        this.valorMinTiposOrc = valorMinTiposOrc;
    }

    public String getTipovalorMinTiposOrc() {
        return tipovalorMinTiposOrc;
    }

    public void setTipovalorMinTiposOrc(String tipovalorMinTiposOrc) {
        this.tipovalorMinTiposOrc = tipovalorMinTiposOrc;
    }

    public String getTipoUnitarioTiposOrc() {
        return tipoUnitarioTiposOrc;
    }

    public void setTipoUnitarioTiposOrc(String tipoUnitarioTiposOrc) {
        this.tipoUnitarioTiposOrc = tipoUnitarioTiposOrc;
    }

    @Override
    public String toString() {
        return "TiposOrcamentos{" + "idTiposOrc=" + idTiposOrc + ", descricaoTiposOrc=" + descricaoTiposOrc + ", tipoServicoTiposOrc=" + tipoServicoTiposOrc + ", classificacaoTiposOrc=" + classificacaoTiposOrc + ", valorMinTiposOrc=" + valorMinTiposOrc + ", tipovalorMinTiposOrc=" + tipovalorMinTiposOrc + ", tipoUnitarioTiposOrc=" + tipoUnitarioTiposOrc + '}';
    }

}

//insert into tipo_orcamento (descricao_interna,tipo_servico,classificacao,valor_min,tipo_valor_min,tipo_unitario) values ('Adesivo Vinil','Plotagem','Comunicação Visual','R$55,00','MT2','MT2');
