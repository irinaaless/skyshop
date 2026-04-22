import basket.ProductBasket;
import product.Product;

public class App {
    public static void main(String[] args) {

        Product cheese = new Product("сыр", 200);
        Product tea = new Product("чай", 70);
        Product coffee  = new Product("кофе", 300);
        ProductBasket basket = new ProductBasket(2);
        basket.add(cheese);
        basket.add(tea);
       basket.printBasket();
        basket.add(coffee);
       boolean search = basket.searchName("сыр");
        System.out.println(search);
       basket.printBasket();
       basket.clear();
       basket.printBasket();
       basket.total();
       search = basket.searchName("помидор");
        System.out.println(search);
        basket.printBasket();

    }
}