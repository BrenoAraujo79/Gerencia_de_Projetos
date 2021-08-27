package com.sith.gerenciadordePonto.model;

public class CadastroUsuarios {

    public String nome;
    public String senha;
    public String novonome;

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
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNovonome() {
        return novonome;
    }

    public void setNovonome(String novonome) {
        this.novonome = novonome;
    }
}
