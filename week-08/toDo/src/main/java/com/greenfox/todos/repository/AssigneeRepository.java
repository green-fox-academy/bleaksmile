package com.greenfox.todos.repository;

import com.greenfox.todos.model.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee,Long> {
  Assignee findByName(String name);

}
