package app.e2c;

import app.e2c.entity.BusinessInfo;
import app.e2c.entity.SetterType;
import app.e2c.entity.Seller;
import app.e2c.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StoreServiceApplication implements CommandLineRunner {



    @Autowired
    private StoreRepository storeRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(StoreServiceApplication.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
 
       
    }
}