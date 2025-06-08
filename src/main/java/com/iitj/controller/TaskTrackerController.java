package com.iitj.controller;

import com.iitj.entity.Task;
import com.iitj.repository.TaskTrackerRepository;
import com.iitj.service.TaskTrackerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v2/tasks")
public class TaskTrackerController {
    private final TaskTrackerService taskTrackerService;

    public TaskTrackerController(TaskTrackerService taskTrackerService, TaskTrackerRepository taskTrakerRepository) {
        this.taskTrackerService = taskTrackerService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskTrackerService.getAllTasks();
    }

    @GetMapping("{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return taskTrackerService.getTaskById(id);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskTrackerService.createTask(task);
    }

    @PutMapping("{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskTrackerService.updateTask(id, task);
    }

    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable Long id) {
        taskTrackerService.deleteTask(id);
    }
}
