package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Autor;
import com.mackenzie.demo.domain.dto.AutorDTO;
import com.mackenzie.demo.service.AutorService;
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
@RequestMapping("/autor")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping()
    public Autor registerAutor(@RequestBody AutorDTO autorDTO){
        return autorService.registerAutor(autorDTO);
    }

    @GetMapping()
    public Autor getAutor(@RequestParam Long id){
        return autorService.getAutor(id);
    }

    @DeleteMapping()
    public ResponseEntity deleteAutor(@RequestParam Long id ){
        return autorService.deleteAutor(id);
    }

    @PutMapping()
    public Autor updateAutor(@RequestBody AutorDTO autorDTO){
        return autorService.updateAutor(autorDTO);
    }

}
