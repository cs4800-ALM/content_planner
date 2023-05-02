package com.example.content_planner.repo;
import com.example.content_planner.model.ContentPost;

import com.example.content_planner.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM ContentPost p WHERE p.title LIKE %:query%")
    List<ContentPost> searchPostsByTitle(@Param("query") String query);
}
