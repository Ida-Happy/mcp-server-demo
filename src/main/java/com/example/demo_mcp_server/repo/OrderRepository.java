package com.example.demo_mcp_server.repo;


import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {

    List<Order> findOrdersByCreateTimeBetween(LocalDateTime createTimeAfter, LocalDateTime createTimeBefore);

}
