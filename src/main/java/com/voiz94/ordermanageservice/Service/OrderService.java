package com.voiz94.ordermanageservice.Service;

import com.voiz94.ordermanageservice.Model.Order;
import com.voiz94.ordermanageservice.Repository.IOrderRepository;
import com.voiz94.ordermanageservice.Service.Interface.IOrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService implements IOrderService {
    private final IOrderRepository repository;

    @Override
    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void removeOrderById(Long id) {
        repository.deleteById(id);
    }
}
