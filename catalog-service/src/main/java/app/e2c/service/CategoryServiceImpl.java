package app.e2c.service;

import app.e2c.entity.Category;
import app.e2c.entity.CategoryDomain;
import app.e2c.repository.CategoryDomainRepository;
import app.e2c.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryDomainRepository categoryDomainRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void update(String id, Category category) {
        Category existingCategory = categoryRepository.findById(new ObjectId(id))
                .orElseThrow(() -> new RuntimeException("Category not found"));
        existingCategory.setName(category.getName());
        existingCategory.setSlug(category.getSlug());
        existingCategory.setDescription(category.getDescription());
        existingCategory.setBannerImg(category.getBannerImg());
        existingCategory.setDisplayOrder(category.getDisplayOrder());
        existingCategory.setCategoryDomain(category.getCategoryDomain());
        existingCategory.setParent(category.getParent());
        categoryRepository.save(existingCategory);
    }

    @Override
    public List<CategoryDomain> findAllDomains() {
        return categoryDomainRepository.findAll();
    }

    @Override
    public CategoryDomain createDomain(CategoryDomain categoryDomain) {
        return categoryDomainRepository.save(categoryDomain);
    }

    @Override
    public void delete(ObjectId id) {
        categoryRepository.deleteById(id);
    }
}
