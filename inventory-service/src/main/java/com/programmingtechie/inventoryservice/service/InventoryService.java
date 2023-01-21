package com.programmingtechie.inventoryservice.service;

import com.programmingtechie.inventoryservice.dto.InventoryResponse;
import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> product) {
        return inventoryRepository.findByProductIn(product).stream().map(inventory->
            InventoryResponse.builder().product(inventory.getProduct())
                    .isInStock(inventory.getQuantity() > 0)
                    .build()
        ).toList();
    }
}
