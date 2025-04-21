package ledinhthang.ledinhthang.controller;

import ledinhthang.ledinhthang.entity.Brand;
import ledinhthang.ledinhthang.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    // Lấy tất cả brand
    @GetMapping
    public ResponseEntity<List<Brand>> getAllBrands() {
        List<Brand> brands = brandService.getAllBrands();
        if (brands.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(brands);
    }

    // Lấy brand theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Brand> getBrandById(@PathVariable int id) {
        Brand brand = brandService.getBrandById(id);
        if (brand == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(brand);
    }

    // Thêm brand mới
    @PostMapping
    public ResponseEntity<Brand> addBrand(@RequestBody Brand brand) {
        Brand savedBrand = brandService.addBrand(brand);
        return ResponseEntity.ok(savedBrand);
    }

    // Cập nhật brand
    @PutMapping("/{id}")
    public ResponseEntity<Brand> updateBrand(@PathVariable int id, @RequestBody Brand newBrand) {
        Brand updatedBrand = brandService.updateBrand(id, newBrand);
        if (updatedBrand == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedBrand);
    }

    // Xóa brand
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBrandById(@PathVariable int id) {
        boolean isDeleted = brandService.deleteBrandById(id);
        if (!isDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
