package com.mackenzie.demo.repository;

import com.mackenzie.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository <Book, Long> {
}
