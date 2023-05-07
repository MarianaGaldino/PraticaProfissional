package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;



public interface LeitorRepository extends JpaRepository<Leitor,Long> {
}
