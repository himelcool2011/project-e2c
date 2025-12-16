package app.e2c.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.e2c.dto.StoreDto;
import app.e2c.service.StoreService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/stores")
@RequiredArgsConstructor
public class StoreController {

    
    private final StoreService storeService;

    @PostMapping
    public ResponseEntity<Void> createStore(@RequestBody StoreDto storeDto){
        storeService.createStore(storeDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
