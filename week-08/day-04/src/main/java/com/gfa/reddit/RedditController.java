package com.gfa.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

@Controller
public class RedditController {

  @Autowired
  private PostService postService;


  @RequestMapping(value = "/reddit", method = RequestMethod.GET)
  public String index(Model model) {
    model.addAttribute("posts", postService.sort());
    return "index";
  }

  @RequestMapping(value = "reddit/all", method = RequestMethod.GET)
  public String allPost(Model model) {
    model.addAttribute("posts", postService.findAll());
    return "index";
  }

  @RequestMapping(value = "reddit/{id}", method = RequestMethod.GET)
  public String content(Model model, @PathVariable("id") Long id) {
    model.addAttribute("post", postService.findById(id).get());
    return "content";
  }

  @RequestMapping(value = "reddit/{id}/up", method = RequestMethod.GET)
  public String up(@PathVariable("id") Long id) {
    postService.voteUp(id);
    return "redirect:/reddit";
  }

  @RequestMapping(value = "reddit/{id}/down", method = RequestMethod.GET)
  public String down(@PathVariable("id") Long id) {
    postService.voteDown(id);
    return "redirect:/reddit";
  }

  @RequestMapping(value = "reddit/addPost", method = RequestMethod.GET)
  public String add(Model model, @ModelAttribute("post") Post post) {
    model.addAttribute("post", post);
    return "addPost";
  }

  @RequestMapping(value = "reddit/addPost", method = RequestMethod.POST)
  public String addPost(@ModelAttribute("post") Post post) {
    postService.savePost(post);
    return "redirect:/reddit";
  }
}
