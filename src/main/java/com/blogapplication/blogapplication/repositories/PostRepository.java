package com.blogapplication.blogapplication.repositories;

import com.blogapplication.blogapplication.entities.Category;
import com.blogapplication.blogapplication.entities.Post;
import com.blogapplication.blogapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Category> findByCategory(Category category);
}
