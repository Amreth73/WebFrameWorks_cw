package com.example.amreth_day11cw1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amreth_day11cw1.modal.AmrethStudent;
import com.example.amreth_day11cw1.modal.AmrethStudentInfo;
import com.example.amreth_day11cw1.repository.AmrethStudentInfoRepository;
import com.example.amreth_day11cw1.repository.AmrethStudentRepository;


@Service
public class AmrethStudentService {
    public AmrethStudentRepository studentRepository;
    public AmrethStudentInfoRepository studentInfoRepository;
    public AmrethStudentService(AmrethStudentRepository studentRepository,AmrethStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AmrethStudent saveStudent(AmrethStudent student)
    {
        return studentRepository.save(student);
    }
    public AmrethStudentInfo saveStudentInfo(AmrethStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AmrethStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
