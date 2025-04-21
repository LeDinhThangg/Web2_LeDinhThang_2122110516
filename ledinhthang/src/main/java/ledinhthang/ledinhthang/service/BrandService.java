package ledinhthang.ledinhthang.service;

import ledinhthang.ledinhthang.entity.Brand;
import ledinhthang.ledinhthang.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    // Lấy tất cả brand
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    // Thêm brand
    public Brand addBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    // Lấy brand theo ID
    public Brand getBrandById(int id) {
        return brandRepository.findById(id).orElse(null);
    }

    // Xóa brand
    public boolean deleteBrandById(int id) {
        if (brandRepository.existsById(id)) {
            brandRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Cập nhật brand
    public Brand updateBrand(int id, Brand newBrand) {
        return brandRepository.findById(id).map(brand -> {
            brand.setName(newBrand.getName());
            brand.setImage(newBrand.getImage());
            return brandRepository.save(brand);
        }).orElse(null);
    }
}
