package com.mackenzie.demo.domain.dto;


import com.mackenzie.demo.domain.Leitor;
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
public class LeitorDTO {


    private String nome;
    private Integer telefone;
    private String email;
    private String senha;

    public Leitor mapToEntity() {
        return Leitor.builder()
                .nome(this.nome)
                .telefone(this.telefone)
                .email(this.email)
                .senha(this.senha)
                .build();
    }
}
