package com.mackenzie.demo.domain;


import lombok.*;

import java.util.List;


@Data
public class Movimentacao {

    private List<Devolucao> devoluções;
    private List<Emprestimo> emprestimos;

}
