package product;

public class SimpleProduct extends Product{

    private int price;
    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
        if (price <= 0){
            throw new IllegalArgumentException("неверная цена продукта");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Продукт: " + this.getName() + " цена: " + this.price + " руб." + "\n";
    }
}
