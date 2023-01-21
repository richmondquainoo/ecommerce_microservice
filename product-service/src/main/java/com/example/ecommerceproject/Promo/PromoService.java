package com.example.ecommerceproject.Promo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PromoService {

    @Autowired
    private final PromoRepository promoRepository;

    public List<Promo> getAllPromos(){
        return promoRepository.findAll();
    }

    public Promo savePromo(Promo promo){
        return promoRepository.save(promo);
    }
}
