package com.greenfox.todos;

import com.greenfox.todos.model.Assignee;
import com.greenfox.todos.model.Todo;
import com.greenfox.todos.repository.AssigneeRepository;
import com.greenfox.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  AssigneeRepository assigneeRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("walk the dog", true, false, "walk with Rokko"));
    todoRepository.save(new Todo("buy milk", false, true, "lactose free milk"));
    todoRepository.save(new Todo("learn Java", false, true, "read about JPA"));
    todoRepository.save(new Todo("tidy up", true, false, "clean the room"));
    todoRepository.save(new Todo("wash the floor", true, false, "clean the floor"));
    todoRepository.save(new Todo("make the bed", false, true, "make my bed"));
    todoRepository.save(new Todo("broom", false, false, "broom the floor"));
    todoRepository.save(new Todo("clean the bathroom", true, true, "clean the tub"));
    assigneeRepository.save(new Assignee("John", "john@gmail.com"));
    assigneeRepository.save(new Assignee("Kate", "kate@gmail.com"));
    assigneeRepository.save(new Assignee("Peter", "peter@gmail.com"));
    assigneeRepository.save(new Assignee("Susan","susan@gmail.com"));
  }
}

