package lesson26._02.grasp.demos._7_pure_fabrication;

import java.util.List;

public interface ProductDao {
    void createProduct(Product product);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
