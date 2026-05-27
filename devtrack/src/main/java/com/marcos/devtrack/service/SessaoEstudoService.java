package com.marcos.devtrack.service;

import com.marcos.devtrack.dto.SessaoEstudoRequestDTO;
import com.marcos.devtrack.dto.SessaoestudoResponseDTO;
import com.marcos.devtrack.model.SessaoEstudoEntity;
import com.marcos.devtrack.repository.SessaoEstudoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessaoEstudoService {

    private final SessaoEstudoRepository sessaoEstudoRepository;

    private final

    public SessaoestudoResponseDTO salvar(SessaoEstudoRequestDTO dto) {

        SessaoEstudoEntity sessao = new SessaoEstudoEntity();

        sessao.setTitulo(dto.titulo());
        sessao.setDescricao(dto.descricao());
        sessao.setDataPrazo(dto.dataPrazo());
        sessao.setDuracaoMinutos(dto.duracaoMinutos());
        sessao.setObservacoes(dto.observacoes());

        SessaoEstudoEntity sessaoSalva = sessaoEstudoRepository.save(sessao);

        return new SessaoestudoResponseDTO(
                sessaoSalva.getId(),
                sessaoSalva.getTitulo(),
                sessaoSalva.getDescricao(),
                sessaoSalva.getDataPrazo(),
                sessaoSalva.getDuracaoMinutos(),
                sessaoSalva.getObservacoes()
        );
    }

    public List<SessaoEstudoEntity> listarTodos(){
        return sessaoEstudoRepository.findAll();
    }

    public SessaoEstudoEntity buscarSessaoPorId(Long id){
        return sessaoEstudoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi possível encontrar a sessão desejada"));
    }

    public SessaoEstudoEntity atualizarSessao(Long id, SessaoEstudoEntity novaSessao){
        SessaoEstudoEntity sessaoEstudo = buscarSessaoPorId(id);

        sessaoEstudo.setTitulo(novaSessao.getTitulo());
        sessaoEstudo.setDescricao(novaSessao.getDescricao());
        sessaoEstudo.setDataPrazo(novaSessao.getDataPrazo());
        sessaoEstudo.setDuracaoMinutos(novaSessao.getDuracaoMinutos());
        sessaoEstudo.setObservacoes(novaSessao.getObservacoes());

        return sessaoEstudoRepository.save(sessaoEstudo);

    }

    public void deletarSessao(Long id){
        SessaoEstudoEntity sessaoEstudo = buscarSessaoPorId(id);

        sessaoEstudoRepository.delete(sessaoEstudo);
    }
}
