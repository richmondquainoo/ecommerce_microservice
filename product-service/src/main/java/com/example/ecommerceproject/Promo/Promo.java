package com.example.ecommerceproject.Promo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "product_promo")
@Table
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;
    private String category;
    private Double price;
    private String image;
}
