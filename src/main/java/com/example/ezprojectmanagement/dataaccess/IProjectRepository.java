package com.example.ezprojectmanagement.dataaccess;

import com.example.ezprojectmanagement.entities.Project;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends ListCrudRepository<Project, Long> {


}
