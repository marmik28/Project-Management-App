package com.marmik.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marmik.backend.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}

