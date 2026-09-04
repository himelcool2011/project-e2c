package app.e2c.entity;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CategoryDomainTest {

    @Test
    void createSameCategoryDomainObject(){
        ObjectId objectId = new ObjectId();
        CategoryDomain categoryDomain = new CategoryDomain(objectId,"Shirt");
        assertThat(categoryDomain).isEqualTo(new CategoryDomain(objectId,"Shirt"));
    }

    @Test
    void createDifferentCategoryDomainObject(){
        ObjectId objectId = new ObjectId();
        CategoryDomain categoryDomain = new CategoryDomain(objectId,"Shirt");
        assertThat(categoryDomain).isNotEqualTo(new CategoryDomain(objectId,"Full Sleeve Shirt"));
    }

    @Test
    void isInstanceOfCategoryDomainObject(){
        ObjectId objectId = new ObjectId();
        CategoryDomain categoryDomain = new CategoryDomain();
        assertThat(categoryDomain).isInstanceOf(CategoryDomain.class);
    }
}
