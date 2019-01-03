package com.greenfox.todos.controller;

import com.greenfox.todos.model.Todo;
import com.greenfox.todos.repository.AssigneeRepository;
import com.greenfox.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Iterator;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @Autowired
  private AssigneeRepository assigneeRepository;

  @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive, @RequestParam(value = "search", required = false) String search ) {
    if(search != null){
      model.addAttribute("todos",todoRepository.findByTitleContainsOrDescriptionContains(search, search));
    }else if (isActive != null && isActive) {
      model.addAttribute("todos", todoRepository.findByDone(!isActive));
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";

  }

  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public String add(Model model, @ModelAttribute(value = "todo") Todo todo) {
    model.addAttribute("todo", todo);
    return "todoAdd";
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public String addTodo(@ModelAttribute(value = "todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/delete")
  public String delete(@PathVariable("id") Long id) {
    todoRepository.delete(todoRepository.findDistinctById(id));
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
  public String edit(Model model, @PathVariable("id") Long id) {
    model.addAttribute("assignees",assigneeRepository.findAll());
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "todoEdit";
  }

  @RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
  public String editTodo(@ModelAttribute("todo") Todo todo, @ModelAttribute("assig")String assig) {
    Long id =Long.parseLong(assig);
   todo.setAssignee(assigneeRepository.findById(id).get());
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/describe", method = RequestMethod.GET)
  public String describe(Model model,@PathVariable ("id") Long id ){
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "describe";
  }

/*
  @RequestMapping(value = "/search", method = RequestMethod.GET)
  public String search(@RequestParam (value = "search", required = false) String search, Model model ){
    model.addAttribute("todos", todoRepository.findByTitleContains(search));
    return "todolist";
  }
*/

}