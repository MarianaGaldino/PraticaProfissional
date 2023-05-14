package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.dto.DevolucaoDTO;
import com.mackenzie.demo.domain.dto.EmprestimoDTO;
import com.mackenzie.demo.service.DevolucaoService;
import com.mackenzie.demo.service.EmprestimoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/devolucao")
public class DevolucaoController {
    private final DevolucaoService devolucaoService;

    public DevolucaoController(DevolucaoService devolucaoService) {
        this.devolucaoService = devolucaoService;
    }

    @PostMapping("/create")
    public String efetuarDevolucao(DevolucaoDTO devolucaoDTO){
        devolucaoService.efetuarDevolucao(devolucaoDTO);
        return "efetuar_devolucoes";
    }
    @GetMapping("/home")
    public String teste(){
        return "efetuar_devolucoes";
    }
}
