package com.blogapplication.blogapplication.payloads;

import com.blogapplication.blogapplication.entities.Category;
import com.blogapplication.blogapplication.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
    private Integer postId;


    private String title;


    private String content;

    private String imageName;
    private Date creationDate;
    private CategoryDto category;
    private UserDto user;

}
