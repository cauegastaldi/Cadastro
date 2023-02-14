package br.edu.ifsp.scl.ads.cadastro;

import androidx.annotation.NonNull;

public class Formulario {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean listaEmails;
    private String sexo;
    private String cidade;
    private String uf;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isListaEmails() {
        return listaEmails;
    }

    public void setListaEmails(boolean listaEmails) {
        this.listaEmails = listaEmails;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome completo: " + nomeCompleto + ", telefone: " + telefone + ", email: " + email
                + ", incluso na lista de emails: " + listaEmails + ", sexo: " + sexo + ", cidade: " +
                cidade + ", UF: " + uf;
    }
}
