package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Project;
import com.pmngt.projectmanagement.persistence.model.ProjectTask;
import com.pmngt.projectmanagement.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<ProjectTask, Long> {
    List<ProjectTask> findAllByProject(Project project);

    List<ProjectTask> findByUser(User user);

}
