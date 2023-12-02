package com.example.ezprojectmanagement.dataaccess;

import com.example.ezprojectmanagement.entities.Task;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends ListCrudRepository<Task, Long> {

}
