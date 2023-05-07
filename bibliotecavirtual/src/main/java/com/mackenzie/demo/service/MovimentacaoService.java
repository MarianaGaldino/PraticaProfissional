package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Movimentacao;
import com.mackenzie.demo.domain.dto.DevolucaoDTO;
import com.mackenzie.demo.domain.dto.MovimentacaoDTO;
import com.mackenzie.demo.repository.DevolucaoRepository;
import com.mackenzie.demo.repository.MovimentacaoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovimentacaoService {
    private final MovimentacaoRepository movimentacaoRepository;


    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {

        this.movimentacaoRepository = movimentacaoRepository;
    }

    public List<Movimentacao> consultarMovimentacao(){
        log.info("Consulta de Movimentações");
        return movimentacaoRepository.findAll();
    }
}
