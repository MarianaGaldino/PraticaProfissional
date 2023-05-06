package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Editora;
import com.mackenzie.demo.domain.dto.EditoraDTO;
import com.mackenzie.demo.repository.EditoraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EditoraService {

    private final EditoraRepository editoraRepository;

    public EditoraService(EditoraRepository editoraRepository) {
        this.editoraRepository = editoraRepository;
    }

    public Editora registerEditora(EditoraDTO editoraDTO){
        return editoraRepository.save(editoraDTO);
    }

    public Editora getEditora(Long id){
        return editoraRepository.findAll(id);
    }

    public Editora updateEditora(EditoraDTO editoraDTO){
        return editoraRepository.save(editoraDTO);
    }

    public ResponseEntity deleteEditora(Long id){
        return editoraRepository.delete(id);
    }
}

