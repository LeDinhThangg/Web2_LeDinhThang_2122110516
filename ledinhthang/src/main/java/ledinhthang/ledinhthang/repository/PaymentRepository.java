package  ledinhthang.ledinhthang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ledinhthang.ledinhthang.entity.Payment;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    // Sử dụng truy vấn theo đối tượng Order
    List<Payment> findByOrder_OrderId(int orderId);
}