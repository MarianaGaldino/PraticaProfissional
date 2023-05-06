package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.dto.BookDTO;
import com.mackenzie.demo.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book registerBook(BookDTO bookDTO){
        log.info("Try to register book for name{}", bookDTO.getName());
        return bookRepository.save(bookDTO);
    }

    public ResponseEntity deleteBook(Long id){
        log.info("Try to delete book for name {}", id);
        return bookRepository.delete(id);
    }

    public Book updateBook(BookDTO bookDTO){
        log.info("Try to update book for name {}", bookDTO.getName());
        return bookRepository.save(bookDTO);
    }

    public Book getBooks(Long id){
        log.info("Try to get books for name {}", id);
        return bookRepository.findAll(id);
    }


}
