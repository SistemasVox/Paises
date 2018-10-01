package com.sistemasvox.marcelo.paises.model.domain;

public class Pais {
    private String rank, pais, populacao;
    private int foto;

    public Pais(String rank, String pais, String populacao, int foto) {
        this.rank = rank;
        this.pais = pais;
        this.populacao = populacao;
        this.foto = foto;
    }

    public String getNomePais() {
        return pais;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
