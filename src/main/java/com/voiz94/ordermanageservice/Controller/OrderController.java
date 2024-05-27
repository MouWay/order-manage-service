package com.voiz94.ordermanageservice.Controller;

import com.voiz94.ordermanageservice.Model.Order;
import com.voiz94.ordermanageservice.Service.Interface.IOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/orders")
@AllArgsConstructor
public class OrderController {
    private IOrderService service;

    @GetMapping("/save_order")
    public Order saveOrder(Order order) {
        return service.saveOrder(order);
    }

    @PostMapping("/get_all_orders")
    public List<Order> getAllOrders(){
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id){
        return service.getOrderById(id);
    }

    @DeleteMapping("remove_order_by_id/{id}")
    public void removeOrderById(@PathVariable Long id){
        service.removeOrderById(id);
    }
}
