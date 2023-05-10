package com.mackenzie.demo.domain.dto;


import java.time.LocalDate;

import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.Leitor;
import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmprestimoDTO {


    private Leitor leitor;

    private Book livro;

    private LocalDate dataEmprestimo;


    public Emprestimo mapToEntity() {
        return Emprestimo.builder()
                .usuario(this.leitor)
                .livro(this.livro)
                .dataEmprestimo(this.dataEmprestimo)
                .build();
    }
}
