package com.mackenzie.demo.service;

import com.mackenzie.demo.domain.Admin;
import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.dto.AdminDTO;
import com.mackenzie.demo.domain.dto.BookDTO;
import com.mackenzie.demo.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book registerBook(BookDTO bookDTO){
        log.info("Try to register book for name{}", bookDTO.getTitulo());
        return bookRepository.save(bookDTO.mapToEntity());

    }

    public void deleteBook(Long id){
        log.info("Try to delete book for name {}", id);
        bookRepository.deleteById(id);

    }

    public Book updateBook(Long id, BookDTO bookDTO){
        log.info("Try to update book for name {}", bookDTO.getTitulo());
        Optional<Book> book = bookRepository.findById(id);
        Book bookToSave = book.get();

        return bookRepository.save(updateParams(bookToSave, bookDTO));
    }

    public Optional<Book> getBooks(Long id){
        log.info("Try to get books for name {}", id);
        return bookRepository.findById(id);

    }

    private Book updateParams(Book book, BookDTO bookDTO){
        book.setTitulo(bookDTO.getTitulo());
        book.setAno(bookDTO.getAno());
        book.setAutor(bookDTO.getAutor());
        book.setEditora(bookDTO.getEditora());

        return book;

    }



}
