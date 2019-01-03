package com.gfa.reddit;


import javax.persistence.*;
import java.net.URL;
import java.util.Date;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String content;
  private Integer likes;
  private URL url;
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date createdAt;

  public Post() {
    this.likes =0;
    this.createdAt = new Date();
  }

  public Post(String title, String content) {
    this();
    this.title = title;
    this.content = content;
  }


  public Post(String title, URL url) {
    this();
    this.title = title;
    this.url = url;
  }

  public Post(String title, String content, Integer likes) {
    this();
    this.title = title;
    this.content = content;
    this.likes = likes;
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

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}

