package com.streamvibe.api.models.DadosCadastroUsuario;

import jakarta.persistence.Embedded;

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private String cpf;
    private String endereco;

    @Embedded
    private Endereco endereco;

    public Usuario (DadosCadastroUsuario dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.email = dados.senha();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.Endereco());
    }
}
