package com.example.amreth_day14_cw2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day14_cw2.model.AmrethBook;
import com.example.amreth_day14_cw2.repository.AmrethBookRepo;


@Service
public class AmrethBookService {
   @Autowired
   AmrethBookRepo bookRepo;

   public AmrethBook addBook(AmrethBook book)
   {
        return bookRepo.save(book);
   }

   public List<AmrethBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<AmrethBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public AmrethBook updateBook(int id,AmrethBook book)
   {
        AmrethBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
