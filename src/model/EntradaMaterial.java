package model;

public class EntradaMaterial {

    private Long idEntradaMat;
    private String dataCadastroEntrada;
    private String horaEntrada;
    private String idFornecedorEntrada;
    private String nomeFornecedorEntrada;
    private String numeroNf;
    private String dataEmissaoNf;
    private String totalNf;
    private String observacoesEntrada;
    private String tableEntradaJson;

    public Long getIdEntradaMat() {
        return idEntradaMat;
    }

    public void setIdEntradaMat(Long idEntradaMat) {
        this.idEntradaMat = idEntradaMat;
    }

    public String getDataCadastroEntrada() {
        return dataCadastroEntrada;
    }

    public void setDataCadastroEntrada(String dataCadastroEntrada) {
        this.dataCadastroEntrada = dataCadastroEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getIdFornecedorEntrada() {
        return idFornecedorEntrada;
    }

    public void setIdFornecedorEntrada(String idFornecedorEntrada) {
        this.idFornecedorEntrada = idFornecedorEntrada;
    }

    public String getNomeFornecedorEntrada() {
        return nomeFornecedorEntrada;
    }

    public void setNomeFornecedorEntrada(String nomeFornecedorEntrada) {
        this.nomeFornecedorEntrada = nomeFornecedorEntrada;
    }

    public String getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(String numeroNf) {
        this.numeroNf = numeroNf;
    }

    public String getDataEmissaoNf() {
        return dataEmissaoNf;
    }

    public void setDataEmissaoNf(String dataEmissaoNf) {
        this.dataEmissaoNf = dataEmissaoNf;
    }

    public String getTotalNf() {
        return totalNf;
    }

    public void setTotalNf(String totalNf) {
        this.totalNf = totalNf;
    }

    public String getObservacoesEntrada() {
        return observacoesEntrada;
    }

    public void setObservacoesEntrada(String observacoesEntrada) {
        this.observacoesEntrada = observacoesEntrada;
    }

    public String getTableEntradaJson() {
        return tableEntradaJson;
    }

    public void setTableEntradaJson(String tableEntradaJson) {
        this.tableEntradaJson = tableEntradaJson;
    }

    @Override
    public String toString() {
        return "EntradaDeMaterial{" + "idEntradaMat=" + idEntradaMat + ", dataCadastroEntrada=" + dataCadastroEntrada + ", horaEntrada=" + horaEntrada + ", idFornecedorEntrada=" + idFornecedorEntrada + ", nomeFornecedorEntrada=" + nomeFornecedorEntrada + ", numeroNf=" + numeroNf + ", dataEmissaoNf=" + dataEmissaoNf + ", totalNf=" + totalNf + ", observacoesEntrada=" + observacoesEntrada + ", tableEntradaJson=" + tableEntradaJson + '}';
    }

}
