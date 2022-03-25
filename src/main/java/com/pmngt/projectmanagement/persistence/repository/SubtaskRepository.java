package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Subtask;
import com.pmngt.projectmanagement.persistence.model.ProjectTask;
import com.pmngt.projectmanagement.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubtaskRepository extends JpaRepository<Subtask, Long> {
    List<Subtask> findByProjectTask(ProjectTask projectTask);

    List<Subtask> findAllByUser (User user);

}
