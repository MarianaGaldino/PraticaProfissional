package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Autor;
import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.AutorDTO;
import com.mackenzie.demo.service.AutorService;
import jakarta.jws.WebParam;
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
@RequestMapping("/autor")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping("/create")
    public String registerAutor(AutorDTO autorDTO){
        autorService.registerAutor(autorDTO);
        return "cadastrar_autores";
    }

    @GetMapping("/buscar/{id}")
    public ModelAndView getAutor(@PathVariable Long id){

        Optional<Autor> autor = autorService.getAutor(id);

        ModelAndView modelAndView = new ModelAndView("buscar_autor");
        modelAndView.addObject("autor", autor.orElse(null));
        return modelAndView;
    }

    @DeleteMapping()
    public ResponseEntity deleteAutor(@RequestParam Long id ){
        autorService.deleteAutor(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping()
    public Autor updateAutor(@RequestParam Long id, @RequestBody AutorDTO autorDTO){
        return autorService.updateAutor(id, autorDTO);
    }

    @GetMapping("/create")
    public String teste(){
        return "cadastrar_autores";
    }

}
