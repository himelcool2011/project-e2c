package app.e2c.controller;

import app.e2c.entity.Category;
import app.e2c.entity.CategoryDomain;
import app.e2c.service.CategoryDomainService;
import app.e2c.service.CategoryService;
import lombok.RequiredArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryDomainService categoryDomainService;

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        return ResponseEntity.ok(categoryService.findAll());
    }

//    @GetMapping("/domains")
//    public ResponseEntity<List<CategoryDomain>> getAllDomains() {
//        return ResponseEntity.ok(categoryService.findAllDomains());
//    }

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.create(category));
    }

//    @PostMapping("/domains")
//    public ResponseEntity<CategoryDomain> createDomain(@RequestBody CategoryDomain categoryDomain) {
//        return ResponseEntity.ok(categoryService.createDomain(categoryDomain));
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody Category category) {
        categoryService.update(id, category);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        categoryService.delete(new ObjectId(id));
        return ResponseEntity.noContent().build();
    }
}
