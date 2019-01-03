package com.greenfox.todos.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String description;
  private Boolean urgent;
  private Boolean done;
  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private Date date = new Date();


  @ManyToOne(fetch= FetchType.EAGER)
  @JoinColumn(name="assignee_id")
  private Assignee assignee;

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public Date getDate() {
    return date;
  }


  public void setDate(Date date) {
    this.date = date;
  }

  public Todo() {
    this.done = false;
    this.urgent = false;
  }

  public Todo(String title, String description) {
    this();
    this.description= description;
    this.title = title;
  }
  public Todo(String title, Boolean done, Boolean urgent, String description){
    this.description = description;
    this.title = title;
    this.done = done;
    this.urgent = urgent;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getUrgent() {
    return urgent;
  }

  public void setUrgent(Boolean urgent) {
    this.urgent = urgent;
  }

  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }
}

