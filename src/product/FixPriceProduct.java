package product;

public class FixPriceProduct extends Product{
    private final int FIXPRICE = 68;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXPRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "Имя продукта: " + getName() +
                " фиксированная цена: " + FIXPRICE;
    }
}
