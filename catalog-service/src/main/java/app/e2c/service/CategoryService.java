package app.e2c.service;

import app.e2c.entity.Category;
import app.e2c.entity.CategoryDomain;

import java.util.List;

import org.bson.types.ObjectId;

public interface CategoryService {
    List<Category> findAll();

    List<CategoryDomain> findAllDomains();

    Category create(Category category);

    CategoryDomain createDomain(CategoryDomain categoryDomain);

    void update(String id, Category category);

    void delete(ObjectId id);
}
