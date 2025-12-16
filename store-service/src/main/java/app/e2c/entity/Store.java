package app.e2c.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("store")
public class Store {
    @Id
    private ObjectId id;
    private String storeNameBn;
    private String storeNameEn;
    private String shortCode;
    private String logo;
    private String storeUrl;
    private Seller seller;
    private BusinessInfo businessInfo;
}
