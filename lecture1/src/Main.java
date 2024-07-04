import product.Product;
import service.IProductDao;
import service.ProductService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProductDao ProductDao = new ProductService();

        Product product1 = new Product(1, "Iphone");
        Product product2 = new Product(2, "Samsung");

        ProductDao.add(product1);
        ProductDao.add(product2);

        System.out.println("Product: " + ProductDao.findById(1));
        System.out.println("Product: " + ProductDao.findById(2));
    }
}