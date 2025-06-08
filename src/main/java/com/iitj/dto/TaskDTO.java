package com.iitj.dto;

import com.iitj.entity.Task.Status;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public class TaskDTO {
    private long id;
    private String title;
    private String description;
    private Status status;
    private LocalDate dueDate;
}
