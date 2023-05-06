package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Editora;
import com.mackenzie.demo.domain.dto.EditoraDTO;
import com.mackenzie.demo.service.EditoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editora")
public class EditoraController {

    private final EditoraService editoraService;

    public EditoraController(EditoraService editoraService) {
        this.editoraService = editoraService;
    }

    @PostMapping()
    public Editora registerEditora(@RequestBody EditoraDTO editoraDTO){
        return editoraService.registerEditora(editoraDTO);
    }

    @GetMapping()
    public Editora getEditora(@RequestParam Long id){
        return editoraService.getEditora(id);
    }

    @PutMapping()
    public Editora updateEditora(@RequestBody EditoraDTO editoraDTO){
        return editoraService.updateEditora(editoraDTO);
    }

    @DeleteMapping()
    public ResponseEntity deleteEditora(@RequestParam Long id){
        return  editoraService.deleteEditora(id);
    }
}
