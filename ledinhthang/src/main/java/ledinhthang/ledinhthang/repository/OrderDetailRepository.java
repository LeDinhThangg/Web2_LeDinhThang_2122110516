package  ledinhthang.ledinhthang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ledinhthang.ledinhthang.entity.Order;
import ledinhthang.ledinhthang.entity.OrderDetail;
import ledinhthang.ledinhthang.entity.Product;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    // Tìm tất cả các chi tiết của một đơn hàng theo orderId
    List<OrderDetail> findByOrder_OrderId(Order orderId);
    List<OrderDetail> findByProduct(Product product);
}