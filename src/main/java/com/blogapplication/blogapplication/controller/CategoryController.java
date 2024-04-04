package com.blogapplication.blogapplication.controller;


import com.blogapplication.blogapplication.payloads.ApiResponse;
import com.blogapplication.blogapplication.payloads.CategoryDto;
import com.blogapplication.blogapplication.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;
    //create
    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto){
        CategoryDto createCategoryDto = this.categoryService.createCategory(categoryDto);
        return new ResponseEntity<>(createCategoryDto, HttpStatus.CREATED);
    }

    //update
    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer id){
        CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto,id);
        return ResponseEntity.ok(updatedCategory);
    }

    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer id){
        this.categoryService.deleteCategory(id);
        return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted ",true),HttpStatus.OK);
    }

    //getCategory
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer id){
        CategoryDto category = this.categoryService.getCategory(id);
        return ResponseEntity.ok(category);
    }

    //GetAllCategories
    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> getCategory(){
        List<CategoryDto> categoryList = this.categoryService.getAllCategory();
        return ResponseEntity.ok(categoryList);
    }
}
