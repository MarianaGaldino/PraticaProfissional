package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.dto.DevolucaoDTO;
import com.mackenzie.demo.domain.dto.EmprestimoDTO;
import com.mackenzie.demo.repository.DevolucaoRepository;
import com.mackenzie.demo.repository.EmprestimoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DevolucaoService {
    private final DevolucaoRepository devolucaoRepository;


    public DevolucaoService(DevolucaoRepository devolucaoRepository) {

        this.devolucaoRepository = devolucaoRepository;
    }

    public Devolucao efetuarDevolucao(DevolucaoDTO devolucaoDTO){
        log.info("Try to register Devolucao for name {}", devolucaoDTO.getLeitor());
        return devolucaoRepository.save(devolucaoDTO.mapToEntity());
    }

}
