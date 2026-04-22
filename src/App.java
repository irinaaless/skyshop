import basket.ProductBasket;

import product.DiscountedProduct;
import product.FixPriceProduct;
import product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        SimpleProduct cheese = new SimpleProduct("сыр", 200);
        SimpleProduct tea = new SimpleProduct("чай", 70);
        SimpleProduct coffee  = new SimpleProduct("кофе", 300);
        ProductBasket basket = new ProductBasket(6);
        basket.add(cheese);
        basket.add(tea);
       basket.printBasket();
        basket.add(coffee);
        System.out.println("Поиск 'сыр' " + basket.searchName("сыр"));
       basket.printBasket();
       basket.clear();
        System.out.println("\n--- Корзина после очистки и наполнения ---");
        basket.printBasket();
        System.out.println("Общая стоимость: " + basket.total() + " руб.");
        System.out.println("Поиск 'помидор' " + basket.searchName("помидор"));
        System.out.println("Пополнение корзины:");
        DiscountedProduct tomato = new DiscountedProduct("помидор", 140, 5);
        DiscountedProduct butter = new DiscountedProduct("масло", 400, 3);
        FixPriceProduct bread = new FixPriceProduct("хлеб");
        basket.add(tomato);
        basket.add(butter);
        basket.add(tea);
        basket.add(cheese);
        basket.add(coffee);
        basket.add(bread);
        basket.printBasket();
        System.out.println("Поиск 'масло': " + basket.searchName("масло"));
        System.out.println("Поиск 'хлеб': " + basket.searchName("хлеб"));

    }
}