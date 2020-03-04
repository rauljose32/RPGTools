package com.example.tablerpg.model;

import java.util.List;

class Classe {

    private String nome;
    private String descricao;
    private List<Habilidade> habilidades;

    public Classe() {
    }

    public Classe(String nome, String descricao, List<Habilidade> habilidades) {
        this.nome = nome;
        this.descricao = descricao;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}
