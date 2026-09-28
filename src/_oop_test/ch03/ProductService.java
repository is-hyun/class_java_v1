package _oop_test.ch03;

public class ProductService {
    private ProductDAO productDAO = new ProductDAO();
    public void registerProduct(String name, int price) {
        Product product = new Product(name, price);
        productDAO.insertProduct(product);
    }
}
