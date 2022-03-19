package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Project;
import com.pmngt.projectmanagement.persistence.model.Task;
import com.pmngt.projectmanagement.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByProject(Project project);

    List<Task> findByUser(User user);

}
