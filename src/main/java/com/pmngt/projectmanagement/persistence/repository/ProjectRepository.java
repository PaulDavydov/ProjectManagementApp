package com.pmngt.projectmanagement.persistence.repository;

import com.pmngt.projectmanagement.persistence.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Project> findByName(String projectName);

}
