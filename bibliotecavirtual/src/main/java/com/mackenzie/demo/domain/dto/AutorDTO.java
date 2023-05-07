package com.mackenzie.demo.domain.dto;

import com.mackenzie.demo.domain.Admin;
import com.mackenzie.demo.domain.Autor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {

    private String nome;
    private String dataNascimento;


    public Autor mapToEntity() {
        return Autor.builder()
                .nome(this.nome)
                .dataNascimento(this.dataNascimento)
                .build();
    }
}
