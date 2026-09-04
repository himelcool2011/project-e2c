package app.e2c.entity;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CategoryTest {


    @Test
    void checkCategoryHasId(){
        Category category = new Category(new ObjectId());
        assertThat(category.getId()).isNotEmpty();
    }
}
