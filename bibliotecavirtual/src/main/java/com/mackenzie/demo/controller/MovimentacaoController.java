package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.repository.DevolucaoRepository;
import com.mackenzie.demo.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    @Autowired
    private DevolucaoRepository devolucaoRepository;

    @Autowired
    private EmprestimoRepository emprestimoRepository;


    @GetMapping("/buscar")
    public ModelAndView teste(){

        List<Emprestimo> emprestimo = emprestimoRepository.findAll();
        List<Devolucao> devolucao = devolucaoRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("movimentacoes");
        modelAndView.addObject("emprestimo", emprestimo);
        modelAndView.addObject("devolucao", devolucao);
        return modelAndView;
    }
}
