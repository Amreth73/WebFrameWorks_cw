package com.example.amreth_day13_cw1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day13_cw1.model.AmrethAuthor;
import com.example.amreth_day13_cw1.model.AmrethBook;
import com.example.amreth_day13_cw1.service.AmrethAuthorService;
import com.example.amreth_day13_cw1.service.AmrethBookService;


@RestController
public class AmrethAuthorController {
    @Autowired
    private AmrethAuthorService authorService;
@Autowired
private AmrethBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<AmrethAuthor> createAuthor(@RequestBody AmrethAuthor author) {
        AmrethAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<AmrethBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody AmrethBook book) {
        AmrethBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<AmrethAuthor> getAuthorById(@PathVariable Long authorId) {
        AmrethAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<AmrethAuthor>> getAllAuthors() {
        List<AmrethAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<AmrethAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody AmrethAuthor author) {
        AmrethAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
