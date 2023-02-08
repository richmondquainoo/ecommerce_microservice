package com.example.inventoryserv.service;

import com.example.inventoryserv.dto.InventoryResponse;
import com.example.inventoryserv.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;


    @Transactional(readOnly = true)
    @SneakyThrows
    public List<InventoryResponse> isInStock(List<String> product) {
        log.info("Checking Inventory");
        return inventoryRepository.findByProductIn(product).stream()
                .map(inventory ->
                        InventoryResponse.builder()
                                .product(inventory.getProduct())
                                .isInStock(inventory.getQuantity() > 0)
                                .build()
                ).toList();
    }
}
