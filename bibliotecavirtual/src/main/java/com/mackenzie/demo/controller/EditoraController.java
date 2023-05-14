package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Editora;
import com.mackenzie.demo.domain.dto.EditoraDTO;
import com.mackenzie.demo.service.EditoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/editora")
public class EditoraController {

    private final EditoraService editoraService;

    public EditoraController(EditoraService editoraService) {
        this.editoraService = editoraService;
    }

    @PostMapping("/create")
    public String registerEditora(EditoraDTO editoraDTO){
        editoraService.registerEditora(editoraDTO);
        return "cadastrar_editora";
    }

    @GetMapping()
    public Optional<Editora> getEditora(@RequestParam Long id){
        return editoraService.getEditora(id);
    }

    @PutMapping()
    public Editora updateEditora(@RequestParam Long id, @RequestBody EditoraDTO editoraDTO){
        return editoraService.updateEditora(id, editoraDTO);
    }

    @DeleteMapping()
    public ResponseEntity deleteEditora(@RequestParam Long id){
        editoraService.deleteEditora(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/home")
    public String teste(){
        return "cadastrar_editora";
    }

}
