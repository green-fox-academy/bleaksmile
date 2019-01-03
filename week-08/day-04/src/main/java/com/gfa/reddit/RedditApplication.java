package com.gfa.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {
  @Autowired
  PostRepository postRepository;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    this.postCreation();
    postRepository.save(new Post("Aquaman official trailer", "It was pretty good"));
    postRepository.save(new Post("It is snowing", "Yes, it is"));
    postRepository.save(new Post("GFA is cool", "We are learning at GFA"));
    postRepository.save(new Post("This post has URL", new URL("https://hu.wikipedia.org/wiki/URL") ));
  }

  public void postCreation(){
    for (int i=1; i<16; i++) {
      Post post = new Post("Post number " + i, "Post description" + i);
      postRepository.save(post);
    }
  }
}

