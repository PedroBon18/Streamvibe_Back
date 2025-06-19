package com.streamvibe.api.models;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private integer id;
    private String nome;
    private String estudio;
    private double duracao;
    private String imagem;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private String diretor;
    private String elenco;
    private String sinopse;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.estudio = dados.estudio();
        this.duracao = dados.duracao();
        this.imagem = dados.imagem();
        this.genero = dados.genero();
        this.imagem = dados.elenco();
        this.sinopse = dados.sinopse();

    }

}
