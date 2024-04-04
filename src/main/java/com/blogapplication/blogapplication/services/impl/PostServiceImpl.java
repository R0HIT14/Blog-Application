package com.blogapplication.blogapplication.services.impl;

import com.blogapplication.blogapplication.entities.Category;
import com.blogapplication.blogapplication.entities.Post;
import com.blogapplication.blogapplication.entities.User;
import com.blogapplication.blogapplication.exceptions.ResourceNotFoundException;
import com.blogapplication.blogapplication.payloads.PostDto;
import com.blogapplication.blogapplication.repositories.CategoryRepo;
import com.blogapplication.blogapplication.repositories.PostRepository;
import com.blogapplication.blogapplication.repositories.UserRepository;
import com.blogapplication.blogapplication.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {
        User user = this.userRepository.findById(userId)
                .orElseThrow(()->new ResourceNotFoundException("User","UserId",userId));
        Category category = this.categoryRepo.findById(categoryId)
                .orElseThrow(()->new ResourceNotFoundException("Category","CategoryId",categoryId));
        Post post = this.modelMapper.map(postDto, Post.class);
        post.setImageName("default.png");
        post.setCategory(category);
        post.setCreationDate(new Date());
        post.setUser(user);

        Post newPost = this.postRepository.save(post);
        return this.modelMapper.map(newPost,PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer id) {
        return null;
    }

    @Override
    public void deletePost(Integer id) {

    }

    @Override
    public PostDto getPostById(Integer id) {
        return null;
    }

    @Override
    public List<Post> getAllPost() {
        return null;
    }
}
