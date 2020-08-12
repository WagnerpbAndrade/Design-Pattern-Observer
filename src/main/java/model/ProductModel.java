package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductModel {

    private Long productId;
    private String productName;
    private Double productPrice;
}
