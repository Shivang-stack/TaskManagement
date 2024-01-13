package com.bdiplus.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdiplus.assignment.entity.Task;
import com.bdiplus.assignment.repository.TaskRespository;
import java.util.List;
@Service
public class TaskService {
    @Autowired
    private TaskRespository respository;

    //save a task
    public Task createTask(Task task){
        return respository.save(task);
    }

    public List<Task> getTasks(){
        return respository.findAll();
    }

    public Task getTaskById(int id){
        return respository.findById(id).orElse(null);
    }

    public String deleteTask(int id){
        respository.deleteById(id);
        return "task removed";
    }

    public Task updateTask(Task task){
        Task existingTask=respository.findById(task.getId()).orElse(null);
        existingTask.setTask_name(task.getTask_name());
        existingTask.setDescription(task.getDescription());
        existingTask.setCompeleted(task.isCompeleted());
        return respository.save(existingTask);
    }
}
