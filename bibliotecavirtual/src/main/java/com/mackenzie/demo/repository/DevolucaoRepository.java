package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Devolucao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevolucaoRepository extends JpaRepository<Devolucao,Long> {
}
