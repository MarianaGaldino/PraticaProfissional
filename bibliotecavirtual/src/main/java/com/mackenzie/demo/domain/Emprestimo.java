package com.mackenzie.demo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Leitor usuario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Book livro ;
    @Column(nullable = false)
    private LocalDate dataEmprestimo;
}
