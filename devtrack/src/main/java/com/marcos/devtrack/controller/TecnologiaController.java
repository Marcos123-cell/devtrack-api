package com.marcos.devtrack.controller;

import com.marcos.devtrack.model.TecnologiaEntity;
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
    public TecnologiaEntity salvar(@RequestBody TecnologiaEntity tecnologia) {
        return tecnologiaService.salvar(tecnologia);
    }

    @GetMapping
    public List<TecnologiaEntity> listarTodas() {
        return tecnologiaService.listarTodas();
    }

    @GetMapping("/{id}")
    public TecnologiaEntity buscarPorId(@PathVariable Long id) {
        return tecnologiaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public TecnologiaEntity atualizar(@PathVariable Long id, @RequestBody TecnologiaEntity tecnologia) {
        return tecnologiaService.atualizar(id, tecnologia);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tecnologiaService.deletar(id);
    }
}
