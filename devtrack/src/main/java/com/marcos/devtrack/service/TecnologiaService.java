package com.marcos.devtrack.service;

import com.marcos.devtrack.model.Tecnologia;
import com.marcos.devtrack.repository.TecnologiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TecnologiaService {
    private final TecnologiaRepository tecnologiaRepository;

    public Tecnologia salvar(Tecnologia tecnologia){
        return tecnologiaRepository.save(tecnologia);
    }

    public List<Tecnologia> listarTodas(){
        return tecnologiaRepository.findAll();
    }

    public Tecnologia buscarPorId(Long id) {
        return tecnologiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tecnologia não encontrada"));
    }

    public Tecnologia atualizar(Long id, Tecnologia novaTecnologia) {
        Tecnologia tecnologia = buscarPorId(id);

        tecnologia.setNome(novaTecnologia.getNome());
        tecnologia.setCategoria(novaTecnologia.getCategoria());
        tecnologia.setNivel(novaTecnologia.getNivel());
        tecnologia.setDescricao(novaTecnologia.getDescricao());

        return tecnologiaRepository.save(tecnologia);
    }

    public void deletar(Long id) {
        Tecnologia tecnologia = buscarPorId(id);
        tecnologiaRepository.delete(tecnologia);
    }

}
