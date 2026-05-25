package com.marcos.devtrack.controller;

import com.marcos.devtrack.model.Tecnologia;
import com.marcos.devtrack.service.TecnologiaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tecnologias")
@RequiredArgsConstructor
public class TecnologiaController {

    private final TecnologiaService tecnologiaService;

    @PostMapping
    public Tecnologia salvar(@RequestBody Tecnologia tecnologia) {
        return tecnologiaService.salvar(tecnologia);
    }

    @GetMapping
    public List<Tecnologia> listarTodas() {
        return tecnologiaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Tecnologia buscarPorId(@PathVariable Long id) {
        return tecnologiaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Tecnologia atualizar(@PathVariable Long id, @RequestBody Tecnologia tecnologia) {
        return tecnologiaService.atualizar(id, tecnologia);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tecnologiaService.deletar(id);
    }
}
