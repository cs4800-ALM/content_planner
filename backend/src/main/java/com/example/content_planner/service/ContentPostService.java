package com.example.content_planner.service;

import com.example.content_planner.exception.UserNotFoundException;
import com.example.content_planner.model.ContentPost;
import com.example.content_planner.repo.ContentPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentPostService {
    private final ContentPostRepo contentPostRepo;

    @Autowired
    public ContentPostService(ContentPostRepo contentPostRepo) {
        this.contentPostRepo = contentPostRepo;
    }

    public ContentPost addContentPost(ContentPost contentPost){

        return contentPostRepo.save(contentPost);
    }

    public List<ContentPost> findAllContentPosts(){
        return contentPostRepo.findAll();
    }

    public ContentPost updateContentPost(ContentPost contentPost){
        return contentPostRepo.save(contentPost);
    }

    public ContentPost findContentPostByID(Long id){
        return contentPostRepo.findEmployeeByID(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found."));  // query method
    }

    public void deleteContentPost(Long id){
        contentPostRepo.deleteContentPostByID(id);    // query method
    }
}
