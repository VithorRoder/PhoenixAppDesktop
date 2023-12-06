package model;

public class MaquinasImpressoras {

    private Long idMaq;
    private String nomeMaq;
    private String descricaoMaq;
    private String tipoMaq;
    private String coresMaq;
    private String formatoMinMaxMaq;
    private String gramaturaMinMaxMaq;
    private String insumoMaq;

    public Long getIdMaq() {
        return idMaq;
    }

    public void setIdMaq(Long idMaq) {
        this.idMaq = idMaq;
    }

    public String getNomeMaq() {
        return nomeMaq;
    }

    public void setNomeMaq(String nomeMaq) {
        this.nomeMaq = nomeMaq;
    }

    public String getDescricaoMaq() {
        return descricaoMaq;
    }

    public void setDescricaoMaq(String descricaoMaq) {
        this.descricaoMaq = descricaoMaq;
    }

    public String getTipoMaq() {
        return tipoMaq;
    }

    public void setTipoMaq(String tipoMaq) {
        this.tipoMaq = tipoMaq;
    }

    public String getCoresMaq() {
        return coresMaq;
    }

    public void setCoresMaq(String coresMaq) {
        this.coresMaq = coresMaq;
    }

    public String getFormatoMinMaxMaq() {
        return formatoMinMaxMaq;
    }

    public void setFormatoMinMaxMaq(String formatoMinMaxMaq) {
        this.formatoMinMaxMaq = formatoMinMaxMaq;
    }

    public String getGramaturaMinMaxMaq() {
        return gramaturaMinMaxMaq;
    }

    public void setGramaturaMinMaxMaq(String gramaturaMinMaxMaq) {
        this.gramaturaMinMaxMaq = gramaturaMinMaxMaq;
    }

    public String getInsumoMaq() {
        return insumoMaq;
    }

    public void setInsumoMaq(String insumoMaq) {
        this.insumoMaq = insumoMaq;
    }

    @Override
    public String toString() {
        return "MaquinasImpressoras{" + "idMaq=" + idMaq + ", nomeMaq=" + nomeMaq + ", descricaoMaq=" + descricaoMaq + ", tipoMaq=" + tipoMaq + ", coresMaq=" + coresMaq + ", formatoMinMaxMaq=" + formatoMinMaxMaq + ", gramaturaMinMaxMaq=" + gramaturaMinMaxMaq + ", insumoMaq=" + insumoMaq + '}';
    }

}

//insert into maquinas_impressoras (nome_maquina,descricao,tipo_maquina,cores_maquina,formato_min_max,gramatura_min_max,insumo_utilizado) values ('Sakurai','Sakurai Oliver 4 cores','4 cores','1x0 a 4x4','10x15cm - 57x44cm','70g a 300g','Resmas');
