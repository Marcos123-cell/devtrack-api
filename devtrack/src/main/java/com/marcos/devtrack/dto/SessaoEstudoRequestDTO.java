package com.marcos.devtrack.dto;

import java.time.LocalDate;

public record SessaoEstudoRequestDTO(
        String titulo,
        String descricao,
        LocalDate dataPrazo,
        Double duracaoMinutos,
        String observacoes
) {
}
