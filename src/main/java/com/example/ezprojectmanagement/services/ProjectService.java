package com.example.ezprojectmanagement.services;

import com.example.ezprojectmanagement.dataaccess.IProjectRepository;
import com.example.ezprojectmanagement.entities.Project;
import com.example.ezprojectmanagement.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {



    IProjectRepository projectRepo;
    @Autowired
    public ProjectService(IProjectRepository IProjectRepository) {
        this.projectRepo = IProjectRepository;
    }

//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private TaskRepository taskRepository;



    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    public Project createProject(Project project) {
        return projectRepo.save(project);
    }

    public Optional<Project> getProjectById(Long projectId) {
        return projectRepo.findById(projectId);
    }

    public void addTaskToProject(Long projectId, Task task) {
        Optional<Project> optionalProject = projectRepo.findById(projectId);
        if (optionalProject.isPresent()) {
            Project project = optionalProject.get();
            project.addTask(task);
            projectRepo.save(project);
        }
    }

}
