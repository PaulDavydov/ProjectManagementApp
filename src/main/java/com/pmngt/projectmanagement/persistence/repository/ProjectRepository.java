package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Project> findByName(String projectName);

}
