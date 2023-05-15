package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.dto.DevolucaoDTO;
import com.mackenzie.demo.domain.dto.EmprestimoDTO;
import com.mackenzie.demo.service.EmprestimoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emprestimo")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping("/create")
    public String efetuarEmprestimo(EmprestimoDTO emprestimoDTO){
        emprestimoService.efetuarEmprestimo(emprestimoDTO);
        return "efetuar_emprestimos";
    }
    @GetMapping("/home")
    public ModelAndView teste(){
        ModelAndView modelAndView = new ModelAndView("efetuar_emprestimos");
        modelAndView.addObject("emprestimoDTO", new EmprestimoDTO());
        return modelAndView;
    }
}
