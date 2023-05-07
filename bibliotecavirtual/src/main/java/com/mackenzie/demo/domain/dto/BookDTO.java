package com.mackenzie.demo.domain.dto;

import com.mackenzie.demo.domain.Autor;
import com.mackenzie.demo.domain.Book;
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
public class BookDTO {

    String titulo;
    Integer ano;
    Autor autor;
    Editora editora;

    public Book mapToEntity() {
        return Book.builder()
                .titulo(this.titulo)
                .ano(this.ano)
                .autor(this.autor)
                .editora(this.editora)
                .build();
    }
}
