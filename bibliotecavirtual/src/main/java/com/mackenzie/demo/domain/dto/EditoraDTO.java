package com.mackenzie.demo.domain.dto;

import com.mackenzie.demo.domain.Editora;
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
public class EditoraDTO {

    private String nome;
    private String cnpj;
    private String email;
    private String telefone;

    public Editora mapToEntity() {
        return Editora.builder()
                .nome(this.nome)
                .telefone(this.telefone)
                .email(this.email)
                .cnpj(this.cnpj)
                .build();
    }
}
