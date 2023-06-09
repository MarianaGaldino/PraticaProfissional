package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Devolucao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevolucaoRepository extends JpaRepository<Devolucao,Long> {

}
