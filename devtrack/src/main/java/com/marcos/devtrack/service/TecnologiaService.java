package com.marcos.devtrack.service;

import com.marcos.devtrack.model.TecnologiaEntity;
import com.marcos.devtrack.repository.TecnologiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TecnologiaService {
    private final TecnologiaRepository tecnologiaRepository;

    public TecnologiaEntity salvar(TecnologiaEntity tecnologia){
        return tecnologiaRepository.save(tecnologia);
    }

    public List<TecnologiaEntity> listarTodas(){
        return tecnologiaRepository.findAll();
    }

    public TecnologiaEntity buscarPorId(Long id) {
        return tecnologiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tecnologia não encontrada"));
    }

    public TecnologiaEntity atualizar(Long id, TecnologiaEntity novaTecnologia) {
        TecnologiaEntity tecnologia = buscarPorId(id);

        tecnologia.setNome(novaTecnologia.getNome());
        tecnologia.setCategoria(novaTecnologia.getCategoria());
        tecnologia.setNivel(novaTecnologia.getNivel());
        tecnologia.setDescricao(novaTecnologia.getDescricao());

        return tecnologiaRepository.save(tecnologia);
    }

    public void deletar(Long id) {
        TecnologiaEntity tecnologia = buscarPorId(id);
        tecnologiaRepository.delete(tecnologia);
    }

}
