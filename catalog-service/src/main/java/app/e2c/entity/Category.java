package app.e2c.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@NoArgsConstructor
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

    public Category(ObjectId id){
        this.id = id;
    }
    public String getId() {
        return id.toHexString();
    }
}
