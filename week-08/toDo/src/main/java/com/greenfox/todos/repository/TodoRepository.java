package com.greenfox.todos.repository;

import com.greenfox.todos.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findByDone(Boolean bool);
  Todo findDistinctById(Long id);
  List<Todo> findByTitleContainsOrDescriptionContains(String title, String description);
}
