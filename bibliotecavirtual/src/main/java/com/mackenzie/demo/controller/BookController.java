package com.mackenzie.demo.controller;

import com.mackenzie.demo.domain.Book;
import com.mackenzie.demo.domain.Leitor;
import com.mackenzie.demo.domain.dto.BookDTO;
import com.mackenzie.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/buscar/{id}")
    public ModelAndView getBooks(@PathVariable Long id){
        Optional<Book> book = bookService.getBooks(id);

        ModelAndView modelAndView = new ModelAndView("buscar_livro");
        modelAndView.addObject("book", book.orElse(null));
        return modelAndView;
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
    @GetMapping("/create")
    public ModelAndView teste(){
        ModelAndView modelAndView = new ModelAndView("cadastro_de_livros");
        modelAndView.addObject("bookDTO", new BookDTO());
        return modelAndView;
    }
}
