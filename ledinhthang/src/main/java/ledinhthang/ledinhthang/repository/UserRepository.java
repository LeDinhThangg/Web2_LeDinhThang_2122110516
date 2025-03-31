package  ledinhthang.ledinhthang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ledinhthang.ledinhthang.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
