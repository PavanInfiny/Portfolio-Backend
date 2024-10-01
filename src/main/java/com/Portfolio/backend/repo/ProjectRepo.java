package com.Portfolio.backend.repo;

import com.Portfolio.backend.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Projects,Integer> {

}
