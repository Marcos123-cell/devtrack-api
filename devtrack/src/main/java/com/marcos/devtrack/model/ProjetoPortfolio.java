package com.marcos.devtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

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

    @ManyToMany
    @JoinTable(
            name = "projeto_tecnologia",
            joinColumns = @JoinColumn(name = "projeto_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnologia_id")
    )

    private List<Tecnologia> tecnologias;

}
