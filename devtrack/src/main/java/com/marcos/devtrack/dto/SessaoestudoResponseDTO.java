package com.marcos.devtrack.dto;

import java.time.LocalDate;

public record SessaoestudoResponseDTO(
        Long id,
        String titulo,
        String descricao,
        LocalDate dataPrazo,
        Double duracaoMinutos,
        String observacoes
) {
}
