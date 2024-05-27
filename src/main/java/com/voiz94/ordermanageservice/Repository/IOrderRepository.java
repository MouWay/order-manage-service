package com.voiz94.ordermanageservice.Repository;

import com.voiz94.ordermanageservice.Model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IOrderRepository extends CrudRepository<Order, Long> {
    Order save(Order order);
    List<Order> findAll();
    Optional<Order> findById(Long id);
    void deleteById(Long id);
}
