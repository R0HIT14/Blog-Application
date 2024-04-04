package com.blogapplication.blogapplication.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {


    private Integer categoryId;

    @NotBlank
    @Size(min = 4, message = "Title should be greater 4 lenght")
    private String categoryTitle;

    @NotEmpty
    @Size(min = 4, message = "Title should be greater 4 lenght")
    private String categoryDescription;
}
