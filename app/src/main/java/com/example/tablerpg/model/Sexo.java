package com.example.tablerpg.model;

enum Sexo {

    SEXO_MASCULINO("Masculino"),
    SEXO_FEMININO("Feminino");

    public String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

}
