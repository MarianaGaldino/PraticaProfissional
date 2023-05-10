package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Movimentacao;
import com.mackenzie.demo.service.MovimentacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    private final MovimentacaoService movimentacaoService;

    public MovimentacaoController(MovimentacaoService movimentacaoService) {
        this.movimentacaoService = movimentacaoService;
    }

    @GetMapping
    public Movimentacao consultarMovimentacao(){
        return movimentacaoService.consultarMovimentacao();
    }
}
