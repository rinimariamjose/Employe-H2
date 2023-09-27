package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tbl_employe")
public class EmployeEntity {
     @Id
     @GeneratedValue
    private Long id;
    private String name;
    private Integer age;

}
