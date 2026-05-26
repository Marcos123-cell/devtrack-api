package com.marcos.devtrack.controller;

import com.marcos.devtrack.model.MetaEstudoEntity;
import com.marcos.devtrack.service.MetaEstudoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metas")
@RequiredArgsConstructor
public class MetaEstudoController {

    private final MetaEstudoService metaEstudoService;

    @PostMapping
    public MetaEstudoEntity salvar(@RequestBody MetaEstudoEntity metaEstudo){
        return metaEstudoService.salvar(metaEstudo);
    }

    @GetMapping
    public List<MetaEstudoEntity> listarTodas(){
        return metaEstudoService.listarTodas();
    }

    @GetMapping("/{id}")
    public MetaEstudoEntity procurarPorId(Long id){
        return metaEstudoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public MetaEstudoEntity atualizarMeta(@PathVariable Long id, @RequestBody MetaEstudoEntity novaMeta){
        return metaEstudoService.atualizarMeta(id,novaMeta);
    }
    @DeleteMapping("/{id}")
    public void deletarMeta(@PathVariable Long id){
        metaEstudoService.deletarMeta(id);
    }





}
