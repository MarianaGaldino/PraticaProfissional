package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Autor;
import com.mackenzie.demo.domain.dto.AutorDTO;
import com.mackenzie.demo.repository.AutorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor registerAutor(AutorDTO autorDTO){
        return autorRepository.save(autorDTO);
    }

    public Autor updateAutor(AutorDTO autorDTO){
        return autorRepository.save(autorDTO);
    }

    public ResponseEntity deleteAutor(Long id){
        return autorRepository.delete(id);
    }

    public Autor getAutor(Long id){
        return autorRepository.findAll(id);
    }
}
