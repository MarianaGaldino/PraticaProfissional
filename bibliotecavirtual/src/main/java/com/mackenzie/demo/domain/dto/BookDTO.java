package com.mackenzie.demo.domain.dto;

import com.mackenzie.demo.domain.Autor;
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
    String name;
    Integer páginas;
    Autor autor;
    Editora editora;
}
