package com.bdiplus.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TASK_TBL")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String task_name;
    private String description;
    private boolean compeleted;    
}
