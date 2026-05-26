package com.marcos.devtrack.service;

import com.marcos.devtrack.model.MetaEstudoEntity;
import com.marcos.devtrack.repository.MetaEstudoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetaEstudoService {

    private final MetaEstudoRepository metaEstudoRepository;

    public MetaEstudoEntity salvar(MetaEstudoEntity metaEstudo){
        return metaEstudoRepository.save(metaEstudo);
    }

    public List<MetaEstudoEntity> listarTodas(){
        return metaEstudoRepository.findAll();
    }

    public MetaEstudoEntity buscarPorId(Long id){
        return metaEstudoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi possível"));
    }

    public MetaEstudoEntity atualizarMeta(Long id, MetaEstudoEntity metaNova){
        MetaEstudoEntity meta = buscarPorId(id);

        meta.setTitulo(metaNova.getTitulo());
        meta.setDescricao(metaNova.getDescricao());
        meta.setStatus(metaNova.getStatus());
        meta.setDataCriacao(metaNova.getDataCriacao());
        meta.setDataPrazo(metaNova.getDataPrazo());

        return metaEstudoRepository.save(meta);


    }

    public void deletarMeta(Long id){
       MetaEstudoEntity meta = buscarPorId(id);

       metaEstudoRepository.delete(meta);
    }

}
