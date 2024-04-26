package com.example.amreth_day13_cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day13_cw1.model.AmrethAuthor;
import com.example.amreth_day13_cw1.repository.AmrethAuthorRepository;


@Service
public class AmrethAuthorService {
    @Autowired
    private AmrethAuthorRepository authorRepository;

    public AmrethAuthor saveAuthor(AmrethAuthor author) {
        return authorRepository.save(author);
    }

    public AmrethAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AmrethAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AmrethAuthor updateAuthor(Long id, AmrethAuthor author) {
        AmrethAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
