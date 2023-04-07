package com.example.content_planner.repo;

import com.example.content_planner.model.ContentPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContentPostRepo extends JpaRepository<ContentPost, Long> {

    void deleteContentPostByID(Long id);

    Optional<ContentPost>findEmployeeByID(Long id);
}
