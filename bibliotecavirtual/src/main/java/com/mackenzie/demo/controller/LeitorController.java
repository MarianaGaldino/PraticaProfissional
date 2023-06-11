package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.LeitorDTO;
import com.mackenzie.demo.service.LeitorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/leitores")
public class LeitorController {

    private final LeitorService leitorService;

    public LeitorController(LeitorService leitorService) {
        this.leitorService = leitorService;
    }

    @GetMapping("/buscar/{id}")
    public ModelAndView buscarLeitor(@PathVariable("id") Long id){

        Optional<Leitor> leitor = leitorService.buscarLeitor(id);

        ModelAndView modelAndView = new ModelAndView("buscar_leitor");
        modelAndView.addObject("leitor", leitor.orElse(null));
        return modelAndView;

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

    @GetMapping("/create")
    public String teste(){
        return "cadastrar_leitores";
    }

}
