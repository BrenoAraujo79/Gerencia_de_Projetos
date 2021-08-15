package com.sith.gerenciadordePonto.model;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column
        private String nome;
        @Column
        private String senha;

    public Usuarios() {
    }

    public Usuarios(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuarios(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
