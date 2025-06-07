package com.example.demo_mcp_server.repo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("demo_items_tbl")
public class Item {
    @Id
    private Integer id;
    private String itemId;
    private String shopName;
    private String itemName;
    private String itemDesc;
    private Integer basePrice;
    private Integer salePrice;
    private Double taxRate;
    private Boolean purchaseFlg;
    private LocalDateTime createTime;
}

