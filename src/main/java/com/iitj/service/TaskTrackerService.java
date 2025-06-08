package com.iitj.service;

import com.iitj.entity.Task;
import com.iitj.repository.TaskTrackerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskTrackerService {
    private final TaskTrackerRepository taskTrackerRepository;

    public TaskTrackerService(TaskTrackerRepository taskTrackerRepository) {
        this.taskTrackerRepository = taskTrackerRepository;
    }

    public List<Task> getAllTasks() {
        return taskTrackerRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskTrackerRepository.findById(id);
    }

    public Task createTask(Task task) {
        return taskTrackerRepository.save(task);
    }

    public Task updateTask(Long id, Task update_task) {
        return taskTrackerRepository.findById(id)
                .map(task -> {
                    task.setTitle(update_task.getTitle());
                    task.setDescription(update_task.getDescription());
                    task.setStatus(update_task.getStatus());
                    task.setDueDate(update_task.getDueDate());
                    return taskTrackerRepository.save(task);
                })
                .orElse(null);
    }

    public void deleteTask(Long id) {
        taskTrackerRepository.deleteById(id);
    }
}
