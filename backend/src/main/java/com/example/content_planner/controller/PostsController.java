package com.example.content_planner.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.content_planner.exception.ResourceNotFoundException;
import com.example.content_planner.model.Posts;
import com.example.content_planner.repo.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PostsController {
    @Autowired
    private PostsRepo postsRepo;

    // get all posts
    @GetMapping("/posts")
    public List<Posts> getAllPosts(){
        return postsRepo.findAll();
    }

    // create posts rest api
    @PostMapping("/posts")
    public Posts createPost(@RequestBody Posts posts) {
        return postsRepo.save(posts);
    }

    // get posts by id rest api
    @GetMapping("/posts/{id}")
    public ResponseEntity<Posts> getPostById(@PathVariable Long id) {
        Posts posts = postsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post does not exist with id :" + id));
        return ResponseEntity.ok(posts);
    }

    // update post rest api
    @PutMapping("/posts/{id}")
    public ResponseEntity<Posts> updatePost(@PathVariable Long id, @RequestBody Posts postDetails){
        Posts posts = postsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not exist with id :" + id));

        posts.setTitle(postDetails.getTitle());
        posts.setPostDate(postDetails.getPostDate());
        posts.setAudioName(postDetails.getAudioName());
        posts.setContentCateg(postDetails.getContentCateg());
        posts.setScrollStopper(postDetails.getScrollStopper());
        posts.setCaption(postDetails.getCaption());
        posts.setHashtags(postDetails.getHashtags());
        posts.setTags(postDetails.getTags());
        posts.setAltText(postDetails.getAltText());

        Posts updatedPost = postsRepo.save(posts);
        return ResponseEntity.ok(updatedPost);
    }

    // delete post rest api
    @DeleteMapping("/posts/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePost(@PathVariable Long id){
        Posts posts = postsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not exist with id :" + id));

        postsRepo.delete(posts);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
