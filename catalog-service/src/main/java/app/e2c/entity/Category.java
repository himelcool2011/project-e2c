package app.e2c.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Document("categories")
public class Category {

    @Id
    private ObjectId id;
    private String name;
    private String slug;
    private String description;
    private String bannerImg;
    private Integer displayOrder;

    @DocumentReference
    private CategoryDomain categoryDomain;

    @DocumentReference
    private Category parent;

    public String getId() {
        return id.toHexString();
    }
}
