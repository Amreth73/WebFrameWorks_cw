package com.example.amreth_day13_cw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day13_cw1.model.AmrethAuthor;
import com.example.amreth_day13_cw1.model.AmrethBook;
import com.example.amreth_day13_cw1.repository.AmrethAuthorRepository;
import com.example.amreth_day13_cw1.repository.AmrethBookRepository;


@Service
public class AmrethBookService {
    @Autowired
    private AmrethBookRepository bookRepository;
@Autowired
private AmrethAuthorRepository authorRepository;
    public AmrethBook saveBook(Long authorId, AmrethBook book) {
        AmrethAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AmrethBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

