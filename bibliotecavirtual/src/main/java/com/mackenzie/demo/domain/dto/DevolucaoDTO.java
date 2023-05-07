package com.mackenzie.demo.domain.dto;


import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Emprestimo;
import com.mackenzie.demo.domain.Leitor;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DevolucaoDTO {

    private Long id;
    private Leitor leitor;

    private Book livro;

    private LocalDate dataDevolucao;


    public Devolucao mapToEntity() {
        return Devolucao.builder()
                .id(this.id)
                .usuario(this.leitor)
                .livro(this.livro)
                .dataDevolucao(this.dataDevolucao)
                .build();
    }
}
