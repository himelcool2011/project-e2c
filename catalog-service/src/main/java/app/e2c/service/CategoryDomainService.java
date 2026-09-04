package app.e2c.service;

import app.e2c.entity.CategoryDomain;
import app.e2c.repository.CategoryDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryDomainService {
    private final CategoryDomainRepository categoryDomainRepository;

    public List<CategoryDomain> findAllDomains() {
        return categoryDomainRepository.findAll();
    }


    public CategoryDomain createDomain(CategoryDomain categoryDomain) {
        return categoryDomainRepository.save(categoryDomain);
    }
}
