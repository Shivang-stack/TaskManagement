package com.bdiplus.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bdiplus.assignment.entity.Task;

public interface TaskRespository extends JpaRepository<Task,Integer>{
    
}
 