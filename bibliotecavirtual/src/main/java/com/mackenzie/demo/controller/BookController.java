package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.dto.BookDTO;
import com.mackenzie.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;


    @PostMapping()
    public Book registerBook(@RequestBody BookDTO bookDTO){
        return bookService.registerBook(bookDTO);
    }

    @GetMapping()
    public Book getBooks(@RequestParam Long id){
        return bookService.getBooks(id);
    }

    @PutMapping
    public Book updateBook(@RequestBody BookDTO bookDTO){
        return bookService.updateBook(bookDTO);
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@RequestParam Long id){
        return bookService.deleteBook(id);
    }
}