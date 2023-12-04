package com.io.k8sdatabase;

import com.io.k8sdatabase.entity.Order;
import com.io.k8sdatabase.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;


    public Order addOrder(Order order){
        return orderRepo.save(order);
    }

    public List<Order> getOrders(){
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderById(int id){
        return orderRepo.findById(id);
    }
}
