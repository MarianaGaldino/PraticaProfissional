package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.dto.EmprestimoDTO;
import com.mackenzie.demo.repository.EmprestimoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;


    public EmprestimoService(EmprestimoRepository emprestimoRepository) {

        this.emprestimoRepository = emprestimoRepository;
    }

    public Emprestimo efetuarEmprestimo(EmprestimoDTO emprestimoDTO){
        log.info("Try to register emprestimo for name {}", emprestimoDTO.getLeitor());
        return emprestimoRepository.save(emprestimoDTO.mapToEntity());
    }

}
