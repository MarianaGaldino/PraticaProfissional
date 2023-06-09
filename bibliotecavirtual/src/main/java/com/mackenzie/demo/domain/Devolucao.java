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
public class Devolucao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Leitor usuario;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Book livro ;

    @Column(nullable = false)
    private LocalDate dataDevolucao;

    @Override
    public String toString(){
        return "Devolucao{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", livro=" + livro +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
