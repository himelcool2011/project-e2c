package app.e2c.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Seller {

    private String firstName;
    private String lastName;
    private String sellerId;
    private String email;
    private String phone;


}
