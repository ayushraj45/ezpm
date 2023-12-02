package com.example.ezprojectmanagement.dataaccess;

import com.example.ezprojectmanagement.entities.Subtask;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtaskRepository extends ListCrudRepository<Subtask, Long> {
}
