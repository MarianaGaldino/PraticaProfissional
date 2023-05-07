package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Devolucao;
import com.mackenzie.demo.domain.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Long> {
}
