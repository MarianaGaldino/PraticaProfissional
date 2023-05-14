package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.dto.BookDTO;
import com.mackenzie.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/create")
    public String registerBook(BookDTO bookDTO){
        bookService.registerBook(bookDTO);
        return "cadastro_de_livros";
    }

    @GetMapping()
    public Optional<Book> getBooks(@RequestParam Long id){
        return bookService.getBooks(id);
    }

    @PutMapping
    public Book updateBook(@RequestParam Long id, @RequestBody BookDTO bookDTO){
        return bookService.updateBook(id, bookDTO);
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@RequestParam Long id){
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/home")
    public String teste(){
        return "cadastro_de_livros";
    }
}
