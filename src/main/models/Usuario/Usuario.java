package com.streamvibe.api.models.DadosCadastroUsuario;

public class Usuario {
    String id;
    String nome;
    String dataDeNascimento;
    String email;
    String senha;
    String cpf;

    public Usuario (DadosCadastroUsuario dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.email = dados.senha();
        this.cpf = dados.cpf();
    }
}
