package com.bdiplus.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.bdiplus.assignment.entity.Task;
import com.bdiplus.assignment.repository.TaskRespository;
import com.bdiplus.assignment.service.TaskService;

@SpringBootTest
class AssignmentApplicationTests {

	@Mock
    private TaskRespository repository;

    @InjectMocks
    private TaskService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateTask() {
        Task task = new Task(1, "Test Task", "Description", false);

        when(repository.save(any(Task.class))).thenReturn(task);

        Task savedTask = service.createTask(task);

        assertNotNull(savedTask);
        assertEquals(task.getId(), savedTask.getId());
        assertEquals(task.getTask_name(), savedTask.getTask_name());
        assertEquals(task.getDescription(), savedTask.getDescription());
        assertEquals(task.isCompeleted(), savedTask.isCompeleted());

        verify(repository, times(1)).save(any(Task.class));
    }

    @Test
    public void testGetTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task 1", "Description 1", false));
        tasks.add(new Task(2, "Task 2", "Description 2", true));

        when(repository.findAll()).thenReturn(tasks);

        List<Task> result = service.getTasks();

        assertNotNull(result);
        assertEquals(tasks.size(), result.size());
        assertEquals(tasks, result);

        verify(repository, times(1)).findAll();
    }

    @Test
    public void testGetTaskById() {
        Task task = new Task(1, "Test Task", "Description", false);

        when(repository.findById(1)).thenReturn(Optional.of(task));

        Task result = service.getTaskById(1);

        assertNotNull(result);
        assertEquals(task, result);

        verify(repository, times(1)).findById(1);
    }

    @Test
    public void testDeleteTask() {
        int taskId = 1;

        service.deleteTask(taskId);

        verify(repository, times(1)).deleteById(taskId);
    }

    @Test
    public void testUpdateTask() {
        Task existingTask = new Task(1, "Existing Task", "Existing Description", true);
        Task updatedTask = new Task(1, "Updated Task", "Updated Description", false);

        when(repository.findById(1)).thenReturn(Optional.of(existingTask));
        when(repository.save(any(Task.class))).thenReturn(updatedTask);

        Task result = service.updateTask(updatedTask);

        assertNotNull(result);
        assertEquals(updatedTask.getId(), result.getId());
        assertEquals(updatedTask.getTask_name(), result.getTask_name());
        assertEquals(updatedTask.getDescription(), result.getDescription());
        assertEquals(updatedTask.isCompeleted(), result.isCompeleted());

        verify(repository, times(1)).findById(1);
        verify(repository, times(1)).save(any(Task.class));
    }

}
