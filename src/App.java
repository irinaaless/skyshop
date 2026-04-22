import basket.ProductBasket;
import product.Product;

public class App {
    public static void main(String[] args) {

        Product cheese = new Product("сыр", 200);
        Product tea = new Product("чай", 70);
        ProductBasket basket = new ProductBasket(2);
        basket.add(cheese);
        basket.add(tea);
       basket.printBasket();

    }
}