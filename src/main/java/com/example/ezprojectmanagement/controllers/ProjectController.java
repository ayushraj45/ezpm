package com.example.ezprojectmanagement.controllers;

import com.example.ezprojectmanagement.entities.Project;
import com.example.ezprojectmanagement.entities.Task;
import com.example.ezprojectmanagement.services.ProjectService;
import com.example.ezprojectmanagement.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    ProjectService projService;
    @Autowired
    TaskService taskService;

    @Autowired
    public ProjectController(ProjectService projService){this.projService = projService;}

    @GetMapping("")
    public List<Project> getAllProjects() {
        return projService.getAllProjects();
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }




}
