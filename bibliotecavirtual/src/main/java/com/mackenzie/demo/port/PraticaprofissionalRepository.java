package com.mackenzie.demo.port;

import com.mackenzie.demo.domain.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PraticaprofissionalRepository extends JpaRepository<Leitor,Long> {
}
