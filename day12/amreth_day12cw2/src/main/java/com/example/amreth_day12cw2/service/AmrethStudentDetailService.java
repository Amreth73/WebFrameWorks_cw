package com.example.amreth_day12cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day12cw2.model.AmrethStudentDetail;
import com.example.amreth_day12cw2.repository.AmrethStudentDetailRepository;
import com.example.amreth_day12cw2.repository.AmrethStudentRepository;


@Service
public class AmrethStudentDetailService {
    @Autowired
    AmrethStudentDetailRepository studentDetailRepository;
    @Autowired
    AmrethStudentRepository studentRepository;
    public AmrethStudentDetail addStudentDetail(int id,AmrethStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
