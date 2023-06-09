package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.dto.BookDTO;
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
import org.springframework.web.servlet.ModelAndView;

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
    @GetMapping("/create")
    public ModelAndView teste(){
        ModelAndView modelAndView = new ModelAndView("efetuar_devolucoes");
        modelAndView.addObject("devolucaoDTO", new DevolucaoDTO());
        return modelAndView;
    }
}
