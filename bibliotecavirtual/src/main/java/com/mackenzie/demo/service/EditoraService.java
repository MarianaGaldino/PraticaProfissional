package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Editora;
import com.mackenzie.demo.domain.dto.EditoraDTO;
import com.mackenzie.demo.repository.EditoraRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class EditoraService {

    private final EditoraRepository editoraRepository;

    public EditoraService(EditoraRepository editoraRepository) {
        this.editoraRepository = editoraRepository;
    }

    public Editora registerEditora(EditoraDTO editoraDTO){
        log.info("Try to register editora for name {}", editoraDTO.getNome());
       return editoraRepository.save(editoraDTO.mapToEntity());

    }

    public Optional<Editora> getEditora(Long id){
        log.info("Try to get editora for id  {}", id);
        return editoraRepository.findById(id);

    }

    public Editora updateEditora(EditoraDTO editoraDTO){
        log.info("Try to update editora for name {}", editoraDTO.getNome());
        return editoraRepository.save(editoraDTO.mapToEntity());

    }

    public void deleteEditora(Long id){
        log.info("Try to delete editora for id  {}", id);
        editoraRepository.deleteById(id);
    }
}

