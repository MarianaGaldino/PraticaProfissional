package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.LeitorDTO;
import com.mackenzie.demo.repository.LeitorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Slf4j
public class LeitorService {

    private final LeitorRepository leitorRepository;


    public LeitorService(LeitorRepository leitorRepository) {

        this.leitorRepository = leitorRepository;
    }

    public Optional<Leitor> buscarLeitor(Long id){
        log.info("Try to get leitor for id {}", id);
        return leitorRepository.findById(id);
    }

    public Leitor criarLeitor(LeitorDTO leitorDTO){
        log.info("Try to register leitor for name {}", leitorDTO.getNome());
        return leitorRepository.save(leitorDTO.mapToEntity());
    }

    public void deletarLeitor(Long id){
        log.info("Try to delete leitor for id {}", id);
         leitorRepository.deleteById(id);
    }

    public Leitor editarLeitor(LeitorDTO leitorDTO){
        log.info("Try to update leitor for name {}", leitorDTO.getNome());
        return leitorRepository.save(leitorDTO.mapToEntity());
    }
}

