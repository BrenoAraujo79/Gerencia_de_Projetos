package com.sith.gerenciadordePonto.model;

public class CadastroUsuarios {

    public String nome;
    public String senha;

    public CadastroUsuarios() {
    }

    public CadastroUsuarios(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
