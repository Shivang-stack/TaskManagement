package com.bdiplus.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bdiplus.assignment.entity.Task;
import com.bdiplus.assignment.service.TaskService;

@RestController
public class TaskController {
    
    @Autowired
    private TaskService service;

    @PostMapping("/addtask")
    public Task addTask(@RequestBody Task task){
        return service.createTask(task);
    }

    @GetMapping("/tasks")
    public List<Task> findAllTasks(){
        return service.getTasks();
    }

    @GetMapping("/task/{id}")
    public Task findTaskById(@PathVariable int id){
        return service.getTaskById(id);
    }

    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id){
        return service.deleteTask(id);
    }

}
