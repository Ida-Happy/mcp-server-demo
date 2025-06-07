package com.example.demo_mcp_server.repo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findItemByPurchaseFlg(Boolean purchaseFlg);

}
