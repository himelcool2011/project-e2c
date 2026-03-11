package app.e2c.repository;

import app.e2c.entity.CategoryDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDomainRepository extends MongoRepository<CategoryDomain, String> {
}
