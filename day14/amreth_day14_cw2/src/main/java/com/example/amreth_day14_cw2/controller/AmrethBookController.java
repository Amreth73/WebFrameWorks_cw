package com.example.amreth_day14_cw2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day14_cw2.model.AmrethBook;
import com.example.amreth_day14_cw2.service.AmrethBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class AmrethBookController {
    @Autowired
    AmrethBookService bookService;

    @PostMapping("/api/book")
    public AmrethBook addBook(@RequestBody AmrethBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public AmrethBook updateBook(@PathVariable int id,@RequestBody AmrethBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<AmrethBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<AmrethBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
