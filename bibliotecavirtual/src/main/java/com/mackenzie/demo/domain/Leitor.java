package com.mackenzie.demo.domain;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Leitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;

}