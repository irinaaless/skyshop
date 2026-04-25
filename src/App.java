
import article.Article;
import basket.ProductBasket;
import exception.BestResultNotFound;
import product.DiscountedProduct;
import product.FixPriceProduct;
import product.Product;
import product.SimpleProduct;
import search.SearchEngine;
import search.Searchable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket();
        DiscountedProduct cheese = new DiscountedProduct("сыр", 85, 10);
        FixPriceProduct productTwo = new FixPriceProduct("Печенье");
        SimpleProduct productTree = new SimpleProduct("молоко", 94);
        DiscountedProduct productFor = new DiscountedProduct("колбаса", 189, 15);
        SimpleProduct productFife = new SimpleProduct("макароны", 58);

        List<Product> productBasketOne = new LinkedList<>();
        productBasketOne.add(cheese);
        productBasketOne.add(productFife);
        productBasketOne.add(productTwo);
        productBasketOne.add(productFor);
        productBasketOne.add(productTree);
        System.out.println(productBasketOne);
        System.out.println(productBasketOne.get(3));

        productBasket.add(productFife);
        productBasket.add(productTree);
        productBasket.printBasket();
        System.out.println(productBasket.deleteNameProduct("молоко"));

        SearchEngine searchEngineOne = new SearchEngine();
        searchEngineOne.add(cheese);
        searchEngineOne.add(productFife);
        searchEngineOne.add(productTree);
        System.out.println(searchEngineOne.search("сыр"));

        System.out.println();
        System.out.println(("Есть ли огурцы в корзине? " + productBasket.hasProduct("огурцы")));
        System.out.println(("Есть ли сыр в корзине? " + productBasket.hasProduct("сыр")));

        productBasket.clear();
        productBasket.printBasket();

        System.out.println();

        System.out.println("Корзина №2");

        ProductBasket productBasketTwo = new ProductBasket();
        SimpleProduct correct = null;

        try {
            correct = new SimpleProduct("", 0);
        } catch (IllegalArgumentException e){
            System.out.println("ошибка создания SimpleProduct");
        }

        SimpleProduct tea = null;

        try {
            tea  = new SimpleProduct("чай", 35);

        } catch (IllegalArgumentException e){
            System.out.println("ошибка создания SimpleProduct " + e.getMessage());
        }
        if (tea != null){
            System.out.println("Продукт успешно создан: " + tea.getName());
        }
        DiscountedProduct candies = new DiscountedProduct("чай с бергамотом", 89, 10);
        DiscountedProduct coffee = new DiscountedProduct("кофе", 198, 10);

        productBasketTwo.add(tea);
        productBasketTwo.add(candies);
        productBasketTwo.add(coffee);
        productBasketTwo.printBasket();

        SearchEngine searchEngine = new SearchEngine();
        searchEngine.add(candies);
        searchEngine.add(tea);
        searchEngine.add(coffee);



        try {
            searchEngine.bestFoundMatch("хлеб");
        } catch (BestResultNotFound e) {
            System.out.println("не найдено" + " " + e.getMessage());
        }


        Article articleOne = new Article("Новинки автомобилей", "Топ 5 автомобилей 2025");
        Article articleTwo = new Article("Рецепт вкусных блинчиков", "Топ 10 рецептов блинчиков");

        List<Article> searchEnginesTwo = new LinkedList<>();
        searchEnginesTwo.add(articleTwo);
        searchEnginesTwo.add(articleOne);
        System.out.println(searchEnginesTwo);

        List<DiscountedProduct> searchOne = new LinkedList<>();
        searchOne.add(candies);
        searchOne.add(cheese);
        System.out.println(searchOne);
        searchOne.clear();

        searchEngine.add(articleOne);
        searchEngine.add(articleTwo);
        System.out.println(searchEngine.search("Новинки"));

    }
}
