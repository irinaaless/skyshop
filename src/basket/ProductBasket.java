package basket;

import product.Product;
import java.util.Arrays;

public class ProductBasket {
    private final Product[] products;
    private int size;

    public ProductBasket(int product){
        products = new Product[product];
        size = 0;
    }
    public void add(Product product){
        for (int i = 0; i < products.length; i++) {

           if (products[i] == null){
              products[i] = product;
              size++;
               return;
           }
        }
        System.out.println("Корзина заполнена! Добавить продукт невозможно!");

    }
    public int total(){
        int sum = 0;
        for (int i = 0; i < size; i++) {
                sum += products[i].getPrice();
        }
        return sum;
    }
    public void printBasket(){
        if (size == 0){
            System.out.println("корзина пустая");
            return;
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].toString());
            if (products[i].isSpecial()){
                count++;
            }
        }
        System.out.println("Итого: " + total());
        System.out.println("Количество специальных товаров " + count);
    }
    public boolean searchName(String name){
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        Arrays.fill(products, null);
        size = 0;
        System.out.println("Корзина очищена");
    }
}
