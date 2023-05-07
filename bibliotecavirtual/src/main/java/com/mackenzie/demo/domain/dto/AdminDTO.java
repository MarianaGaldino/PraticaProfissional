package com.mackenzie.demo.domain.dto;

import com.mackenzie.demo.domain.Admin;
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
public class AdminDTO {
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Admin mapToEntity() {
        return Admin.builder()
                .nome(this.nome)
                .telefone(this.telefone)
                .email(this.email)
                .senha(this.senha)
                .build();
    }
}
