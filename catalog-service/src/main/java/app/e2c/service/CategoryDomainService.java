package app.e2c.service;

import app.e2c.entity.CategoryDomain;
import app.e2c.exception.NameUndefinedException;
import app.e2c.repository.CategoryDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CategoryDomainService {
    private final CategoryDomainRepository categoryDomainRepository;

    public List<CategoryDomain> findAllDomains() {
        return categoryDomainRepository.findAll();
    }


    public CategoryDomain createDomain(CategoryDomain categoryDomain) {
        if(Objects.isNull(categoryDomain.getName())){
            throw new NameUndefinedException("Name is required");
        }
//        return categoryDomain;
        return categoryDomainRepository.save(categoryDomain);
    }
}
