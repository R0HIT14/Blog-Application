package com.blogapplication.blogapplication.services;

import com.blogapplication.blogapplication.entities.Post;
import com.blogapplication.blogapplication.payloads.PostDto;

import java.util.List;


public interface PostService {

    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    PostDto updatePost(PostDto postDto, Integer id);
    void deletePost(Integer id);
    PostDto getPostById(Integer id);
    List<Post> getAllPost();

}
