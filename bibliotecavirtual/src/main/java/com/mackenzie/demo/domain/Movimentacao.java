package com.mackenzie.demo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "devolucao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Leitor usuario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Book livro;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Autor autor;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Editora editora;

}
