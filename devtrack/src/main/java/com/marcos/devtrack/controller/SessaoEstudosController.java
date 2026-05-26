package com.marcos.devtrack.controller;

import com.marcos.devtrack.model.SessaoEstudoEntity;
import com.marcos.devtrack.service.SessaoEstudoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessoes")
@RequiredArgsConstructor

public class SessaoEstudosController {

    private final SessaoEstudoService sessaoEstudoService;

    @PostMapping
    public SessaoEstudoEntity salvar(@RequestBody SessaoEstudoEntity sessaoEstudoEntity){
        return sessaoEstudoService.salvar(sessaoEstudoEntity);
    }

    @GetMapping
    public List<SessaoEstudoEntity> listarTodos(){
        return sessaoEstudoService.listarTodos();
    }

    @GetMapping("/{id}")
    public SessaoEstudoEntity buscarPorId (@PathVariable Long id){
        return sessaoEstudoService.buscarSessaoPorId(id);
    }

    @PutMapping("/{id}")
    public SessaoEstudoEntity atualizarSessao(@PathVariable Long id, @RequestBody SessaoEstudoEntity novaSessao){
        return sessaoEstudoService.atualizarSessao(id,novaSessao);
    }

    @DeleteMapping("/{id}")
    public void deletarSessao(@PathVariable Long id){
        sessaoEstudoService.deletarSessao(id);
    }
}
