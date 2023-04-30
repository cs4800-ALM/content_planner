package com.example.content_planner.repo;

import com.example.content_planner.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Long> {

}
