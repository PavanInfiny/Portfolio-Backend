package com.Portfolio.backend.controller;

import com.Portfolio.backend.model.Projects;
import com.Portfolio.backend.service.projectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Component
@RestController
@CrossOrigin
public class ProjectController {

    @Autowired
    projectservice ps;
    @GetMapping("/projects")
    public List<Projects> getprojects(){

        return ps.getallprojects();
    }
    @PostMapping("/projects")
    public void addnewprojects(@RequestBody Projects p){
        ps.addProjects(p);
    }
}
