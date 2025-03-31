package  ledinhthang.ledinhthang.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ledinhthang.ledinhthang.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}