package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.PriorityColor;
import com.pmngt.projectmanagement.persistence.model.ProjectTask;
import com.pmngt.projectmanagement.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriorityRepository extends JpaRepository<PriorityColor, Long> {
    Optional<PriorityColor> findTopByProjectTaskAndUserOrderByPriorityIdDesc(ProjectTask projectTask, User currentUser);
}
