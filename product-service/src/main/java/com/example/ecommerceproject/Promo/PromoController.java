package com.example.ecommerceproject.Promo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promo")
@RequiredArgsConstructor
public class PromoController {

    private final PromoService promoService;

    @PostMapping("/createPromo")
    @ResponseStatus(HttpStatus.CREATED)
    public Promo createProduct(@RequestBody Promo promo){
        return promoService.savePromo(promo);
    }

    @GetMapping("getAllPromos")
    @ResponseStatus(HttpStatus.OK)
    public List<Promo> fetchAllPromos(){
        return promoService.getAllPromos();
    }

}
