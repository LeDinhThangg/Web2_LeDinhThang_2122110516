package  ledinhthang.ledinhthang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ledinhthang.ledinhthang.entity.Order;
import ledinhthang.ledinhthang.entity.OrderDetail;

import java.util.List; // Thêm import này để dùng List

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<OrderDetail> findByOrderId(int orderId);
}