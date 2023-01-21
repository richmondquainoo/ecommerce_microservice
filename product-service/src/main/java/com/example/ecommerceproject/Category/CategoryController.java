package com.example.ecommerceproject.Category;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    @Autowired
    private final CategoryService categoryService;

    @GetMapping("/getAllCategories")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/create-productCategory")
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }
}
