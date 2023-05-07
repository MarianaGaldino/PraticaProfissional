package com.mackenzie.demo.domain.dto;


import com.mackenzie.demo.domain.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovimentacaoDTO {

    private Long id;
    private Leitor leitor;

    private Book livro;

    private Editora editora;


    public Movimentacao mapToEntity() {
        return Movimentacao.builder()
                .id(this.id)
                .usuario(this.leitor)
                .livro(this.livro)
                .editora(this.editora)
                .build();
    }
}
