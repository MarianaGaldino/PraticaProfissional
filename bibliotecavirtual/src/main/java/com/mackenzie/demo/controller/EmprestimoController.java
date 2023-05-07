package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.dto.EmprestimoDTO;
import com.mackenzie.demo.service.EmprestimoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping
    public Emprestimo criarEmprestimo(@RequestBody EmprestimoDTO emprestimoDTO){
        return emprestimoService.criarEmprestimo(emprestimoDTO);
    }
}
