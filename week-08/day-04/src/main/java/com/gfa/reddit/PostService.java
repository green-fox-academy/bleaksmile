package com.gfa.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {

  @Autowired
  private PostRepository postRepository;

  public Iterable<Post> findAll() {
    return postRepository.findAll();

  }

  public Optional<Post> findById(Long id) {
    return postRepository.findById(id);
  }

  public void voteUp(Long id) {
    Post curentPost = postRepository.findById(id).get();
    curentPost.setLikes(curentPost.getLikes() + 1);
    postRepository.save(curentPost);
  }

  public void voteDown(Long id) {
    Post curentPost = postRepository.findById(id).get();
    curentPost.setLikes(curentPost.getLikes() - 1);
    postRepository.save(curentPost);
  }

  public void savePost(Post post) {
    postRepository.save(post);
  }

  public List<Post> sort() {
    List<Post> postList = (List<Post>) this.findAll();
    List<Post> mostPopular = postList.stream()
            .sorted(Comparator.comparing(Post::getLikes).reversed())
            .limit(10L)
            .collect(Collectors.toList());
    return mostPopular;
  }
}
