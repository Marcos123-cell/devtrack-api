package com.marcos.devtrack.service;

import com.marcos.devtrack.model.ProjetoPortfolioEntity;
import com.marcos.devtrack.repository.ProjetoPortfolioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetoPortfolioService {

    private final ProjetoPortfolioRepository projetoPortfolioRepository;

    public ProjetoPortfolioEntity salvar(ProjetoPortfolioEntity projetoPortfolio){
        return projetoPortfolioRepository.save(projetoPortfolio);
    }

    public List<ProjetoPortfolioEntity> listarTodos(){
        return projetoPortfolioRepository.findAll();
    }

    public ProjetoPortfolioEntity buscarPorId(Long id){
        return projetoPortfolioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public ProjetoPortfolioEntity atualizar(Long id, ProjetoPortfolioEntity novoProjeto) {
        ProjetoPortfolioEntity projeto = buscarPorId(id);

        projeto.setNome(novoProjeto.getNome());
        projeto.setDescricao(novoProjeto.getDescricao());
        projeto.setStatus(novoProjeto.getStatus());
        projeto.setLinkGithub(novoProjeto.getLinkGithub());
        projeto.setDataInicio(novoProjeto.getDataInicio());
        projeto.setDataConclusao(novoProjeto.getDataConclusao());
        projeto.setTecnologias(novoProjeto.getTecnologias());

        return projetoPortfolioRepository.save(projeto);
    }

    public void deletar(Long id){
        ProjetoPortfolioEntity projetoPortfolio = buscarPorId(id);
        projetoPortfolioRepository.delete(projetoPortfolio);
    }

}
