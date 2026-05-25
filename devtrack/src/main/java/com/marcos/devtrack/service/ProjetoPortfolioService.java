package com.marcos.devtrack.service;

import com.marcos.devtrack.model.ProjetoPortfolio;
import com.marcos.devtrack.repository.ProjetoPortfolioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetoPortfolioService {

    private final ProjetoPortfolioRepository projetoPortfolioRepository;

    public ProjetoPortfolio salvar(ProjetoPortfolio projetoPortfolio){
        return projetoPortfolioRepository.save(projetoPortfolio);
    }

    public List<ProjetoPortfolio> listarTodos(){
        return projetoPortfolioRepository.findAll();
    }

    public ProjetoPortfolio buscarPorId(Long id){
        return projetoPortfolioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public ProjetoPortfolio atualizar(Long id, ProjetoPortfolio novoProjeto) {
        ProjetoPortfolio projeto = buscarPorId(id);

        projeto.setNome(novoProjeto.getNome());
        projeto.setDescricao(novoProjeto.getDescricao());
        projeto.setStatus(novoProjeto.getStatus());
        projeto.setLinkGithub(novoProjeto.getLinkGithub());
        projeto.setDataInicio(novoProjeto.getDataInicio());
        projeto.setDataConclusao(novoProjeto.getDataConclusao());

        return projetoPortfolioRepository.save(projeto);
    }

    public void deletar(Long id){
        ProjetoPortfolio projetoPortfolio = buscarPorId(id);
        projetoPortfolioRepository.delete(projetoPortfolio);
    }

}
