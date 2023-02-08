package com.example.inventoryserv.repository;

import com.example.inventoryserv.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByProductIn(List<String> product);
}
