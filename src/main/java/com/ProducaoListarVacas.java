package com;

import org.bson.codecs.pojo.annotations.BsonProperty;

public class ProducaoListarVacas {
    @BsonProperty(value="login")
    private String login; 
    
    @BsonProperty(value="nome")
    private String nome;

    @BsonProperty(value="senha")
    private String senha; 
    
    public ProducaoListarVacas(){}

    public ProducaoListarVacas(String login, String nome, String senha) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
