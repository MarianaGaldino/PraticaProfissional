package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {

}
