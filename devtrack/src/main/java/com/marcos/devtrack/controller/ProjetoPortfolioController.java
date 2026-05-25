package com.marcos.devtrack.controller;

import com.marcos.devtrack.model.ProjetoPortfolio;
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
    public ProjetoPortfolio salvar(@RequestBody ProjetoPortfolio projetoPortfolio) {
        return projetoPortfolioService.salvar(projetoPortfolio);
    }

    @GetMapping
    public List<ProjetoPortfolio> listarTodos() {
        return projetoPortfolioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ProjetoPortfolio buscarPorId(@PathVariable Long id) {
        return projetoPortfolioService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ProjetoPortfolio atualizar(@PathVariable Long id,
                                      @RequestBody ProjetoPortfolio projetoPortfolio) {

        return projetoPortfolioService.atualizar(id, projetoPortfolio);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        projetoPortfolioService.deletar(id);
    }
}
