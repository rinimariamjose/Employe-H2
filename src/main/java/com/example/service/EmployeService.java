package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmployeEntity;
import com.example.repository.EmployeRepository;
@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;
    
    public EmployeEntity create(EmployeEntity employe) {
        return employeRepository.save(employe);
    }

    public List<EmployeEntity> get(){
        return employeRepository.findAll();
    }

    public List<EmployeEntity> getNameAndAge(String name,Integer age){
        return employeRepository.findByNameAndAge(name,age);
    }

}
