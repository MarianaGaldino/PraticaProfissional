package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.LeitorDTO;
import com.mackenzie.demo.service.LeitorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/leitores")
public class LeitorController {

    private final LeitorService leitorService;

    public LeitorController(LeitorService leitorService) {
        this.leitorService = leitorService;
    }

    @GetMapping
    public Optional<Leitor> buscarLeitor(@RequestParam Long id){
        return leitorService.buscarLeitor(id);
    }

    @PostMapping
    public Leitor criarLeitor(@RequestBody LeitorDTO leitorDTO){
        return leitorService.criarLeitor(leitorDTO);
    }

    @PutMapping
    public Leitor editarLeitor(@RequestParam Long id, @RequestBody LeitorDTO leitorDTO ){
        return leitorService.editarLeitor(id, leitorDTO);
    }


    @DeleteMapping
    public ResponseEntity deletarLeitor(@RequestParam Long id){
       leitorService.deletarLeitor(id);
        return ResponseEntity.noContent().build();
    }

}
