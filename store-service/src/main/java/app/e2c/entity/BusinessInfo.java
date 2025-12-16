package app.e2c.entity;

import lombok.Data;

@Data
public class BusinessInfo {
    private SetterType sellerType;
    private String countryRegion;
    private String legalName;
    private String legalForm;
    private String address;
    private String townCity;
    private String personInCharge;
    private String binRegNumber;
    private String nidImg;
    private String nidNo;
    
}