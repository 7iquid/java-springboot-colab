package com.example.demo.dto;

import com.example.demo.entity.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class ProductDto {

    private String name;

    private Integer page = 1;

    private Integer pageSize = 10;

}
