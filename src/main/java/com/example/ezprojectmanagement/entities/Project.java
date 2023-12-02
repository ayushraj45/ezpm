package com.example.ezprojectmanagement.entities;

import com.example.ezprojectmanagement.controllers.ProjectController;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Project {

    @Id
    @GeneratedValue
    Long id;

    private String name;

    @OneToMany (mappedBy = "project")
    List<Task> tasks;

//    @ManyToMany
//    @JoinTable(
//            name = "project_user",
//            joinColumns = @JoinColumn(name = "project_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private List<User> users;

    public void addTask(Task task) {
        if (tasks == null) {
            tasks = new ArrayList<>();
        }
        tasks.add(task);
        task.setProject(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

 //   public List<Task> getTask() {
//        return this.tasks;
//    }
//
////    public List<User> getUsers() {
////        return users;
////    }
//
//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }

    public Project(String name) {
        this.name = name;
    }

    Project(){}
}
