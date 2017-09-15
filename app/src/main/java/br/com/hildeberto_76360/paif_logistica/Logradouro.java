package br.com.hildeberto_76360.paif_logistica;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 15/09/2017.
 */

public class Logradouro {

    @SerializedName(value = "cep")
    private String cep;
    @SerializedName(value = "TipoDeLogradouro")
    private String tpLougra;
    @SerializedName(value = "Lougradouro")
    private String lougra;
    @SerializedName(value = "Bairro")
    private String bairro;
    @SerializedName(value = "Cidade")
    private String cidade;
    @SerializedName(value = "Estado")
    private String estado;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTpLougra() {
        return tpLougra;
    }

    public void setTpLougra(String tpLougra) {
        this.tpLougra = tpLougra;
    }

    public String getLougra() {
        return lougra;
    }

    public void setLougra(String lougra) {
        this.lougra = lougra;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
