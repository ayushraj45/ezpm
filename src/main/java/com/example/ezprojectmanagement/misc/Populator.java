package com.example.ezprojectmanagement.misc;

import com.example.ezprojectmanagement.dataaccess.IProjectRepository;
import com.example.ezprojectmanagement.dataaccess.SubtaskRepository;
import com.example.ezprojectmanagement.dataaccess.TaskRepository;
import com.example.ezprojectmanagement.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Populator {

    @Autowired
    IProjectRepository IProjectRepository;

    @Autowired
    TaskRepository taskRepo;

    @Autowired
    SubtaskRepository subtaskRepository;

    @Autowired
    public Populator(IProjectRepository IProjectRepository) {
        this.IProjectRepository = IProjectRepository;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void populate(){
        Project p1 = new Project("New Project");
        IProjectRepository.save(p1);
        Task t1 = new Task("task1");
        Task t2 = new Task("task2");
        taskRepo.save(t1);
        taskRepo.save(t2);
        Subtask st1 = new Subtask("ST1", "des", t1);
        Subtask st2 = new Subtask("St2", "des", t2);
        subtaskRepository.save(st1);
        subtaskRepository.save(st2);

        p1.addTask(t1);
        p1.addTask(t2);
//        t1.setProject(p1);
//        t2.setProject(p1);

        taskRepo.save(t1);
        taskRepo.save(t2);
        IProjectRepository.save(p1);
    }
}
