package com.Portfolio.backend.service;

import com.Portfolio.backend.model.Projects;
import com.Portfolio.backend.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectservice {
    @Autowired
    ProjectRepo pr;
    public List<Projects> getallprojects() {
        return pr.findAll();
    }
    public void addProjects(Projects p){
        pr.save(p);
    }
}
