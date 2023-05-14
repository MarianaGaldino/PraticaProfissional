package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Autor;
import com.mackenzie.demo.domain.dto.AutorDTO;
import com.mackenzie.demo.repository.AutorRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor registerAutor(AutorDTO autorDTO){
        log.info("Try to register autor for name {}", autorDTO.getNome());
        return autorRepository.save(autorDTO.mapToEntity());

    }

    public Autor updateAutor(Long id, AutorDTO autorDTO){
        log.info("Try to update autor for name {}", autorDTO.getNome());
        Optional<Autor> autor = autorRepository.findById(id);
        Autor autorToSave = autor.get();

        return autorRepository.save(updateParams(autorToSave, autorDTO));

    }


    public void deleteAutor(Long id){
        log.info("Try to delete autor for id{}", id);
       autorRepository.deleteById(id);

    }

    public Optional<Autor> getAutor(Long id){
        log.info("Try to get autor for id {}", id);
       return autorRepository.findById(id);

    }

    private Autor updateParams(Autor autor, AutorDTO autorDTO){
        autor.setNome(autorDTO.getNome());
        autor.setDataNascimento(autorDTO.getDataNascimento());
        return autor;

    }

}
