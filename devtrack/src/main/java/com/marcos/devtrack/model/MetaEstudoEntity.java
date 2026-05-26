package com.marcos.devtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "metas_estudos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MetaEstudoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private String status;

    private LocalDate dataCriacao;

    private LocalDate dataPrazo;


}
