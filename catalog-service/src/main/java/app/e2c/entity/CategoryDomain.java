package app.e2c.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("category_domains")
public class CategoryDomain {
    @Id
    private ObjectId id;
    private String name;

    public CategoryDomain(){}

    public CategoryDomain(ObjectId id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id.toHexString();
    }

}
