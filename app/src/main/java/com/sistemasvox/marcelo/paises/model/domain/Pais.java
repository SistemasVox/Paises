package com.sistemasvox.marcelo.paises.model.domain;

public class Pais {
    String Rank, Pais, Populacao;
    public int foto;

    public Pais(String rank, String pais, String populacao, int foto) {
        Rank = rank;
        Pais = pais;
        Populacao = populacao;
        this.foto = foto;
    }

    public String getNomePais() {
        return Pais;
    }
}
