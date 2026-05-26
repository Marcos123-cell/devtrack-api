package com.marcos.devtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "sessao_estudos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessaoEstudoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private LocalDate dataPrazo;

    private  Double duracaoMinutos;

    private String observacoes;
}
