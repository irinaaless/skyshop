package product;

public class DiscountedProduct extends Product {
    private int basisPrice;
   private int percent;

    public DiscountedProduct(String name, int basisPrice, int percent) {
        super(name);
        this.basisPrice = basisPrice;
        this.percent = percent;
    }

    @Override
    public int getPrice() {
        return basisPrice* (100 - percent) /100;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "Имя продукта: " + getName() +
                " стоимость без скидки: " + basisPrice +
                " руб., стоимость со скидкой: " + getPrice() + " руб. скидка: " + percent + "%";
    }
}
