package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Subtask;
import com.pmngt.projectmanagement.persistence.model.Task;
import com.pmngt.projectmanagement.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubtaskRepository extends JpaRepository<Subtask, Long> {
    List<Subtask> findByTask(Task task);

    List<Subtask> findAllByUser (User user);

}
