package com.example.day6cw3.service;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.AmrethProduct;
import com.example.day6cw3.repository.AmrethProductRepo;


@Service
public class AmrethProductService {
    public AmrethProductRepo productRepo;
    public AmrethProductService(AmrethProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AmrethProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AmrethProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AmrethProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AmrethProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

