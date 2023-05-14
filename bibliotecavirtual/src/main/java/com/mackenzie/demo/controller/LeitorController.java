package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.LeitorDTO;
import com.mackenzie.demo.service.LeitorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
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

    @PostMapping("/create")
    public String criarLeitor(LeitorDTO leitorDTO){
        leitorService.criarLeitor(leitorDTO);
        return "cadastrar_leitores";
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

    @GetMapping("/home")
    public String teste(){
        return "cadastrar_leitores";
    }

}
