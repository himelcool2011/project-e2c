package app.e2c.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.e2c.dto.StoreDto;
import app.e2c.entity.BusinessInfo;
import app.e2c.entity.Seller;
import app.e2c.entity.Store;
import app.e2c.repository.StoreRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService{

    private final StoreRepository storeRepository;

    @Override
    public void createStore(StoreDto storeDto) {
        Store store = new Store();
        BeanUtils.copyProperties(storeDto, store);
        Seller seller = new Seller();
        BeanUtils.copyProperties(storeDto, seller);
        store.setSeller(seller);
        BusinessInfo businessInfo = new BusinessInfo();
        BeanUtils.copyProperties(storeDto, businessInfo);
        store.setBusinessInfo(businessInfo);
        storeRepository.save(store);
    }
    
}
