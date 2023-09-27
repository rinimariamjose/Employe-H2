package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EmployeEntity;
@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Long>{
     List<EmployeEntity> findByNameAndAge(String name,Integer age);
}
