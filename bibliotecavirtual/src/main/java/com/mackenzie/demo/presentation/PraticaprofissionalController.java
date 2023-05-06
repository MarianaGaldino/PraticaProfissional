package com.mackenzie.demo.presentation;

import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.port.PraticaprofissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leitores")
public class PraticaprofissionalController {

    @Autowired
    private PraticaprofissionalRepository repository;

    @GetMapping
    public List<Leitor> buscarLeitor(){
        return repository.findAll();
    }

    @PostMapping
    public Leitor criarLeitor(@RequestBody Leitor leitor){
        return repository.save(leitor);
    }

    @PutMapping
    public Leitor editarLeitor(@RequestBody Leitor leitor){
        if (leitor.getId()>0)
            return repository.save(leitor);
        return null;
    }


    @DeleteMapping
    public String deletarLeitor(@RequestBody Leitor leitor){
        if (leitor.getId()>0) {
            repository.delete(leitor);
            return "Removido com sucesso";
        }
        return "Uusário não encontrado";
    }

}
