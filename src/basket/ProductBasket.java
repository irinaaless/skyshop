package basket;

import product.Product;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
   private final List<Product> products;
    private int size;

    public ProductBasket(){
        this.products = new LinkedList<>();
        size = 0;
    }
    public void add(Product product) {
        if (product != null) {
            size++;
            products.add(product);
        } else {
            System.out.println("Нельзя добавить null продукт");
        }
    }
    public List<Product> deleteNameProduct(String name){
        List<Product> deleteProduct = new LinkedList<>();
        Iterator iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            if (product.getName().equalsIgnoreCase(name)){
                deleteProduct.add(product);
                iterator.remove();
            }
        }
        return deleteProduct;
    }

    public int total(){
        int sum = 0;
        for (int i = 0; i < size; i++) {
                sum += products.get(i).getPrice();
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
            System.out.println(products.get(i).toString());
            if (products.get(i).isSpecial()){
                count++;
            }
        }
        System.out.println("Итого: " + total());
        System.out.println("Количество специальных товаров " + count);
    }
    public boolean searchName(String name){
        for (int i = 0; i < size; i++) {
            if (products.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean hasProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i < products.size(); i++) {
            products.set(i, null);
        }
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) == null) {
                size = 0;
            }
        }
    }
}
