package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Editora;
import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.EditoraDTO;
import com.mackenzie.demo.service.EditoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/buscar/{id}")
    public ModelAndView getEditora(@PathVariable Long id){
        Optional<Editora> editora = editoraService.getEditora(id);

        ModelAndView modelAndView = new ModelAndView("buscar_editora");
        modelAndView.addObject("editora", editora.orElse(null));
        return modelAndView;
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

    @GetMapping("/create")
    public String teste(){
        return "cadastrar_editora";
    }

}
