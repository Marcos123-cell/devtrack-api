package com.marcos.devtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "projetos_portfolio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProjetoPortfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private String status;

    private String linkGithub;

    private LocalDate dataInicio;

    private LocalDate dataConclusao;
}
