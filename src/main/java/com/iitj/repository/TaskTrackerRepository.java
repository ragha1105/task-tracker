package com.iitj.repository;

import com.iitj.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskTrackerRepository extends JpaRepository<Task, Long> {

}
