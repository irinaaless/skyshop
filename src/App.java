
import article.Article;
import basket.ProductBasket;
import product.DiscountedProduct;
import product.FixPriceProduct;
import product.SimpleProduct;
import search.SearchEngine;
import search.Searchable;

import java.util.Arrays;

public class App {
    public static void main(String[] args){
        SimpleProduct tomato = new SimpleProduct("помидор", 89);
        DiscountedProduct cheeses = new DiscountedProduct("сыр", 423, 5);
        FixPriceProduct milk = new FixPriceProduct("молоко");

        ProductBasket productBasket = new ProductBasket(5);
        productBasket.add(tomato);
        productBasket.add(cheeses);
        productBasket.add(milk);
        productBasket.printBasket();
        System.out.println("=====Проверка=====");
        System.out.println("Поиск 'молоко': " + productBasket.searchName("молоко"));
        productBasket.clear();

        productBasket.printBasket();
        System.out.println("Итого: " + productBasket.total());
        System.out.println("====Пополнение корзины====");
        productBasket.add(cheeses);
        productBasket.add(tomato);
        productBasket.add(milk);
        productBasket.printBasket();
        Article one = new Article("Топ 10 стран для миграции", "Италия, Сербия, Таиланд, Испания, Канада");
        SearchEngine searchEngine = new SearchEngine(5);
        searchEngine.add(one);
        searchEngine.add(cheeses);
        searchEngine.add(tomato);
        Searchable[] result = searchEngine.search("помидор");
        System.out.println("=== Результаты поиска 'помидор' ===");
        for (Searchable item : result) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }
        Searchable[] two = searchEngine.search("молоко");
        Searchable[] three = searchEngine.search("сыр");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.toString(three));

    }
}
