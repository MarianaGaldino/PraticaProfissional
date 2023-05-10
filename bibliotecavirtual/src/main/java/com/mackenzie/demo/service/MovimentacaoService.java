package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.Movimentacao;
import com.mackenzie.demo.repository.DevolucaoRepository;
import com.mackenzie.demo.repository.EmprestimoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovimentacaoService {

    private final DevolucaoRepository devolucaoRepository;
    private final EmprestimoRepository emprestimoRepository;

    public MovimentacaoService(DevolucaoRepository devolucaoRepository, EmprestimoRepository emprestimoRepository) {

        this.devolucaoRepository = devolucaoRepository;
        this.emprestimoRepository = emprestimoRepository;
    }

    public Movimentacao consultarMovimentacao(){
        log.info("Tentando Consultar as Movimentações");
        List<Devolucao> devolucoes = devolucaoRepository.findAll();
        List<Emprestimo> emprestimos = emprestimoRepository.findAll();

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setDevoluções(devolucoes);
        movimentacao.setEmprestimos(emprestimos);

        return movimentacao;
    }
}
