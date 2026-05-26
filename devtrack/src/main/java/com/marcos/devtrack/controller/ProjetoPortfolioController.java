package com.marcos.devtrack.controller;

import com.marcos.devtrack.model.ProjetoPortfolioEntity;
import com.marcos.devtrack.service.ProjetoPortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
@RequiredArgsConstructor
public class ProjetoPortfolioController {

    private final ProjetoPortfolioService projetoPortfolioService;

    @PostMapping
    public ProjetoPortfolioEntity salvar(@RequestBody ProjetoPortfolioEntity projetoPortfolio) {
        return projetoPortfolioService.salvar(projetoPortfolio);
    }

    @GetMapping
    public List<ProjetoPortfolioEntity> listarTodos() {
        return projetoPortfolioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ProjetoPortfolioEntity buscarPorId(@PathVariable Long id) {
        return projetoPortfolioService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ProjetoPortfolioEntity atualizar(@PathVariable Long id,
                                            @RequestBody ProjetoPortfolioEntity projetoPortfolio) {

        return projetoPortfolioService.atualizar(id, projetoPortfolio);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        projetoPortfolioService.deletar(id);
    }
}
