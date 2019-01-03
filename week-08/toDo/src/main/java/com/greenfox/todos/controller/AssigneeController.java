package com.greenfox.todos.controller;

import com.greenfox.todos.model.Assignee;
import com.greenfox.todos.repository.AssigneeRepository;
import com.greenfox.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo/")
public class AssigneeController {
  @Autowired
  AssigneeRepository assigneeRepository;

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = "/assignee", method = RequestMethod.GET)
  public String listAssginees(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assigneelist";
  }

  @RequestMapping(value="/{id}/deleteAssignee")
  public String delete(@PathVariable("id") Long id){
    assigneeRepository.delete(assigneeRepository.findById(id).get());
    return "redirect:/todo/assignee";
  }

  @RequestMapping(value = "/assigneeAdd", method = RequestMethod.GET)
  public String add(Model model, @ModelAttribute("assignee")Assignee assignee){
    model.addAttribute("assignee", assignee);
    return "assigneeAdd";
  }

  @RequestMapping(value = "/assigneeAdd", method = RequestMethod.POST)
  public String addAssignee(@ModelAttribute("assignee") Assignee assignee){
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignee";
  }

  @RequestMapping(value="/{id}/editAssignee", method = RequestMethod.GET)
  public String edit(Model model,@PathVariable("id") Long id){
    model.addAttribute("assignee",assigneeRepository.findById(id).get());
    return "assigneeEdit";
  }

  @RequestMapping(value="/{id}/editAssignee", method = RequestMethod.POST)
  public String editAssignee(@ModelAttribute("assignee")Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignee";
  }

/*  @RequestMapping(value="/{id}/editAssignee", method = RequestMethod.POST)
  public String editAssignee(@PathVariable("id") Long id, @ModelAttribute("name")String name, @ModelAttribute("email") String email){
    Assignee assignee = assigneeRepository.findById(id).get();
    assignee.setEmail(email);
    assignee.setName(name);
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignee";
  }*/
}
