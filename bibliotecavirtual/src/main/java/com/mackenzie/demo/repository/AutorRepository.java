package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {
}
