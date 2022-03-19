package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Priority;
import com.pmngt.projectmanagement.persistence.model.Task;
import com.pmngt.projectmanagement.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PriorityRepository extends JpaRepository<Priority, Long> {
    Optional<Priority> findByTaskAndUserOrderByPriorityIdDesc(Task task, User currentUser);
}
